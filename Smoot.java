//smoot height = 170cm
//Bride was declared to be 364.4 smootes
//Bride in m = 620m = 6200 cm
// Formula that takes in cm and converts to smootes
// 1 cm = 6200/364.4

import java.util.Scanner;

public class Smoot {
    public static void main(String[] args){
        Scanner smootcms = new Scanner(System.in);
        System.out.println("Enter Units in Centimeters: ");
        String smoottext = smootcms.nextLine();
        final double CALCS = Double.parseDouble(smoottext) / 170 ;

            System.out.printf(smoottext + "cm is = " + "%.2f" + "smoots ", CALCS);



    }

}
