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
    // adđ

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
    
    // remove
    
    public E removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
            //return null;
        } else {
            Node<E> tmp = head;
            head = head.getNext();
            numNode--;
            return head.getData();
        }
    }

    public E removeAfter(Node<E> cur) throws NoSuchElementException {
        if (cur == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            Node<E> delNode = cur.getNext();
            if (delNode != null) {
                cur.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            } else {
                throw new NoSuchElementException("No next node to remove");
            }
        }
    }
    
    public E removeLast() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            Node<E> prevNode = null;
            Node<E> delNode = head;
            while (delNode.getNext() != null) {
                prevNode = delNode;
                delNode = delNode.getNext();
            }
            prevNode.setNext(delNode.getNext());
            delNode.setNext(null);
            numNode--;
            return delNode.getData();
        }
    }

    //print
    public void print() {
        if (head == null) {
            System.out.println("List is empty!!!");
        } else {
            Node<E> tmp = head;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while (tmp != null) {
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        numNode = 0 ? true : false;
    }

    public E getFirst() throws NoSuchElementException {

        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            return head.getData();
        }
    }
    
    public Node<E> getHead() {
        return this.head;
    }

    
    public int size() {
        return this.numNode;
    }

    public boolean contains(E item) {
        Node<E> tmp = head;
        while (tmp != null) {
            if (tmp.getData().equals(item)) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }
}
