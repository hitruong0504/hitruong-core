import java.util.*;

public class MyLinkedList<E> implements ListInterface<E> {
    
    private Node<E> head;
    private int numNode;

    public MyLinkedList() {
        this(null, 0);
    }

    /*
    public MyLinkedList(){
        this.head = null;
        this.numNode = 0;
    }
    */

    @Override

    public void addFirst(E item) {
        head = new Node<E>(item, head);
        numNode++;
    }

    public void addAfter(Node<E> curr, E item) {
        if (curr == null) { 
            addFirst(item);
        } else {
            Node<E> newNode = new Node<E>(item, curr.getNext());
            curr.setNext(newNode);
        }
        numNode++;
    }

    public void addLast(E item) {
        if (head == null) { // is list empty?
            addFirst(item); 
        } else {
            Node<E> tmp = head;

            //find the element last in the list
            while (tmp != null) {
                tmp = newNode.getNext();
            }

            Node<E> newNode = new Node<E>(item, null);
            tmp.setNext(newNode);
            numNode++;
        }
    }

}
