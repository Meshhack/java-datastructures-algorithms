import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name");
        String name = input.nextiLine();
        System.out.printf("Hello "+ name + ".");



    }
}
