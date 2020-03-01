package com.company;

// this is the class that derives from the Contact class

public class BussinessContacts extends Contacts{

    private String phoneNumber;

    // the keyword "super" is used to relate to the constructor properties in the contact class.
    public BussinessContacts(String name, String emailAddress, String phoneNumber) {
        super(name, emailAddress);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phone Number: " + getPhoneNumber());

    }
}
