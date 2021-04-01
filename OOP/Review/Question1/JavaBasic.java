public class JavaBasic{
    public static int sumNegativeElements(int arr[]){
        int s = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0)
                s += arr[i];
        }
        return s;
    }

    public static String uppercaseFirstVowels(String str){
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++){
            boolean c1 = (sb.charAt(i) == 'u' || sb.charAt(i) == 'e' || sb.charAt(i) == 'o' || sb.charAt(i) == 'a' || sb.charAt(i) == 'i');
            boolean c2 = (sb.charAt(i - 1) == ' ');

            if(c1 && c2){
                char item = sb.charAt(i);
                char ITEM = Character.toUpperCase(item);

                sb.setCharAt(i, ITEM);
            }
        }
        return sb.toString();
    }
	
	public static int findMinNegativeElement(int a[]){
        int min = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < min)
                min = a[i];
        }
        return min;
    }
	
	public static String getName(String str){
        String[] temp = str.split(" ");
        String s = "";
        for(int i = 1; i < temp.length; i++){
            s = s + temp[i] + " ";
        }
        return s;
    }

    public static int findFirstMod3Element(int[] a){
        //code here
        for(int i = 0; i < a.length; i++){
            if(a[i] % 3 == 0)
            return a[i];
        }
        return -1;
    }

    public static int countString(String str, String k){
        //code here
        String[] temp = str.split(" ");
        int count = 0;
        for (int i = 0; i < temp.length; i++){
            if(temp[i].equals(k))
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        int[] a = {1,-2,3,4,-2,1,-9};
        String s = "nguyen thi uyen an";
		String s1 = "Name: Le Thi Thu Thao";
        String s2 = "Nguyen Thi Oanh Oanh";
        //Test all of methods which you implemented
        System.out.println(countString(s2, "Oanh"));
        System.out.println(getName(s1));
        System.out.println(sumNegativeElements(a));
    }


}