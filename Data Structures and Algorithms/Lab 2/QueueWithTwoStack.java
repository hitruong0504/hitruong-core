public class QueueWithTwoStack<E> implements QueueInterface<E> {
    //attributes
    private MyStack<E> in;
    private MyStack<E> out;
    private int num;

    //constructors
    public QueueWithTwoStack(){
        this.in = new MyStack<>();
        this.out = new MyStack<>();
        this.num = 0;
    }
    @Override
    public void enQueue(E item) {
        in.push(item);
        num++;
    }

    @Override
    public E deQueue() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        E tmp = null;
        if(!out.isEmpty()){
            tmp = out.pop();
            num--;
        }
        return tmp;
    }

    @Override
    public int size() {
        return num;
    }

    @Override
    public boolean contain(E item) {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.contains(item);
    }

    @Override
    public void print() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        out.print();
    }

    @Override
    public boolean isEmpty() {
        return num == 0;
    }

    @Override
    public E getFront() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.getPeek();
    }
}
