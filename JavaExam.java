import java.util.Scanner;

public class JavaExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Word: ");
        String word = input.nextLine();
        while (word.length() <=6 ){
            if ( word.equals("nitwit") || word.equals("blubber") || word.equals("oddment") || word.equals("tweak")) {
                System.out.println("You have entered a valid word: " + word);
                break;
            } else {
                System.out.println("You have entered an invalid word: " + word);
                System.out.print("Enter your Word: ");
                word = input.nextLine();
                
                
        }
    }
}}
