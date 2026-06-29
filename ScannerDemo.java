import java.util.Scanner;

public class ScannerDemo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input Start Url");
        String name = input.nextLine();
        System.out.printf("Scanning Port " + name + " Port 8008");


    }
}
