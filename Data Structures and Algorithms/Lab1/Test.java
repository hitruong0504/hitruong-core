public class Test {
    

    public static void main(String[] args) {
        // MyLinkedList<Fraction> list = new MyLinkedList<Fraction>();

        // list.addFirst(new Fraction());
        // list.addLast(new Fraction(1, 2));
        // list.addFirst(new Fraction(3, 5));

        // list.print();
        // System.out.println(list.size());



        MyLinkedList<Integer> myList = new MyLinkedList<Integer>();

        myList.addFirst(new Integer(3));
        myList.addFirst(new Integer(4));
        myList.addFirst(new Integer(6));
        myList.addFirst(new Integer(5));
        myList.addFirst(new Integer(7));
        myList.addFirst(new Integer(11));
        myList.addFirst(new Integer(8));

        myList.print();
        // int a = myList.countEvenNumber();
        // System.out.println(a);
        
        // System.out.println(myList.countPrimeNumbers());
        // myList.addBeforeFirstEvenNumber(1);
        // myList.print();

        // System.out.println(myList.maxNumbeOflist());

        // myList.reverse();
        myList.sort();
        myList.print();
    }
}
