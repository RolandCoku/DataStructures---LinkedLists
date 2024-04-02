public class LinkedListIterator <T extends Comparable<T>>{
    ListNode<T> current;
    private ListNode<T> listHeader;
    public LinkedListIterator(){
        this.current = null;
    }
    public LinkedListIterator(ListNode<T> current){
        this.current = current;
    }
    public LinkedListIterator(ListNode<T> current, ListNode<T> listHeader){
        this.current = current;
        this.listHeader = listHeader;
    }
    public boolean isValid(){
        return current != null;
    }

    public boolean isValidCircular(){
        return !current.equals(listHeader);
    }

    public boolean nextIsValid(){
        return current.next != null;
    }

    public T retrive(){
        if(isValid()){
            return current.element;
        }else {
            return null;
        }
    }

    public T retriveCircular(){
        if (isValidCircular()){
            return current.element;
        }else {
            return null;
        }
    }

    public void advance(){
        if(isValid())
            this.current = current.next;
    }

    public void advanceCircular(){
        if (isValidCircular())
            this.current = current.next;
    }
}
