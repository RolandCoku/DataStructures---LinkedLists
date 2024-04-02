public class DoublyListNode <T extends Comparable<T>>{
    public T element;
    public DoublyListNode<T> next;
    public DoublyListNode<T> previous;

    public DoublyListNode(T element){
        this.element = element;
        this.next = null;
        this.previous = null;
    }

    public DoublyListNode(T element, DoublyListNode<T> next, DoublyListNode<T> previous){
        this.element = element;
        this.next = next;
        this.previous = previous;
    }
}
