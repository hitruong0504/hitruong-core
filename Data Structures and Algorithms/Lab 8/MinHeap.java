public class MinHeap {
    private int []heap;
    private int maxSize;
    private int heapSize;

    public MinHeap(int capacity){
        this.maxSize = capacity + 1;
        this.heapSize = 0;
        this.heap = new int[maxSize];
        this.heap[0] = -1;
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
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int key){
        if (heapSize == maxSize){
            throw new RuntimeException("Maximun capcity");
        }
        heapSize += 1;
        heap[heapSize] = key;

        shiftUp(heapSize);
    }

    private void shiftUp(int i){
        while(i > 1 && heap[parent(i)] > heap[i]){
            swap(parent(i), i); //this method you have defined before
            i = parent(i);
        }
    }

    public int extractMin(){
        if(heapSize == 0){
            throw new RuntimeException("The heap is empty");
        }
        int min = heap[1];
        heap[1] = heap[heapSize];
        heapSize -= 1;
        shiftDown(1);
        return min;
    }

    private void shiftDown(int i){
        while(i <= heapSize){
            int min = heap[i];
            int min_id = i;
            if(left(i) <= heapSize && min > heap[left(i)]){
                min = heap[left(i)];
                min_id = left(i);
            }
            if(right(i) <= heapSize && min > heap[right(i)]){
                min = heap[right(i)];
                min_id = right(i);
            }
            if(min_id != i){
                swap(min_id ,i);
                i = min_id;
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
