package org.example;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Practice {
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int choice = scn.nextInt();
        switch (choice) {
            case 1:
                int ans1 = multiply(a, b);
                System.out.println("Multiplication of two numbers is: " + ans1);
                break;
            case 2:
                int ans2 = sum(a, b);
                System.out.println("Sum of two numbers is: " + ans2);
                break;
            case 3:
                int ans3 = sub(a, b);
                System.out.println("Subtraction of two numbers is: " + ans3);
                break;
            default:
                System.out.println("Wrong choice");

        }
    }

}