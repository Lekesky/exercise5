package com.company;

import java.util.HashMap;

public class AddressBook {
    HashMap<Integer, Person> addressBook = new HashMap();

    public AddressBook(HashMap<Integer, Person> addressBook) {
        this.addressBook = addressBook;
    }

    public HashMap<Integer, Person> getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(HashMap<Integer, Person> addressBook) {
        this.addressBook = addressBook;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "addressBook=" + addressBook +
                '}';
    }
}
