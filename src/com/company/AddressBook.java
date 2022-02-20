package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    private String name;
    private String email;
    static Scanner input = new Scanner(System.in);
    static int placement;
    public HashMap<Integer, PersonInfo> addressBook = new HashMap<>();


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void newContact(){
        System.out.println("Enter name");
        name = input.nextLine();
        System.out.println("Enter email");
        email = input.nextLine();
        PersonInfo person = new PersonInfo(name, email);
        placement++;
        addressBook.put(placement, person);

    }



    public void searchContact(){
        System.out.println("Search for name");
        String searchName = input.nextLine();
        System.out.println("There Email is: " ); //Need to be able to search for person's email by looking up name in addressbook
    }

    @Override
    public String toString() {
        return "AddressBook: " +
                 addressBook;
    }
}
