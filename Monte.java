public class Monte{
    public static void main(String[] args) {
       int numTrials = 10000;
       int numwins = 0;

       for (int i = 0; i <= numTrials; i++) {
           int Diceroll = (int)(Math.random() * 6) + 1;
           int Diceroll2 = (int)(Math.random() * 6) + 1;
           int Diceroll3 = (int)(Math.random() * 6) + 1;

           if (Diceroll == Diceroll2 && Diceroll2 == Diceroll3) {
               continue;
           } else if ((Diceroll + Diceroll2 + Diceroll3) % 2 == 0) {
               numwins++;
           }

            double probabilitydes = (double) numwins / numTrials ;
            int probability = (int) (probabilitydes * 100);
            System.out.println("Probability of winning: " + probability + "%");       


       }

    }
}
