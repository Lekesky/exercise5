package com.company;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int action;
    static AddressBook book = new AddressBook();    //Creates the addressbook

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

        while (action != 0) {       //While action does not equal zero, a menu will pop up with actions to select
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

        }
    }
}
