public class SortingAlgorithm {


    //1. selection sort
    public void selectionSort(int []a){
        for(int i = 0; i < a.length - 1; i++) {
            int MIN_INDEX = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[MIN_INDEX]) MIN_INDEX = j;

            int temp = a[MIN_INDEX];
            a[MIN_INDEX] = a[i];
            a[i] = temp;
        }
    }

    //2 bubble sort
    public void bubbleSort(int []a){
        for (int i = 1; i < a.length; i++) {
            boolean isSorted = true;
            for(int j = 0; j < a.length - 1; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) return;
        }
    }

    //3 insertion sort
    public void insertionSort(int []a){
        for(int i = 1; i < a.length; i++){
            int next = a[i];
            int j;
            for(j = i - 1; j >= 0 && a[j] > next; j--){
                a[j + 1] = a[j];
            }
            a[j + 1] = next;
        }
    }

    //4 Merge sort
    private void merge(int[]a, int i, int mid, int j){
        int []temp = new int[j - i + 1];
        int left = i, right = mid + 1, it = 0;

        while (left <= mid && right <= j){
            if(a[left] <= a[right]){
                temp[it++] = a[left++];
            }else
                temp[it++] = a[right++];
        }

        while(left <= mid) temp[it++] = a[left++];
        while(right <= j) temp[it++] = a[right++];

        for (int k = 0; k < temp.length; k++) {
            a[i + k] = temp[k];
        }
    }

    public void mergeSort(int []a, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    //5 Quick sort
    private int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // i = 0, j = a.length - 1
    public void quickSort(int arr[], int low, int high){
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    //6 Radix sort
    //size = a.length
    private int getMax(int []a, int size){
        int max = a[0];
        for (int i = 0; i < size; i++) {
            if(a[i] > max) max = a[i];
        }
        return max;
    }

    private void countingSort(int []a, int size, int place){
        //create an array out put with size + 1 element
        int []output = new int[size + 1];
        //find max value in an array
        int max = getMax(a, size);
        //create an array with 10 element stand for 0 -> 9
        int []count = new int[10];


        //calculate count of element
        for (int i = 0; i < size; i++) {
            count[(a[i] / place) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0 ; i--) {
            output[count[(a[i] / place) % 10] - 1] = a[i];
            count[(a[i] / place) % 10]--;
        }

        for (int i = 0; i < size; i++) {
            a[i] = output[i];
        }
    }

    public void radixSort(int []a, int size){
        int max = getMax(a, size);

        for (int place = 1; max / place > 0; place *= 10) {
            countingSort(a, size, place);
        }
    }

    public void printArray(int []a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
