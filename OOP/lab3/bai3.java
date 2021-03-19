import java.util.Scanner;

public class bai3 {
    static String input() {
        System.out.print("Nhap ho va ten: ");
        Scanner sc = new Scanner(System.in);
        String fullname = sc.nextLine();
        return fullname;
    }

    //. tach ho, ten
    static String firstandlast(String name) {
        String[] temp = name.split(" ");

        String firstname = temp[0];
        String lastname = temp[temp.length - 1];

        return firstname + " " + lastname;
    }

    //.. tach ten dem
    static String middlename(String name) {
        String[] temp = name.split(" ");
        String a = "";
        for (int i = 1; i < temp.length - 1; i++) {
            a += temp[i] + " ";
        }
        return a;
    }

    //...cap nhat chuoi
    static String capitalizeFullName(String fullname) {
        StringBuilder builder  = new StringBuilder(fullname);
        
        for(int i = 0; i < builder.length(); i++)
        {
            boolean dk1 = (i==0);
            boolean dk2 = (i > 0) && (builder.charAt(i - 1) == ' ');

            if(dk1 || dk2)
            {
                char item = builder.charAt(i);
                char ITEM = Character.toUpperCase(item);

                builder.setCharAt(i, ITEM);
            }

        }
        return builder.toString();
    }
    //....viet thuong phu am co trong chuoi
    static String upandlow(String s){
        s = s.toUpperCase();
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < builder.length(); i++) {
            boolean dk = (builder.charAt(i) == 'U' || builder.charAt(i) == 'E' || builder.charAt(i) == 'O' || builder.charAt(i) == 'A' || builder.charAt(i) == 'I');
            
            if (dk) {
                char item = builder.charAt(i);
                char ITEM = Character.toLowerCase(item);

                builder.setCharAt(i, ITEM);
            }
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        String fullname = input();
        System.out.print("Ho, ten sau khi tach: ");
        System.out.print(firstandlast(fullname));
        System.out.println();
        System.out.print("Ten dem: ");
        System.out.print(middlename(fullname));
        System.out.println();
        System.out.println(capitalizeFullName(fullname));
        System.out.println(upandlow(fullname));
    }
}