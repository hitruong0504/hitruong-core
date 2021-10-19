import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void print(ArrayList<Student> students){
        for(Student s: students){
            System.out.println(s);
        }
    }

    public static void sortLinkedList(MyLinkedList<Student> myList){
        Node<Student> curr = myList.getHead(), index = null;
        Student temp = null;

        if(myList.getHead() == null) return;
        else{
            while(curr != null){
                index = curr.getNext();
                boolean isSorted = true;
                while(index != null){
                    if(curr.getData().getAvg() > index.getData().getAvg()){
                        temp = curr.getData();
                        curr.setData(index.getData());
                        index.setData(temp);
                        isSorted = false;
                    }
                    index = index.getNext();
                }
                if(isSorted) return;
                curr = curr.getNext();
            }
        }
    }

    public static void main(String[] args) {

        //TEST: Exercise 1
        SortingAlgorithm sort = new SortingAlgorithm();
        int []array = new int[]{-9, 8, -16, 5, 7, 1, 2};

        sort.bubbleSort(array);

//        sort.printArray(array);

        //TEST: Exercise 2
            // with Array List
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("A", 7.8, 7.5, 7.9));
        students.add(new Student("B", 6.5, 8.1, 8.0));
        students.add(new Student("C", 7.3, 8.2, 7.5));
        students.add(new Student("D", 8.3, 7.5, 8.7));
        students.add(new Student("E", 8.1, 6.7, 9.0));
        students.add(new Student("F", 7.1, 6.4, 6.8));

        Collections.sort(students, new SortByAverageAsc());
        print(students);
//        System.out.println("---------------------------");
//        Collections.sort(students, new SortByAverageDes());
//        print(students);

            // with Linked List
        MyLinkedList<Student> myList = new MyLinkedList<>();

        myList.addLast(new Student("A", 7.8,7.5,7.9));
        myList.addLast(new Student("B", 6.5,8.1,8.0));
        myList.addLast(new Student("C", 7.3,8.2,7.5));
        myList.addLast(new Student("D", 8.3,7.5,8.7));
        myList.addLast(new Student("E", 8.1,6.5,9.0));
        myList.addLast(new Student("F", 7.1,6.4,6.8));


        /*-------------------------------------------*/
//        LinkedList<Student> listLl = new LinkedList<>();
//        listLl.add(new Student("A", 7.8,7.5,7.9));
//        listLl.add(new Student("B", 6.5,8.1,8.0));
//        listLl.add(new Student("C", 7.3,8.2,7.5));
//        listLl.add(new Student("D", 8.3,7.5,8.7));
//        listLl.add(new Student("E", 8.1,6.5,9.0));
//        listLl.add(new Student("F", 7.1,6.4,6.8));




        myList.print();
        sortLinkedList(myList);
        System.out.println("-------------------");
        myList.print();


//        for(Student s: listLl){
//            System.out.print(s + " ");
//        }

        System.out.println();
//        sortLinkedList(myList);
//        Collections.sort(listLl, new SortLinkedList());
//        myList.print();
//        for(Student s: listLl)
//            System.out.print(s + " ");
    }
}
