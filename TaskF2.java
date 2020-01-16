package com.company;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TaskF2 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\Daria\\Desktop\\r.txt");
        Scanner scanner = new Scanner(reader);
        int wordCount = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            boolean inWord = false;
            int letterC = 0;
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (Character.isLetter(ch)) {
                    if (!inWord) {
                        inWord = true;
                        letterC = 0;
                    }
                    if (ch == 'r') {
                        letterC++;
                        if (letterC == 3) {
                            wordCount++;
                        }
                    }
                } else if (inWord) {
                    inWord = false;
                }
            }
        }
        System.out.println(wordCount);
    }
}
