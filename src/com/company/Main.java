package com.company;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int action;
    static AddressBook book = new AddressBook();

    public static void prompt() {
        System.out.println("""
                Please choose an option:
                                
                (1) Add Contact.
                (2) Search for Contact.
                (3) View Address Book.
                (0) Exit.
                """);
    }

    public static void main(String[] args) {

        prompt();
        int action1 = input.nextInt();
        action = action1;

        while (action != 0) {
            if (action == 1) {
                book.newContact();
                System.out.println("Contact has been added");

            } else if (action == 2) {
                book.searchContact();
            } else if (action == 3) {
                System.out.println(book.toString());

            } else if (action == 0) {
                System.out.println("Good-bye!");
                break;
            }

            prompt();       //Prompts user again after completing option
            int action2 = input.nextInt();
            action = action2;

//        System.out.println("Enter in a name");
//        userName = input.nextLine();
//        if(!(userName.equalsIgnoreCase("end"))) {
//            System.out.println("Enter in an email address");
//            emailAddress = input.nextLine();
//        }
//        while (!(userName.equalsIgnoreCase("end"))) {
//            System.out.println("Enter in a name");
//            userName = input.nextLine();
//            if (!(userName.equalsIgnoreCase("end"))) {
//                System.out.println("Enter in an email address");
//                emailAddress = input.nextLine();
//            }
//
//            PersonInfo person = new PersonInfo(userName, emailAddress);
//            book.addressBook.put(1, person);
//
//            placement++;
//        }
//
//        System.out.println(book.toString());
        }
    }
}
