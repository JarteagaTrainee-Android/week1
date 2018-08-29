package com.applaudostudio.lesson2.example1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your address: ");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        System.out.println("You live at: " + address);

    }
}
