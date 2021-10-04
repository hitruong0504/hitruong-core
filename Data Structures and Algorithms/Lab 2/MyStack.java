public class MyStack<E> implements StackInterface<E> {

    //attributes
    MyLinkedList<E> myList;
    /*
    private Node<E> top;
    private int numNode;
    */
    //constructor
    public MyStack(){
        this.myList = new MyLinkedList<>();
    }

    @Override
    public void push(E item) {
        myList.addFirst(item);
    }

    @Override
    public E pop() {
        return myList.removeFirst();
    }

    @Override
    public int size() {
        return myList.size();
    }

    @Override
    public boolean contains(E item) {
        return myList.contains(item);
    }

    @Override
    public void print() {
        myList.print();
    }

    @Override
    public boolean isEmpty() {
        return myList.isEmpty();
    }

    @Override
    public E getPeek() {
        return myList.getFirst();
    }
}
