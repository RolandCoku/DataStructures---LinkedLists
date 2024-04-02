public class ListNode <T extends Comparable<T>> {
    public T element;
    public ListNode<T> next;

    public ListNode(T element){
        this.element = element;
        this.next = null;
    }

    public ListNode(T element, ListNode<T> next){
        this.element = element;
        this.next = next;
    }

}
