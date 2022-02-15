package com.company;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String userName;
    static String emailAddress;
    static int placement;
    public static void main(String[] args) {
        System.out.println("Enter in a name");
        userName = input.nextLine();
        if(!(userName.equalsIgnoreCase("end"))) {
            System.out.println("Enter in an email address");
            emailAddress = input.nextLine();
        }
        while (!(userName.equalsIgnoreCase("end"))) {
            System.out.println("Enter in a name");
            userName = input.nextLine();
            if (!(userName.equalsIgnoreCase("end"))) {
                System.out.println("Enter in an email address");
                emailAddress = input.nextLine();
            }
            Person person = new Person(userName, emailAddress);
            System.out.println();
            placement++;
        }

    }
}
