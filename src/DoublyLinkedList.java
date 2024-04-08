public class DoublyLinkedList <T extends Comparable<T>>{
    public DoublyListNode<T> header;
    public DoublyListNode<T> trailer;
    public DoublyLinkedList(){
        header = new DoublyListNode<>(null);
        trailer = new DoublyListNode<>(null);
        header.next = trailer;
        trailer.previous = header;
    }
    public static <T extends Comparable<T>> void printList(DoublyLinkedList<T> list){
        if(list.header.next == list.trailer){
            System.out.println("Empty list!");
        }else{
            DoublyListNode<T> currentNode = list.header.next;
            System.out.print("[ ");
            while (currentNode != list.trailer){
                System.out.print(currentNode.element+" ");
                currentNode = currentNode.next;
            }
            System.out.println("]");
        }
    }
    public DoublyListIterator<T> zeroth(){
        return new DoublyListIterator<>(this.header);
    }
    public DoublyListIterator<T> first(){
        return new DoublyListIterator<>(this.header.next);
    }
    public DoublyListIterator<T> last(){
        return new DoublyListIterator<>(trailer.previous);
    }

    public void insertAtBeginning(T newElement){
        this.header.next = new DoublyListNode<>(newElement,this.header.next,this.header);
    }

    public void insert(T newElement, DoublyListIterator<T> position){
        if(position != null && position.isValid()){
            position.current.next = new DoublyListNode<>(newElement,position.current.next,position.current.previous);
            position.current.next.previous = position.current.next;
        }
    }

    public int getSize(){
        int size = 0;
        for (DoublyListIterator<T> iterator = this.first(); iterator.current != trailer; iterator.advance()){
            size++;
        }
        return size;
    }

//**********************************************************************************************************************
//EXERCISES
//9. Ndertoni nje funksion qe kthen mbrapsht nje liste te lidhur pa perdorur liste te re. Lista eshte:
//b. dydrejtimore
//d. dydrejtimore rrethore
    public void reverseDoublyLinkedList(){
        DoublyListNode<T> currentNode = this.header.next;
        DoublyListNode<T> previousNode = this.trailer;
        DoublyListNode<T> nextNode;

        while (currentNode != trailer){

            nextNode = currentNode.next;

            currentNode.next = previousNode;
            previousNode.previous = currentNode;
            currentNode.previous = nextNode;

            previousNode = currentNode;
            currentNode = nextNode;
        }

        this.header.next = previousNode;
        previousNode.previous = header;
    }

//10. Ndertoni nje funksion qe kthen true nqs nje liste e lidhur eshte palindrome dhe false ne te kundert. Lista eshte:
//b. dydrejtimore
//d. dydrejtimore rrethore

    public boolean doublyIsPalindrome(){
       DoublyListIterator<T> startIterator = this.first();
       DoublyListIterator<T> endIterator = this.last();

       while (startIterator.current != endIterator.current && startIterator.current.previous != endIterator.current){
           if(!startIterator.current.element.equals(endIterator.current.element))
               return false;
           startIterator.advance();
           endIterator.previous();
       }

       return true;
    }

// 11. Ndertoni nje funksion qe shton nje element ne nje liste te lidhur te renditur pa prishur renditjen. Lista eshte:
//b. dydrejtimore
//d. dydrejtimore rrethore
    public void DoublyInsertSorted(T newElment){
        DoublyListIterator<T> iterator = this.first();
        while (iterator.current != trailer && iterator.current.element.compareTo(newElment) < 0){
            iterator.advance();
        }
        this.insert(newElment, iterator);
    }

// 12. Shkruani funksionin qe nderron vendet e dy elementeve fqinje ne liste. Lista eshte:
//b. lidhur dy drejtimore

    public void doublySwapNeighbors(){
        DoublyListIterator<T> iterator = this.zeroth();

        while (iterator.current.next != trailer && iterator.current.next.next != trailer){
            DoublyListNode<T> tempNode1 = iterator.current.next;
            DoublyListNode<T> tempNode2 = iterator.current.next.next;

            tempNode1.next = tempNode2.next;
            tempNode2.next = tempNode1;

            iterator.current.next = tempNode2;

            tempNode2.previous = tempNode1.previous;
            tempNode1.previous = tempNode2;
            tempNode2.next.previous = tempNode1;

            iterator.current.previous = tempNode1;


            iterator.advance();
            iterator.advance();
        }
    }

//14. Në kodin e DoublyLinkedList implementoni një metodë shtonëfund që shton nyje te reja në fund të listës.
    public void insertAtTheEnd(T newElement){
        DoublyListNode<T> newNode = new DoublyListNode<>(newElement,trailer,trailer.previous);
        trailer.previous.next = newNode;
        trailer.previous = newNode;
    }

//**********************************************************************************************************************
//1. Shkruani funksionin qe fshin nga nje liste te gjitha nyjet me vlere nje numer cift. Lista eshte:
//b. e lidhur dydrejtimore
    public void deleteEvenElements(){
        DoublyListIterator<T> iterator = this.first();
        while (iterator.current != trailer){
            if(((Integer)iterator.current.element) % 2 == 0) {
                iterator.current.previous.next = iterator.current.next;
                iterator.current.next.previous = iterator.current.previous;
            }
            iterator.advance();
        }
    }
//6. Ndertoni nje funksion qe fshin dublikatat nga nje liste e lidhur
//b. dydrejtimore
    public void deleteDuplicates(){
        DoublyListIterator<T> iterator1 = this.first();
        while (iterator1.current != trailer){
            DoublyListIterator<T> iterator2 = new DoublyListIterator<>(iterator1.current.next);
            while (iterator2.current != trailer){
                if(iterator1.current.element.equals(iterator2.current.element)){
                    iterator2.current.previous.next = iterator2.current.next;
                    iterator2.current.next.previous = iterator2.current.previous;
                }
                iterator2.advance();
            }
            iterator1.advance();
        }
    }

//8. Ndertoni nje funksion qe ndan nje liste L pergjysem. Gjysma e pare e L te ruhet ne L1 dhe gjysma e dyte ne L2.
//   Nqs numri i elementeve te L eshte tek atehere L1 do te kete nje element me shume se L2.
//   L1 dhe L2 jane lista te lidhura njedrejtimore.
//b. Lista L eshte e lidhur dydrejtimore rrethore
    public void splitList() {
        DoublyLinkedList<T> list1 = new DoublyLinkedList<>();
        DoublyLinkedList<T> list2 = new DoublyLinkedList<>();
        DoublyListIterator<T> iterator1 = this.first();
        DoublyListIterator<T> iterator2 = list1.zeroth();
        DoublyListIterator<T> iterator3 = list2.zeroth();

        while (iterator1.current != trailer) {
            iterator2.current.next = new DoublyListNode<>(iterator1.current.element, iterator2.current.next, iterator2.current);
            iterator2.current.next.next.previous = iterator2.current.next;
            iterator1.advance();
            if (iterator1.current != trailer) {
                iterator3.current.next = new DoublyListNode<>(iterator1.current.element, iterator3.current.next, iterator3.current);
                iterator3.current.next.next.previous = iterator3.current.next;
                iterator1.advance();
            }
            iterator2.advance();
            iterator3.advance();
        }

    }

}
