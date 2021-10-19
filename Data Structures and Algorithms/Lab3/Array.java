public class Array {
    //exercise 6
    //a
    public static int findMin(int []a, int n){
        int min = a[0];
        for(int i = 1; i < n; i++){
            if (min > a[i]) min = a[i];
        }
        return min;
    }
    //b
    public static int sumOfArray(int []a, int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }
    //c
    public static int countEvenNumber(int []a, int n){
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] % 2 == 0) counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        int []a = {7, 4, 5, 1, 9, 16};
        //a
        System.out.println(findMin(a, a.length));
        //b
        System.out.println(sumOfArray(a, a.length));
        //c
        System.out.println(countEvenNumber(a, a.length));
    }
}
