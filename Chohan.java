//they bet if the sum of two six sided dice is
//Welcome to Cho-Han
//.Welcome to Cho-Han.
//1. Even
//2. Odd
//Select a bet.
//1
//The dice are 1 and 5.
//The sum is 6.
//You win.


import java.util.Scanner;

public class Chohan{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cho-Han.");
        System.out.println("1. Odd");
        System.out.println("2. Even");
        System.out.println("Select a bet");
        int bet = input.nextInt();
        int diceroll1 = (int) (Math.random() * 6 ) + 1;
        int diceroll2 = (int) (Math.random() * 6 ) + 1;
        int score = diceroll1 + diceroll2;


        if ((score % 2) > 0 && (bet % 2) > 0 ){
         System.out.println("The Dice are " + diceroll1 +" and "+ diceroll2 );
         System.out.println("You win.");
        } else if ((score % 2) == 0 && (bet % 2) == 0 ){
         System.out.println("The Dice are " + diceroll1 +" and "+ diceroll2 );
         System.out.println("You win.");
        }else {
           System.out.println("The Dice are " + diceroll1 +" and "+ diceroll2 );
           System.out.println("You Lost.");
        }



    }
}
