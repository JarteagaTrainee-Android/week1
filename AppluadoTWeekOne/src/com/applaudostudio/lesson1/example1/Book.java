package com.applaudostudio.lesson1.example1;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void borrowBook(){
        isBorrowed = true;
    }
    public void returnBook(){
        isBorrowed = false;
    }
    public boolean isBookBorrowed(){
        return isBorrowed;
    }
}
