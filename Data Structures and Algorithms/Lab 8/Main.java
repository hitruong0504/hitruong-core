import java.util.Arrays;

public class Main{

    public static void heapSortAcsending(int []a){
        MinHeap heap = new MinHeap(a.length);
        for (int i = 0; i < a.length; i++) {
            heap.insert(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = heap.extractMin();
        }
    }

    public static void heapSortDesending(int []a){
        MaxHeap heap = new MaxHeap(a.length);
        for (int i = 0; i < a.length; i++) {
            heap.insert(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = heap.extractMax();
        }
    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(20);

        heap.insert(8);
        heap.insert(2);
        heap.insert(19);
        heap.insert(-6);
        heap.insert(7);
        heap.insert(11);
        heap.insert(2);
        heap.insert(5);

        heap.print();


        int a[] = {15, 23, 18, 63, 21, 35, 36, 21, 66, 12, 42, 35, 75, 23, 64, 78, 39};

//        System.out.println(Arrays.toString(a));

//        System.out.println("-------------------");

        heapSortAcsending(a);
//        System.out.println(Arrays.toString(a));

//        System.out.println("-------------------");

        heapSortDesending(a);
//        System.out.println(Arrays.toString(a));

        PriorityQueue myQueue = new PriorityQueue(100);

        myQueue.enQueue(new Person("Alex", 3));
        myQueue.enQueue(new Person("Bob", 2));
        myQueue.enQueue(new Person("David", 6));
        myQueue.enQueue(new Person("Susan", 1));

        System.out.println(myQueue.deQueue());

        myQueue.enQueue(new Person("Mike", 5));
        myQueue.enQueue(new Person("Kevin", 4));

        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());

        myQueue.enQueue(new Person("Helen", 0));
        myQueue.enQueue(new Person("Paul", 8));
        myQueue.enQueue(new Person("Iris", 7));

        System.out.println(myQueue.deQueue());
    }
}