public class MyQueue<E> implements QueueInterface<E> {
    //attribute
    MyLinkedList<E> list;
    //constructor
    public MyQueue(){
        this.list = new MyLinkedList<>();
    }

    @Override
    //offer: add an element to the end of the queue.
    public void enQueue(E item) {
        list.addLast(item);
    }

    @Override
    //poll: removes an element from the top of the queue and return it.
    public E deQueue() {
        return list.removeFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean contain(E item) {
        return list.contains(item);
    }

    @Override
    public void print() {
        list.print();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E getFront() {
        return list.getFirst();
    }
}
