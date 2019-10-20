package edu.dmacc.coma510.week03;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = askUserFor("Please enter a number: ", in);
        int num2 = askUserFor("Please enter a number: ", in);
        int num3 = askUserFor("Please enter a number: ", in);

        int max = Math.max(Math.max(num1, num2), num3);
        System.out.println(String.format("%d was the largest number you entered.", max));

        int anotherMax = Methods.maxValue(num1, num2, num3);
        System.out.println(String.format("Calling method: %d was the largest number you entered.", anotherMax));

        in.close();
    }

    public static int askUserFor(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int maxValue(int n1, int n2, int n3) {
        return Math.max(Math.max(n1, n2), n3);
    }

    public static float maxValue(float n1, float n2, float n3) {
        return Math.max(Math.max(n1, n2), n3);
    }

    public static double maxValue(double n1, double n2, double n3) {
        return Math.max(Math.max(n1, n2), n3);
    }
}
