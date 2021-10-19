public interface ListInterface<E> {
    
    void addFirst(E item); 
    
    void addAfter(Node<E> curr, E item);

    void addLast(E item);

    E removeFirst();

    E removeAfter(Node<E> curr);

    E removeLast();

    int size();

    boolean contains(E item);

    boolean isEmpty();

    Node<E> getHead();

    E getFirst();
    
    void print();

    public E removeCurr(Node<E> curr);

    public void addSortedList(E item);
}
