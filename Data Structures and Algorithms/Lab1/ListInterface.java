public interface ListInterface<E> {
    
    void addFirst(E item); 
    
    void addAfter(SNode<E> curr, E item);

    void addLast(E item);

    E removeFirst();

    E removeAfter(SNode<E> curr);

    E removeLast();

    int size();

    boolean contains(E item);

    boolean isEmpty();

    SNode<E> getHead();

    E getFirst();
    
    void print();

    public E removeCurr(SNode<E> curr);
}
