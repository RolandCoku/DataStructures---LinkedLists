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
}
