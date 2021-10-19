public class TestEx8 {

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addFirst(new Integer(9));
        list.addFirst(new Integer(6));
        list.addFirst(new Integer(18));
        list.addFirst(new Integer(20));
        list.addFirst(new Integer(3));
        list.addFirst(new Integer(50));

        list.print();
        System.out.println(list.countEvenNumber());
        list.addSortedList(10);
        //list.sort();
        list.print();
        System.out.println(list.sumOfList());
    }
}
