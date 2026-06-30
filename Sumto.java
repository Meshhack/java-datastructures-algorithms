public class Sumto {
    public static void main(String[] args){

        int sum = 0;
        for (int i = 1; i<=100; i++){

            if (i % 2 != 0) {
                continue; // Skip even numbers
            }
            sum += i;

            System.out.println("The sum of numbers from 1 to " + i + " is: " + sum);
        
        }
    }
}
