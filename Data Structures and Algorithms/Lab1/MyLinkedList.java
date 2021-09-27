import java.util.*;

public class MyLinkedList<E> implements ListInterface<E> {
    
    private Node<E> head;
    private int numNode;


    public MyLinkedList() {
        this.head = null;
        this.numNode = 0;
    }

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
        if (head == null) {
            addFirst(item);
        } else {
            Node<E> tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            Node<E> newNode = new Node<E>(item);
            tmp.setNext(newNode);
            numNode++;
        }
    }

    public E removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Cannot remove element from an empty list");
        } else {
            Node<E> tmp = head;
            head = head.getNext();
            numNode--;
            return tmp.getData();
        }
    }

    public E removeAfter(Node<E> curr) throws NoSuchElementException {
        if (curr == null) {
            throw new NoSuchElementException("Cannot remove element from an empty list");
        } else {
            Node<E> delNode = curr.getNext();
            if (delNode != null) {
                curr.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            } else {
                throw new NoSuchElementException("No next node to remove");
            }
        }
        
    }

    public E removeLast() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Cannot remove element from an empty list");
        } else {
            Node<E> prev = null;
            Node<E> delNode = head;
            while (delNode.getNext() != null) {
                prev = delNode;
                delNode = delNode.getNext();
            }
            prev.setNext(delNode.getNext());
            delNode.setNext(null);
            numNode--;
            return delNode.getData();
        }
    }

    public int size() {
        return numNode;
    }

    public boolean contains(E item) {
        Node<E> tmp = head;
        while (tmp != null) {
            if (tmp.getData().equals(item)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isEmpty() {
        return numNode == 0;
    }
    
    public Node<E> getHead() {
        return head;
    }

    public E getFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Cannot get element from an empty list");
        } else {
            return head.getData();
        }
    }
    
    public void print() {
        if (head != null) {
            Node<E> tmp = head;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while (tmp != null) {
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        } else {
            System.out.println("List is empty");
        }
    }
    
    // exercise 2
    public E removeCurr(Node<E> curr) {
        if (curr == null)
            return null;

        if (isEmpty())
            return null;

        if (size() == 1)
            return removeFirst();

        if (head.getData().equals(curr.getData()))
            return removeFirst();

        Node<E> runner = head;
        while (runner.getNext() != null && !runner.getNext().getData().equals(curr.getData())) {
            runner = runner.getNext();
        }
        if (runner.getNext().getData().equals(curr.getData())) {
            runner.setNext(curr.getNext());
            numNode--;
            return curr.getData();
        }
        return null;
    }
    
    // exercise 3.a
    public int countEvenNumber() {
        if (head == null) {
            return 0;
        } else {
            Node<E> tmp = head;
            int count = 0;
            while (tmp != null) {
                if (tmp.getData() instanceof Integer) {
                    int value = (Integer) tmp.getData();
                    if (value % 2 == 0) {
                        count++;
                    }
                }
                tmp = tmp.getNext();
            }
            return count;
        }
    }

    // exercise 3.b

    private boolean isPrime(int value) {
        if (value <= 1)
            return false;

        if (value == 2)
            return true;
        
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimeNumbers() {
        if (head == null) {
            return 0;
        } else {
            Node<E> tmp = head;
            int count = 0;
            while (tmp != null) {
                if (tmp.getData() instanceof Integer) {
                    int value = (Integer) tmp.getData();
                    if (isPrime(value)) {
                        count++;
                    }
                }
                tmp = tmp.getNext();
            }
            return count;
        }
    }

    // exercise 3.c
    public void addBeforeFirstEvenNumber(E value) {
        Node<E> runner = head;
        Node<E> prev = null;
        while (runner != null) {
            if (runner.getData() instanceof Integer) {
                int tmp = ((Integer) runner.getData());
                if (tmp % 2 == 0) {
                    Node<E> newNode = new Node<E>(value, runner);
                    if (prev == null) {
                        this.addFirst(value);
                    } else {
                        prev.setNext(newNode);
                        numNode++;
                    }
                    return;
                }
            }
            prev = runner;
            runner = runner.getNext();
        }
    }

    //exercise 3.d
    public int maxNumbeOflist() {
        int max = 0;
        if (head == null) {
            return 0;
        } else {
            Node<E> tmp = head;
            if (head.getData() instanceof Integer) {
                max = ((Integer) tmp.getData());
                tmp = tmp.getNext();
            }
            while (tmp != null) {
                if (tmp.getNext() != null) {
                    int tmp1 = (Integer) tmp.getNext().getData();
                    if (max < tmp1) {
                        max = tmp1;
                    }
                }
                tmp = tmp.getNext();
            }
        }
        return max;
    }
    
    //exercise 3.*.1
    public void reverse() {
        Node<E> prev = null;
        Node<E> curr = head;
        Node<E> next = null;

        while (curr != null) {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //exercise 3.*.2
    public void sort() {
        Node<E> current = head;
        for (int i = 0; i < numNode - 1; i++) {
            Node<E> currentNext = current;
            for (int j = i + 1; j < numNode; j++) {
                currentNext = currentNext.getNext();
                if ((current.getData() instanceof Integer) && (currentNext.getData() instanceof Integer)) {
                    int tmp = (Integer) current.getData();
                    int tmp1 = (Integer) currentNext.getData();
                    if (tmp < tmp1) {
                        E tmp2 = currentNext.getData();
                        currentNext.setData(current.getData());
                        current.setData(tmp2);
                    }
                }
                current.getNext();
            }
        }
    }
}