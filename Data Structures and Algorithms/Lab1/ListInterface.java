import java.util.*;

public interface ListInterface<E> {
    
    //add
    public void addFirst(E item);

    public void addAfter(Node<E> curr, E item);

    public void addLast(E item);

    //remove
    public E removeFirst(E item) throws NoSuchElementException;

    public E removeAfter(E item) throws NoSuchElementException;

    public E removeLast(E item) throws NoSuchElementException;
    
    //other
    public void print();

    public boolean isEmpty();
    
    public E getFirst() throws NoSuchElementException;

    public Node<E> getHead();

    public int size();

    public boolean contains(E item);
    
}