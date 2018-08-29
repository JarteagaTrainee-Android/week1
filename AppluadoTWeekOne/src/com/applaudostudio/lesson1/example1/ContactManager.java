package com.applaudostudio.lesson1.example1;

public class ContactManager {
    // Fields:
    Contact [] myFriends;
    int friendsCount;

    //Constructor
    public ContactManager() {
        this.myFriends=new Contact[500];
        this.friendsCount=0;
    }

    void addContact(Contact contact){
        this.myFriends[this.friendsCount]=contact;
        this.friendsCount++;
    }

    Contact searchContact(String searchName) {


        for(int i=0;i<this.friendsCount;i++){
            if(this.myFriends[i].name.equals(searchName)){
                return  this.myFriends[i];
            }
        }
        return null;
    }



}
