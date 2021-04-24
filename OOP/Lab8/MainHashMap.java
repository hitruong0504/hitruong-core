package Lab8;

import java.util.*;

public class MainHashMap {

    public static String Check(HashMap<String, String> dictionary, String str) {
        if (dictionary.containsKey(str)) {
            return "Exist";
        }
        return "No exist";
    }

    public static String FindMeaning(HashMap<String, String> dictionary, String str) {
        if (dictionary.containsKey(str)) {
            return dictionary.get(str);
        }
        return "No exist";
    }

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();

        dictionary.put("Hello", "Xin chao");
        dictionary.put("Student", "Hoc sinh");
        dictionary.put("Book", "Sach");
        dictionary.put("Teacher", "Giang vien");
        dictionary.put("university", "Dai hoc");
        dictionary.put("Pen", "But");
        dictionary.put("Bye", "Tam biet");
        dictionary.put("Good luck", "Chuc may man");
        dictionary.put("Dictionary", "Tu dien");

        String temp = Check(dictionary, "bye");
        System.out.println(temp);

        String temp1 = FindMeaning(dictionary, "Bye");
        System.out.println(temp1);

        
    }
}
