package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    private String name;
    private String email;
    static Scanner input = new Scanner(System.in);
    static int placement;
    public HashMap<String, String> addressBook = new HashMap<>();


    public void newContact(){
        System.out.println("Enter name");
        name = input.nextLine();
        System.out.println("Enter email");
        email = input.nextLine();
//        PersonInfo person = new PersonInfo(name, email);
        placement++;
        addressBook.put(name, email);

    }



    public void searchContact(){
//        PersonInfo person = new PersonInfo(name, email);
        System.out.println("Search for name");
        String i = input.nextLine();
        String getEmailAddress = String.valueOf(addressBook.get(i));
        System.out.println("There Email is: " + getEmailAddress); //Need to be able to search for person's email by looking up name in addressbook
    }

    @Override
    public String toString() {
        return "AddressBook: " +
                 addressBook;
    }
}
