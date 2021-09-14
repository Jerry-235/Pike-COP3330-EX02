/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 jeremiah pike
 */



import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word : ");

        String message = scanner.nextLine();

        System.out.println(message + " Has a length of: " + message.length());
    }
}
