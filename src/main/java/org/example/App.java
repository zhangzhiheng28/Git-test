package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String inputStr = scanner.nextLine();
        System.out.println(removeDuplicates(inputStr));
    }

    private static String removeDuplicates(String str) {
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        for(char c : str.toCharArray()) {
            uniqueChars.add(c);
        }

        StringBuilder result = new StringBuilder();
        for(Character c : uniqueChars) {
            result.append(c);
        }
        return result.toString();
    }
}
