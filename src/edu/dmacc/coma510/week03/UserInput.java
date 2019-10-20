package edu.dmacc.coma510.week03;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = in.nextLine();

        System.out.print("Please enter your last name: ");
        String lastName = in.nextLine();

        System.out.print("How old are you: ");
        int age = in.nextInt();

        System.out.print("What is your desired salary: ");
        double salary = in.nextDouble();

        System.out.println(String.format("Hello %s %s, your are %d years old and desire to make $%f per year.", firstName, lastName, age, salary));
        in.close();
    }
}
