package com.company;

// this is the contact class

public class Contacts {

    private String name;
    private String emailAddress;

    public Contacts(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmailAddress());

    }



}
