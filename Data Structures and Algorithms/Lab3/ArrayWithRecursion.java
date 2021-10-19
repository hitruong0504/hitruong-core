public class ArrayWithRecursion {
    //exersice 7
    //a
    private static int findMin(int []a, int firstIndex) {
        if (a.length < 0) return 0;
        if (firstIndex + 1 == a.length) return a[firstIndex];

        int n = a[firstIndex];
        int m = findMin(a, firstIndex + 1);

        if (n < m) return n;
        return m;
    }

    public static int findMin(int []a){
        return findMin(a, 0);
    }

    //b
    private static int sum(int []a, int n){
        if(n <= 0) return 0;
        else return a[n - 1] + sum(a, n - 1);
    }

    public static int sum(int []a){
        return sum(a, a.length);
    }
    //c
    private static int countEvenNumber(int []a, int firstIndex){
        if (a.length < 0) return 0;
        if(firstIndex == a.length) return 0;
        int result = 0;
        if(a[firstIndex]% 2 == 0) result = 1;
        else result = 0;
        return result + countEvenNumber(a, firstIndex + 1);
    }

    public static int countEvenNumber(int []a){
        return countEvenNumber(a, 0);
    }


    public static void main(String[] args) {
        int []a = new int[]{9, -13, 5, 6, 12, 15, 7};
        //a: find min
        System.out.println(findMin(a));
        //b: compute sum
        System.out.println(sum(a));
        //c: count even number
        System.out.println(countEvenNumber(a));
    }
}
