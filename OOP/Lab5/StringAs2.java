package Lab5;

public class StringAs2 {
    //a: dem so tu trong doan.
    public static int countWords(String par) {
        int count = 0;
        String[] temp = par.split(" ");
        for (int i = 0; i < temp.length; i++) {
            count++;
        }
        return count;
    }
    //b: dem so cau trong doan van.
    public static int countSentences(String par) {
        int count = 0;
        String[] temp = par.split(".");
        for (int i = 0; i < temp.length; i++) {
            count++;
        }
        return count;
    }
    //c: dem so tu word trong doan.
    public static int countAppear(String par, String word) {
        int count = 0;
        String[] temp = par.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals(word)) {
                count++;
            }
        }
        return count;
    }
    //d: viet ham main.
    public static void main(String[] args) {
        String par = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        System.out.println(countWords(par));
        System.out.println(countSentences(par));
        System.out.println(countAppear(par, "is"));
    }
}
