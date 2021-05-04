package Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Program {

    public static ArrayList<String> readFile(String path) {
        ArrayList<String> lines = new ArrayList<String>();
        File file = new File(path);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lines.add(line);
            }
            sc.close();
            return lines;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFile(ArrayList<String> data, String path) throws IOException {
        try {
            FileWriter writer = new FileWriter(path);
            int i = 0;
            for (String line : data) {
                writer.write(line.toUpperCase());
                if (i++ != data.size() - 1) {
                    writer.write(System.lineSeparator());
                }
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ArrayList<String> read = readFile("C:\\Practice\\Java\\OOP\\src\\Lab9\\input.txt");

        try {
            writeFile(read, "C:\\Practice\\Java\\OOP\\src\\Lab9\\output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}