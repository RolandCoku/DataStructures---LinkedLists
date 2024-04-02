public class DoublyListIterator <T extends Comparable<T>>{
    DoublyListNode<T> current;

    public DoublyListIterator(){
        this.current = null;
    }
    public DoublyListIterator(DoublyListNode<T> current){
        this.current = current;
    }

    public boolean isValid(){
        return current != null;
    }
    public T retrive(){
        if(this.isValid()){
           return current.element;
        }else
            return null;
    }
    public void advance(){
        if(this.isValid()){
            current = current.next;
        }
    }
    public void previous(){
        if(this.isValid()){
            current = current.previous;
        }
    }

}
