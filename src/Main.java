import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double gallonsInTank = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        boolean doneOne = false;
        boolean doneTwo = false;
        boolean doneThree = false;
        double hundredMileCost = 0;
        double distance = 0;

        //asks user for amount of gallons in their tank currently
        do {
            System.out.println("Enter the amount of gallons in your tank currently: ");
            if (scan.hasNextDouble()) {
                gallonsInTank = scan.nextDouble();
                if (gallonsInTank <= 0) {
                    scan.nextLine();
                } else {
                    doneOne = true;
                }
            } else {
                scan.nextLine();
            }
        } while (!doneOne);

        //asks user for mpg for their car
        do {
            System.out.println("Enter your car's fuel efficiency in MPG: ");
            if (scan.hasNextDouble()) {
                mpg = scan.nextDouble();
                if (mpg < 0) {
                    scan.nextLine();
                } else {
                    doneTwo = true;
                }
            } else {
                scan.nextLine();
            }
        } while (!doneTwo);

        //asks user for price per gallon
        do {
            System.out.println("Enter current price per gallon: ");
            if (scan.hasNextDouble()) {
                pricePerGallon = scan.nextDouble();
                if (pricePerGallon < 0) {
                    scan.nextLine();
                } else {
                    doneThree = true;
                }
            } else {
                scan.nextLine();
            }
        } while (!doneThree);

        //prints cost for 100 miles and how far the car can go with the gas that is currently in the tank
        //output should have only 2 decimal places
        hundredMileCost = 100/mpg * (pricePerGallon);
        distance = mpg * gallonsInTank;
        System.out.printf("%-10s %.2f" , "Cost per 100 miles in $: " , hundredMileCost);
        System.out.printf("\n%10s %.2f" , "Distance left in miles: " , distance);
    }
}
