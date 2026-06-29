import java.util.Scanner;

public class Binet{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("input your n number to calculate: ");
        int fn = n.nextInt();
        double speciala =  Math.pow(((1 + Math.sqrt(5)) / 2), fn);
        double specialb =  Math.pow(((1 - Math.sqrt(5)) / 2), fn);
        double specialc =  1 / Math.sqrt(5);
        int sequence =  Math.round(specialc * (speciala-specialb));
        System.out.println("The value of the nth Fibonacci number is  " + sequence );





    }
}
