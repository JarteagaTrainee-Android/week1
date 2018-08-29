package com.applaudostudio.lesson2.exercise1;

import java.util.Scanner;

public class GuessNumberLogic {
    //Ramdin Num
    private int randomNum;

    /***
     * Generating random number in the constructor.
     */
    public GuessNumberLogic() {
        this.randomNum = (int) (Math.random() * 100) + 1;
    }


    /**
     * Function to ask a number an compare to the random one.
     *
     * @return true of false
     */
    public boolean askNumber(int lives) {
        int readedNumber = 0;
        int tries = 0;

        Scanner scanner = new Scanner(System.in); //init scanner
        do {
            System.out.println();
            System.out.println("Guess a number between 1-100");
            readedNumber = Integer.parseInt(scanner.nextLine()); //read data from console


            if (isSame(this.randomNum, readedNumber)) {
                return true;
            }
            tries++;
            if (this.isGreater(readedNumber)) {
                System.out.println("The number you write is greater that the secret (" + randomNum + ") Lives:" + (lives - tries));
            } else {
                System.out.println("The number you write is Lower that the secret(" + randomNum + ") Lives:" + (lives - tries));
            }


        } while (readedNumber != this.randomNum && tries < lives);


        return false;// if you lose all your lives

    }

    /**
     * Check if is the random number is the same as the readed
     *
     * @param random random number param
     * @param read   readead form user number
     * @return returns true of false
     */
    private boolean isSame(int random, int read) {
        return random == read;
    }

    /**
     * compare is the number is Greater
     *
     * @param numberReaded
     * @return returns true or false
     */
    private boolean isGreater(int numberReaded) {
        return numberReaded > this.randomNum;
    }


}
