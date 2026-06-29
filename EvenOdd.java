import java.util.Scanner;


public class EvenOdd{
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

    }
}
