public class Sort {

    public Sort(){}

    //Selection Sort: choose minimum element
    public void selection(int []a){
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if(a[minIndex] > a[j]) minIndex = j;
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }

    public void bubble(int []a){
        for (int i = 1; i < a.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < a.length - 1; j++) {
                if(a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    isSorted = false;
                }
            }
            if(isSorted) return;
        }
    }
    
    public void insertion(int []a){
        for (int i = 1; i < a.length; i++) {
            int next = a[i];
            int j;
            for (j = i - 1; j >= 0 && a[j] > next ; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = next;
        }
    }

    public void print(int []a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
