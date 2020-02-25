package com.company;

/**
 * Created by 102693 on 2/25/2020.
 */
public class BussinessContacts extends Contacts{

    private String phoneNumber;

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
