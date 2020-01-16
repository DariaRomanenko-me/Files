package com.company;

import java.io.*;
import java.util.Scanner;

public class TaskF1 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\Daria\\Desktop\\r.txt");
        Scanner scanner = new Scanner(reader);
        int count = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 'r')
                    count++;
            }
        }
        reader.close();
        System.out.println(count);
    }
}
