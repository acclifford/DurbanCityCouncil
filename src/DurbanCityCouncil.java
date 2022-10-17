import java.util.Scanner;

public class DurbanCityCouncil {
    //-----------------------------------------------------------------
    private static Scanner keyboard = new Scanner (System.in);
    //-----------------------------------------------------------------
    public static void main(String[] args) {

        int userInput;
        int nextHouseNumber;
        int personAge;

        System.out.print("How many houses are in the street?  : ");
        userInput = keyboard.nextInt();

        int[] houseNumbers = new int[userInput];

        int i = 0;

        for (i = 0; i < houseNumbers.length; ++i) {
            System.out.print("What is the next house number?  : ");
            nextHouseNumber = keyboard.nextInt();
            houseNumbers[i] = nextHouseNumber;
        }

        int[][] houseAges = new int[houseNumbers.length][];

        int j = 0;
        int k = 0;


        for (j = 0; j < houseAges.length; ++j) {
            System.out.print("How many people live in number " + houseNumbers[j] + "  : ");
            houseAges[j] = new int[keyboard.nextInt()];
            for (k = 0; k < houseAges[j].length; ++k) {
                System.out.print("What is the age of person " + (k + 1) + "  : ");
                houseAges[j][k] = keyboard.nextInt();
            }
        }
        int l = 0;
        int m = 0;
        long totalAges = 0;
        int rows = houseAges.length;
        int cols = houseAges[0].length;

        long totalAgesAll = 0;

        for (l = 0; l < rows; ++l) {
            totalAges=0;
            for(m = 0; m <cols; ++m){
                totalAges += houseAges[l][m];
            }
            System.out.println("House " + houseNumbers[l] + " has a total age of " + totalAges);
            totalAgesAll += totalAges;
        }


        System.out.print("The street has a total age of " + totalAgesAll );
    }
}

