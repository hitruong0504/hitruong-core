public class PriorityQueue {
    private Person []heap;
    private int maxSize;
    private int heapSize;

    public PriorityQueue(int capacity){
        this.maxSize = capacity + 1;
        this.heapSize = 0;
        this.heap = new Person[maxSize];
        this.heap[0] = null;
    }

    private int parent(int i){
        return i/2;
    }

    private int left(int i){
        return 2 * i;
    }

    private int right(int i){
        return 2 * i + 1;
    }

    private void swap(int i, int j){
        Person temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void enQueue(Person key){
        if (heapSize == maxSize){
            throw new RuntimeException("Maximun capcity");
        }
        heapSize += 1;
        heap[heapSize] = key;

        shiftUp(heapSize);
    }

    private void shiftUp(int i){
        while(i > 1 && heap[parent(i)].priority < heap[i].priority){
            swap(parent(i), i); //this method you have defined before
            i = parent(i);
        }
    }

    public Person deQueue(){
        if(heapSize == 0){
            throw new RuntimeException("The heap is empty");
        }
        Person max = heap[1];
        heap[1] = heap[heapSize];
        heapSize -= 1;
        shiftDown(1);
        return max;
    }

    private void shiftDown(int i){
        while(i <= heapSize){
            Person max = heap[i];
            int max_id = i;
            if(left(i) <= heapSize && max.priority < heap[left(i)].priority){
                max = heap[left(i)];
                max_id = left(i);
            }
            if(right(i) <= heapSize && max.priority < heap[right(i)].priority){
                max = heap[right(i)];
                max_id = right(i);
            }
            if(max_id != i){
                swap(max_id ,i);
                i = max_id;
            }
            else{
                break;
            }
        }
    }

    public void print(){
        for (int i = 1; i <= heapSize ; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
