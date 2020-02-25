package com.company;

// Mubarik Abdi 2/25/20

public class Main {

    public static void main(String[] args) {

        Contacts person1 = new Contacts("Joey", "FriendsIsTheBest@fakemail.com");

        BussinessContacts person2 = new BussinessContacts("John", "normalRealGuY@fakemail.com", "614-242-1991");

        person1.display();
        System.out.println("---------------------------------------");
        person2.display();

    }
}
