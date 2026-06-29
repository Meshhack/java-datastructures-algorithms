// Beard second = distance and average beard grows in 1 second
// every 5 second beard grows 1 nanometers
// It takes 55.55 hrs to grow 1mm
// Longes beard is 5.18m = 5180mm How many years dis sullivan gow his beard 

public class BeardLength{
    public static void main(String[] args){
       double totalHours = 5180 * 55.55;
       double hoursYears = totalHours / 24;
       double totalYear = hoursYears / 365;
       System.out.println(totalYear);

       int success = 789;
       int trials = 1500;
       double incorrect = 789 / 1500;
       double correct = ((double)success / trials);
       System.out.println(incorrect);
       System.out.println(correct);



       
    }
}
