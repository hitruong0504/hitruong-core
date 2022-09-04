package com.hitruong;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.validator.routines.UrlValidator;

public class App 
{
    public static void main( String[] args )
    {
        if (args.length != 1) {
            System.out.println("Please specify an URL to a file");
            return;
        }

        String url = args[0];
        String[] temp = url.split("/");
        String fileName = temp[temp.length - 1];
        UrlValidator validator = new UrlValidator();

        if (!validator.isValid(url)) {
            System.out.println("This is not a valid URL!!!");
            return;
        }

        try {
            URL src = new URL(url);
            // File destination = new File("C:\\Users\\hitru\\github\\hitruong-core\\Java Technology\\Lab1\\ex4\\" + fileName);
            File destination = new File("../" + fileName);
            System.out.println("Downloading...");
            FileUtils.copyURLToFile(src, destination, 2000, 2000);
            System.out.println("Download successful!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
