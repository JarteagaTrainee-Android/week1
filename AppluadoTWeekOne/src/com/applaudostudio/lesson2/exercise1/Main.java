package com.applaudostudio.lesson2.exercise1;

public class Main {

    public static void main(String[] args) {
        GuessNumberLogic game = new GuessNumberLogic();

        if(game.askNumber(10)){
            System.out.println("YOU HAVE WON :D ");

        }else{
            System.out.println("DOH!! You Lose");

        }


    }
}
