package com.applaudostudio.lesson2.exercise;
import java.util.Scanner;

public class GuessNumberLogic {
    //Ramdin Num
    private int randomNum;

    //Generating a new Random number with the constructor;
    public GuessNumberLogic() {
        this.randomNum= (int) (Math.random()*100) + 1;
    }


    /**
     * Function to ask a number an compare to the random one.
      * @return true of false
     */
    public boolean askNumber(){
        int readedNumber=0;
        int tries=0;
        Scanner scanner = new Scanner(System.in); //init scanner
        do{
            System.out.println("Guess a number between 1-100");
            readedNumber=Integer.parseInt(scanner.nextLine()); //read data from console


            if(isSame(this.randomNum,readedNumber)){
                return true;
            }

            if(this.isGreater(readedNumber)){
                System.out.println("The number you write is greater that the secret");
            }else{
                System.out.println("The number you write is Lower that the secret");
            }


            tries++;
        }while(readedNumber!=this.randomNum && tries<10);


        return  false;

    }

    /**
     * Check if is the random number is the same as the readed
     * @param random random number param
     * @param readed readead form user number
     * @return returns true of false
     */
    private boolean isSame(int random, int readed){
        if(random==readed){
            return true;
        }
        return  false

    }

    /**
     * compare is the number is Greater
     * @param numberReaded
     * @return returns true or false
     */
    private boolean isGreater(int numberReaded){
        if(numberReaded>this.randomNum){
            return true;
        }
        return false;
    }


}
