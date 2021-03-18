        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i])
                return i + 1;
            else
                return -1;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 0, 1, 3, 5, 7, 9, 11, 12, 14, 16 };
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(k + " thuoc vi tri thu " + count(k, arr) + " trong mang");
    }
}
