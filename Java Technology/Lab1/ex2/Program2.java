import vn.edu.tdtu.*;

public class Program2 {
    public static void main(String[] args) {
        // Initialize two arbitrary one-dimensional arrays
        int a[] = { 1, 5, -9, 99, 10, 56 };
        int b[] = { 6, -96, 14, 4, 0, 7, 2, 3 };
        
        // Print these two arrays to console
        ArrayOutput.print(a);
        ArrayOutput.print(b);
        // Merge these two arrays and assign the result to array c 
        int c[] = ArrayHandler.merge(a, b);
        // Print array c to the console
        ArrayOutput.print(c);
        // Merge these two arrays and assign the result to array c 
        ArrayHandler.sort(c);
        // Print array c to the console
        ArrayOutput.print(c);
        // Write the contents of the array c to the file output.txt
        ArrayOutput.write(c, "output.txt");
    }
}
