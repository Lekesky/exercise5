package com.company;

import java.util.Scanner;

public class PersonInfo {       //Creates the person, name and email gets added
    private String name;
    private String email;

    public PersonInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return " Name='" + name + '\'' +
                ",Email='" + email + '\'';
    }
}
