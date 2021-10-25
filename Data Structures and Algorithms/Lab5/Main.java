public class Main {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();

//        list.addFirst(2);
//        list.addFirst(3);
//        list.addFirst(4);
//        list.addFirst(6);
//        list.addFirst(9);
//        list.addFirst(10);
//        list.addFirst(21);
//        list.addFirst(57);
//        list.addFirst(111);
//
//        list.print();
//        list.removeAt(9);
//        list.print();
//        System.out.println(list.countOdd());
//        System.out.println(list.searchKey(2));
//        System.out.println(list.checkSorted());

//        StackAndQueue p = new StackAndQueue();
//        System.out.println(p.calculate("9 2 - 6 * 7 + 7 /"));
//        System.out.println(p.isPalindrome(1221));
//        System.out.println(p.reverseString("I like apple"));

        Recursion r = new Recursion();
        //exercis 1
//        System.out.println(r.pro_recur(2, 5));
//        System.out.println(r.bin2dec(1010, 0));
//        System.out.println(r.maxDigit(123654));
//        int []a = new int[]{1, 51, 8, 9, -10, 11, 15};
//        System.out.println(r.maxElement(a, a.length));
//        System.out.println(r.search(a, a.length, 100));
        //exercise 2
//        System.out.println(r.sumA(5));
//        System.out.println(r.sumB(5));
//        System.out.println(r.sumC(9));
//        System.out.println(r.sumD(6));
//        System.out.println(r.factorial(6));
        //exercise 3
            //a
//        System.out.println(r.itera_a(9));
//        System.out.println(r.recur_a(9));
//            //b
//        System.out.println(r.itera_b(1234));
//        System.out.println(r.recur_b(1234));
//            //c
//        System.out.println(r.itera_c(3, 9));
//        System.out.println(r.recur_c(3, 9));
//            //d
//        System.out.println(r.itera_d(7));
//        System.out.println(r.recur_d(7));
        //exercise 4
        Sort s = new Sort();
        int a[] = new int[]{2, 1, 5, -10, 15, 99, -100};
//        s.selection(a);
//        s.bubble(a);
//        s.insertion(a);
        s.print(a);
    }
}
