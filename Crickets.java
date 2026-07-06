

public class Crickets {
    public static void main(String[] args) {
        double cricket = 0.5; // grams of protein per Crickets
        double protein = 0.6; // grams of protein per gram of Crickets
        double proteinPerCricket = cricket * protein; // grams of protein per Crickets
        double proteinNeeded = (double) 200 / proteinPerCricket;                                              //
        System.out.println("he needs " + proteinNeeded + " Crickets.");

    }
}
