
import java.util.Scanner;
        /*** STUDENT : Maksat Kadyrbekov
         * Hello everyone, this is my second assignment from Harper college.
         this programm will convert given ounces
         **/

        class OunceConversionProgram {

            // Function to convert ounces to pounds and ounces
            public static String toPoundsAndOunces(int ounces) {
                int pounds = ounces / 16; // Calculate the whole pounds
                int remainingOunces = ounces % 16; // Calculate the remaining ounces
                return pounds + (pounds == 1 ? " lb " : " lbs ") + "and " + remainingOunces + " oz";
            }

            // Function to convert ounces to pounds as a decimal
            public static String toDecimalPounds(int ounces) {
                double pounds = ounces / 16.0; // Convert ounces to decimal pounds
                return String.format("%.4f lbs", pounds); // Format to 4 decimal places
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Welcome prompt
                System.out.println("Welcome to Maksat's Ounce Conversion Program!");

                int ounces = 0;
                boolean validInput = false;

                // Input loop with validation
                while (!validInput) {
                    System.out.print("How many ounces do you have ? ");
                    if (scanner.hasNextInt()) {
                        ounces = scanner.nextInt();
                        if (ounces >= 0) {
                            validInput = true;
                        } else {
                            System.out.println("Your input should be a positive number. Please try again.");
                        }
                    } else {
                        System.out.println("OOPS! That is not a number! Please enter the number of ounces.");
                        scanner.next(); // Clear invalid input
                    }
                }

                // Confirming input
                System.out.println("Thank you! Converting ounces to pounds...");

                // Perform conversions
                String poundsAndOunces = toPoundsAndOunces(ounces);
                String decimalPounds = toDecimalPounds(ounces);

                // Display results
                System.out.println(ounces + " oz is equivalent to " + poundsAndOunces + ".");
                System.out.println(ounces + " oz is equivalent to " + decimalPounds + ".");

                // Exit message
                System.out.println("Thank you for using my CONVERTER!");

                scanner.close(); // Close the scanner
            }
        }