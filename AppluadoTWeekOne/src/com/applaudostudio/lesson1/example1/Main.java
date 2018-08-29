package com.applaudostudio.lesson1.example1;

public class Main {
    public static void main(String[] args) {
        ContactManager myContactManager = new ContactManager();
        Contact contacto1 = new Contact();
        contacto1.name="Jose";
        contacto1.phoneNumber="2222-2222";
        Contact contacto2 = new Contact("Karla","Mail2","3333-3333");
        Contact contacto3 = new Contact("Juan","Mail3","6666-6666");

        myContactManager.addContact(contacto1);
        myContactManager.addContact(contacto2);
        myContactManager.addContact(contacto3);


        Contact result = myContactManager.searchContact("Jose");

        System.out.println(result.phoneNumber);


    }
}
