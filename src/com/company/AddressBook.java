package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    static Scanner input = new Scanner(System.in);
    private String name;
    private String email;
    static int placement;
    public HashMap<String, PersonInfo> addressBook = new HashMap<>();       //K: Person's name V: PersonInfo (Name, Email)


    public void newContact(){       //Prompt user to enter name and email when adding a new contact
        System.out.println("Enter name");
        name = input.nextLine();
        System.out.println("Enter email");
        email = input.nextLine();
        PersonInfo person = new PersonInfo(name, email);
        placement++;
        addressBook.put(person.getName(), person);

    }



    public void searchContact(){        //Searches for person name and matches it with person's email
        PersonInfo person = new PersonInfo(name, email);
        System.out.println("Search for name");
        String i = input.nextLine();
        String getEmailAddress = String.valueOf(addressBook.get(i).getEmail());
        System.out.println("There Email is: " + getEmailAddress);
    }

    @Override
    public String toString() {
        return "AddressBook: " +
                addressBook;
    }
}