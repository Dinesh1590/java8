package practise;

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class FileExample {
    public static void copyData(File file1, File file2) throws Exception {
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);
        try {
            int i;
            while ((i = inputStream.read()) != -1) {

                outputStream.write(i);
            }
        } catch (Exception e) {
            System.out.println("Error Found: " + e.getMessage());
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        System.out.println("File Copied");
    }

  public  static void main(String[] args) throws Exception {

        File a = new File("filename");
        File b = new File("text");
        copyData(a, b);
    }
}