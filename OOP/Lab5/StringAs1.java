package Lab5;

public class StringAs1 {
    //a: rut gon ho ten.
    public static String shortName(String str) {
        String[] temp = str.split(" ");

        String firstName = temp[0];
        String lastName = temp[temp.length - 1];

        return lastName + " " + firstName;
    }
    //b: tao hagtag cho ten.
    public static String hagtagName(String str) {
        String[] temp = str.split(" ");

        String firstName = temp[0];
        String lastName = temp[temp.length - 1];

        return "#" + lastName + firstName;
    }
    //c: Viet hoa tat ca nguyen am trong chuoi.
    public static String upperCaseAllVowel(String str) {
        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            boolean condition = (sb.charAt(i) == 'u' || sb.charAt(i) == 'e' || sb.charAt(i) == 'o'
                    || sb.charAt(i) == 'a' || sb.charAt(i) == 'i');
            if (condition) {
                char item = sb.charAt(i);
                char ITEM = Character.toUpperCase(item);

                sb.setCharAt(i, ITEM);
            }
        }
        return sb.toString();
    }
    //d: in hoa tat ca chu n trong chuoi
    public static String upperCaseAllN(String str) {
        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            boolean condition = (sb.charAt(i) == 'n');
            if (condition) {
                char item = sb.charAt(i);
                char ITEM = Character.toUpperCase(item);

                sb.setCharAt(i, ITEM);
            }
        }
        return sb.toString();
    }
    //e: viet ham public static void main(String[] args) {
    public static void main(String[] args) {
        System.out.println(shortName("Truong Anh Hi"));
        System.out.println(hagtagName("Truong Anh Hi"));
        System.out.println(upperCaseAllVowel("Truong Anh Hi"));
        System.out.println(upperCaseAllN("Truong Anh Hi"));
    } 
    
}
