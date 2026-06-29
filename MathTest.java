import java.util.Scanner;

public class MathTest{
    public static void main(String[] args){
        Scanner radius = new Scanner(System.in);
        System.out.println("Please input radius");
        double r = radius.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("Area of Circle is %.2f", area);

    }
}
