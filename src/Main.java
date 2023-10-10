import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double gallonsInTank;
        double milePerGallon;
        double pricePerGallon;
        boolean doneOne = false;
        boolean doneTwo = false;
        boolean doneThree = false;

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
            System.out.println("Enter your car's fuel efficiency: ");
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


    }
}