import java.util.Scanner;


public class EvenOdd{

     public static int Cards(int n, int face){
            int sum = 0;
            for (int i = 0; i < n; i++){
                sum += (int)(Math.random() * face) + 1;
            }
            return sum;
        }


        
    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        System.out.println("Please input the whole digit: ");
        int k = num1.nextInt();
        double m = k % 2;

        if ( m > 0 ){
            System.out.println("This Number is Odd") ;
        } else {
            System.out.println("This Number is Even") ;
        }

        System.out.println("Please input the number of cards: ");
        int n = num1.nextInt();
        System.out.println("Please input the number of faces: ");
        int face = num1.nextInt();
        int sum = Cards(n, face);
        System.out.println("The sum of the cards is: " + sum);  
       
        
    }
}   
            
