import java.util.Scanner;

class bai4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String s = sc.nextLine();
        //4.1
        int length = s.length();
        System.out.println("Chuoi co do dai la: " + length);
        //4.2
        String[] temp = s.split(" ");
        int count = 0;
        for (int i = 0; i <= temp.length - 1; i++) {
            count++;
        }
        System.out.println("Chuoi nhap vao co " + count + " tu");
        //4.3
        System.out.print("Nhap chuoi can noi vao chuoi cho truoc: ");
        String s2 = sc.nextLine();
        System.out.println(s + " " + s2);
        //4.4
        String a, b = "";
        System.out.print("nhap chuoi muon kiem tra doi xung: ");
        a = sc.nextLine();
        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b)){
            System.out.println("La chuoi doi xung");
        }else{
            System.out.println("Khong la chuoi doi xung");
        }
    }
}