import java.util.Random;

public class Test<T> {
    public static void main(String[] args){

////**********************************************************************************************************************
////TEST SINGLY LINKED LIST
//
//        //Create list and add elements
//        LinkedList<Integer> integerLinkedList = new LinkedList<>();
//        LinkedListIterator<Integer> iterator = integerLinkedList.zeroth();
//        int i = 0;
//        while (i<10){
//            Random random = new Random();
//            int randomInt = random.nextInt(100);
//            integerLinkedList.insert(randomInt,iterator);
//            iterator.advance();
//            i++;
//        }
//
//        LinkedList.printList(integerLinkedList);
//
//        //Create list and add elements
//        LinkedList<Integer> integerLinkedList1 = new LinkedList<>();
//        LinkedListIterator<Integer> iterator1 = integerLinkedList1.zeroth();
//        int j = 0;
//        while (j<10){
//            integerLinkedList1.insert(j,iterator1);
//            iterator1.advance();
//            j++;
//        }
//
//        //Find sum of elements
//        System.out.println("Sum of elements:");
//        System.out.println(LinkedList.findSum(integerLinkedList));
//        //Get size of list
//        System.out.println("Size of list:");
//        System.out.println(integerLinkedList.getSize());
//        //Get element at index
//        System.out.println("Element at index 5:");
//        System.out.println(integerLinkedList.getNodeElement(5));
//        //Delete element of value
//        System.out.println("After deleting 7:");
//        integerLinkedList.delete(7);
//        LinkedList.printList(integerLinkedList);
//        //Insert element at index
//        System.out.println("After inserting 7 at index 7:");
//        integerLinkedList.insert(7,7);
//        LinkedList.printList(integerLinkedList);
//
//        //Count nodes between
//        System.out.println("Count nodes between 4 and 9:");
//        System.out.println(integerLinkedList1.countNodesBetween(4,9));
//        LinkedListIterator<Integer> position1 = integerLinkedList1.find(4);
//        LinkedListIterator<Integer> position2 = integerLinkedList1.find(9);
//        System.out.println("Nodes between position1 and position2: ");
//        System.out.println(integerLinkedList1.countNodesBetween(position1,position2));
//
//        //Move max and min to beginning and end
//        integerLinkedList.moveMaxMin();
//        System.out.println("After moving max and min:");
//        LinkedList.printList(integerLinkedList);
//
//
//        LinkedList<Integer> integerLinkedList2 = new LinkedList<>();
//        LinkedListIterator<Integer> iterator2 = integerLinkedList2.zeroth();
//        int k = 5;
//        while (k<9){
//            integerLinkedList2.insert(k,iterator2);
//            iterator2.advance();
//            k++;
//        }
//
//        LinkedList<Integer> randomList = new LinkedList<>();
//        LinkedListIterator<Integer> iterator3 = randomList.zeroth();
//        int l = 4;
//        while (l<10){
//            Random random = new Random();
//            int randomInt = random.nextInt(10);
//            randomList.insert(randomInt,iterator3);
//            iterator3.advance();
//            l++;
//        }
//
//        System.out.println("List 1:");
//        LinkedList.printList(integerLinkedList1);
//        System.out.println("List 2:");
//        LinkedList.printList(integerLinkedList2);
//        System.out.println("Random list:");
//        LinkedList.printList(randomList);
//        System.out.println("After deleting all elements of randomList from list 1:");
//        integerLinkedList1.deleteAll(randomList);
//        LinkedList.printList(integerLinkedList1);
//        System.out.println("Before deleting elements of list 2 from list 1");
//        LinkedList.printList(integerLinkedList1);
//        LinkedList.printList(integerLinkedList2);
//        System.out.println("After deleting all elements of list 2 from list 1:");
//        integerLinkedList1.deleteAllSorted(integerLinkedList2);
//        LinkedList.printList(integerLinkedList1);
//        System.out.println("Reversing list 1:");
//        integerLinkedList1.reverseLinkedList();
//        LinkedList.printList(integerLinkedList1);
//
//        System.out.println("Creating palindrome list:");
//        LinkedList<Integer> palindromeList = new LinkedList<>();
//        LinkedListIterator<Integer> iterator4 = palindromeList.zeroth();
//        int m = 0;
//        while (m<5){
//            palindromeList.insert(m,iterator4);
//            iterator4.advance();
//            m++;
//        }
//        while (m>0){
//            m--;
//            palindromeList.insert(m,iterator4);
//            iterator4.advance();
//        }
//        LinkedList.printList(palindromeList);
//        System.out.println("Is palindrome: "+palindromeList.isPalindrome());
//        LinkedList.printList(integerLinkedList1);
//        System.out.println("Is palindrome: "+integerLinkedList1.isPalindrome());
//
//        System.out.println("Before inserting 6:");
//        LinkedList.printList(integerLinkedList2);
//        System.out.println("After inserting 6:");
//        integerLinkedList2.insertSorted(6);
//        LinkedList.printList(integerLinkedList2);
//
//        System.out.println("Before swapping:");
//        LinkedList.printList(integerLinkedList2);
//        integerLinkedList2.swapNeighbors();
//        System.out.println("After swapping:");
//        LinkedList.printList(integerLinkedList2);
//
//        System.out.println("Making circular:");
//        integerLinkedList2.makeCircular();

//**********************************************************************************************************************
//TEST DOUBLY LINKED LIST
//
//            //Create list and add elements
//            DoublyLinkedList<Integer> integerDoublyLinkedList = new DoublyLinkedList<>();
//            DoublyListIterator<Integer> iterator = new DoublyListIterator<>(integerDoublyLinkedList.header);
//            int i = 0;
//            while (i<10){
//                integerDoublyLinkedList.insert(i,iterator);
//                iterator.advance();
//                i++;
//            }
//            System.out.println("List:");
//            DoublyLinkedList.printList(integerDoublyLinkedList);
//            System.out.println("Reversed list:");
//            integerDoublyLinkedList.reverseDoublyLinkedList();
//            DoublyLinkedList.printList(integerDoublyLinkedList);
//
//            integerDoublyLinkedList.reverseDoublyLinkedList();//Per testim te insertSorted
//
//
//        System.out.println("Creating palindrome doubly list:");
//        DoublyLinkedList<Integer> palindromeDoublyList = new DoublyLinkedList<>();
//        DoublyListIterator<Integer> iterator4 = palindromeDoublyList.zeroth();
//        int m = 0;
//        while (m<5){
//            palindromeDoublyList.insertAtTheEnd(m);
//            iterator4.advance();
//            m++;
//        }
//        while (m>0){
//            m--;
//            palindromeDoublyList.insertAtTheEnd(m);
//            iterator4.advance();
//        }
//        DoublyLinkedList.printList(palindromeDoublyList);
//        System.out.println("Is palindrome: "+palindromeDoublyList.doublyIsPalindrome());
//
//        System.out.println("Before inserting 6:");
//        DoublyLinkedList.printList(integerDoublyLinkedList);
//        System.out.println("After inserting 6:");
//        integerDoublyLinkedList.DoublyInsertSorted(6);
//        DoublyLinkedList.printList(integerDoublyLinkedList);
//
//        System.out.println("Before swapping:");
//        DoublyLinkedList.printList(integerDoublyLinkedList);
//        integerDoublyLinkedList.doublySwapNeighbors();
//        System.out.println("After swapping:");
//        DoublyLinkedList.printList(integerDoublyLinkedList);


//TEST CIRCULAR LINKED LIST

//        LinkedList<Integer> circularntegerLinkedList = new LinkedList<>();
//        LinkedListIterator<Integer> iterator2 = circularntegerLinkedList.zeroth();
//        int k = 1;
//        while (k<9){
//            circularntegerLinkedList.insert(k,iterator2);
//            iterator2.advance();
//            k++;
//        }
//        circularntegerLinkedList.makeCircular();
//        System.out.println("List before reversing: ");
//        LinkedList.printCircularList(circularntegerLinkedList);
//        circularntegerLinkedList.reverseCircularLinkedList();
//        System.out.println("List after reversing: ");
//        LinkedList.printCircularList(circularntegerLinkedList);
//
//
//        System.out.println("A palindrome list: ");
//        LinkedList<Integer> palindromeCircularList = new LinkedList<>();
//        LinkedListIterator<Integer> iterator3 = palindromeCircularList.zeroth();
//        int l = 0;
//        while (l<5){
//            palindromeCircularList.insert(l,iterator3);
//            iterator3.advance();
//            l++;
//        }
//        while (l>0){
//            l--;
//            palindromeCircularList.insert(l,iterator3);
//            iterator3.advance();
//        }
//        palindromeCircularList.makeCircular();
//        LinkedList.printCircularList(palindromeCircularList);
//        System.out.println("Is palindrome: "+palindromeCircularList.isPalidromeCircular());
//        System.out.println("A non palindrome list: ");
//        LinkedList.printCircularList(circularntegerLinkedList);
//        System.out.println("Is palindrome: "+circularntegerLinkedList.isPalidromeCircular());
//
//        System.out.println("Before inserting 6:");
//        circularntegerLinkedList.reverseCircularLinkedList();
//        LinkedList.printCircularList(circularntegerLinkedList);
//        circularntegerLinkedList.insertSortedCircular(6);
//        System.out.println("After inserting 6:");
//        LinkedList.printCircularList(circularntegerLinkedList);


//**********************************************************************************************************************
//LAB TESTING

//
//        System.out.println("List with repeating elements: ");
//        LinkedList<Integer> repeatingList = new LinkedList<>();
//        LinkedListIterator<Integer> iterator4 = repeatingList.zeroth();
//        int m = 0;
//        while (m<5){
//            repeatingList.insert(m,iterator4);
//            iterator4.advance();
//            m++;
//        }
//        while (m>2){
//            m--;
//            repeatingList.insert(m,iterator4);
//            iterator4.advance();
//        }
//        while (m<7){
//            repeatingList.insert(m,iterator4);
//            iterator4.advance();
//            m++;
//        }
//        LinkedList.printList(repeatingList);
//        System.out.println("Removing repeating elements: ");
//        repeatingList.deleteDublicates();
//        LinkedList.printList(repeatingList);

        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedListIterator<Integer> iterator = list.zeroth();
        int i = 0;
        while (i<10){
            list.insert(i,iterator);
            iterator.advance();
            i++;
        }
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedListIterator<Integer> iterator1 = list1.zeroth();
        int j = 0;
        while (j<8){
            if(j%2 == 0){
                list1.insert(j,iterator1);
                iterator1.advance();
            }
            j++;
        }

        System.out.println("Lists to merge: ");
        LinkedList.printList(list);
        LinkedList.printList(list1);
        System.out.println("Merged list: ");
        list.mergeAndStore(list1);
        LinkedList.printList(list);

        LinkedList<Integer> listToSplit = new LinkedList<Integer>();
        LinkedListIterator<Integer> iterator2 = listToSplit.zeroth();
        int k = 0;
        while (k<11){
            Random random = new Random();
            int randomInt = random.nextInt(100);
            listToSplit.insert(randomInt,iterator2);
            iterator2.advance();
            k++;
        }

        System.out.println("List to split: ");
        LinkedList.printList(listToSplit);
        System.out.println("Split: ");
        listToSplit.splitEvenOdd();
        System.out.println("Split in half: ");
        listToSplit.splitInHalf();
        System.out.println("Split and sort: ");
        listToSplit.splitEvenOddAndSort();

//Test EXTRA EXERCISES

        LinkedList<Integer> elemntList = new LinkedList<Integer>();
        LinkedListIterator<Integer> elementIterator = elemntList.zeroth();
        int l = 0;
        while (l<10){
            Random random = new Random();
            int randomInt = random.nextInt(100);
            elemntList.insert(randomInt,elementIterator);
            elementIterator.advance();
            l++;
        }
        LinkedList<Integer> positionList = new LinkedList<Integer>();
        LinkedListIterator<Integer> positionIterator = positionList.zeroth();
        int m = -6;
        while (m<10){
            if(m%2 != 0){
                positionList.insert(m,positionIterator);
                positionIterator.advance();
            }
            m++;
        }
        System.out.println("List: ");
        LinkedList.printList(elemntList);
        System.out.println("Position list: ");
        LinkedList.printList(positionList);
        System.out.println("Only position list specified elements on list: ");
        elemntList.printSpecifiedPositions(positionList);

        System.out.println("Elements to convert to binary: ");
        LinkedList.printList(list1);
        list1.convertElementsToBinary();

        LinkedList.printList(LinkedList.createListOutOfInt(1234));

        DoublyLinkedList<Integer> integerDoublyLinkedList = new DoublyLinkedList<>();
        DoublyListIterator<Integer> doublyListIterator = integerDoublyLinkedList.zeroth();
        int h = 0;
        while (h<10){
            integerDoublyLinkedList.insert(h,doublyListIterator);
            doublyListIterator.advance();
            h++;
        }
        DoublyLinkedList.printList(integerDoublyLinkedList);
        integerDoublyLinkedList.doublySwapNeighbors();
        DoublyLinkedList.printList(integerDoublyLinkedList);
        integerDoublyLinkedList.deleteEvenElements();
        DoublyLinkedList.printList(integerDoublyLinkedList);
    }



}
