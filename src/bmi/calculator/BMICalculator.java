// Abas Abdi @author 21422705
package bmi.calculator;

// Here i've imported the Scanner class  from the java libary
import java.util.Scanner;

/* This is the class for my programme which is a template or
 blueprint from which objects are created */
public class BMICalculator {

    // Here i've created a method to workout the BMI using kilograms and meters.
    static void KGM() {

        // I’ve declared all the variables for my programme here.
        String weight, height;
        double w, h, BMI;

        Scanner input = new Scanner(System.in);

        /* I created a while loop with a so that instead of the console crashing
         if the user were to accidently enter characters they are repeatedly
         prompted to enter a numerical value until they do.*/
        while (true) {

            System.out.println("\nPlease enter your weight in kilograms:\n");

            weight = input.nextLine();

            /* The try statement allows for a block of code to be tested
             for errors while it is being executed. */
            try {

                w = Double.valueOf(weight);

                break;

                /* The catch statement allows for a block of code
                 to be executed, if an error occurs in the try block. */
            } catch (NumberFormatException e) {

                System.out.println("\n Error: You have to enter a number!\n");

            }

        }

        /* I created a while loop so that instead of the console crashing if the
         user were to accidently enter characters they are repeatedly prompted to
         enter a numerical value until they do.*/
        while (true) {

            System.out.println("\nPlease enter your height in meters:\n");

            height = input.nextLine();

            /* The try statement allows for a block of code to be tested
             for errors while it is being executed. */
            try {

                h = Double.valueOf(height);

                break;

                /* The catch statement allows for a block of code
                 to be executed, if an error occurs in the try block. */
            } catch (NumberFormatException e) {

                System.out.println("\n Error: You have to enter a number!\n");

            }

        }

        /* Here i'm calculating the value of the user's BMI using the formula that was given
         and assigning it to the BMI variable. */
        BMI = w / (h * h);

        // Here i'm printing out the user's result using an else if ladder to determin the correct response
        if (BMI < 18.50) {

            System.out.println("\n   YOUR BMI IS " + String.format("%.2f", BMI) + "\n Unfortunetly you're undereweight.\n");

        } else if (BMI >= 18.50 && BMI <= 24.90) {

            System.out.println("\n   YOUR BMI IS: " + String.format("%.2f", BMI) + "\n Congratulations! You are healthy.\n");

        } else if (BMI >= 25.00 && BMI <= 29.90) {

            System.out.println("\n   YOUR BMI IS: " + String.format("%.2f", BMI) + "\n Unfortunetly you're overweight.\n");

        } else {

            System.out.println("\n   YOUR BMI IS: " + String.format("%.2f", BMI) + "\n Unfortunetly you're obese.\n");

        }

        // I'm exiting the progrmme after the user's results have successfully been printed.
        System.exit(0);

    }

    // Here i've created a method to workout the BMI using punds and inches.
    static void LBIN() {

        // I’ve declared all the variables for my programme here.
        String weight, height;
        double w, h, BMI;

        Scanner input = new Scanner(System.in);

        /* I created a while loop so that instead of the console crashing if the
         user were to accidently enter characters they are repeatedly prompted to
         enter a numerical value until they do.*/
        while (true) {

            System.out.println("\nPlease enter your weight in pounds:\n");

            weight = input.nextLine();

            /* The try statement allows for a block of code to be tested
             for errors while it is being executed. */
            try {

                w = Double.valueOf(weight);

                break;

                /* The catch statement allows for a block of code
                 to be executed, if an error occurs in the try block. */
            } catch (NumberFormatException e) {

                System.out.println("\n Error: You have to enter a number!\n");

            }

        }

        /* I created a while loop so that instead of the console crashing if the
         user were to accidently enter characters they are repeatedly prompted to
         enter a numerical value until they do.*/
        while (true) {

            System.out.println("\nPlease enter your height in inches:\n");

            height = input.nextLine();

            /* The try statement allows for a block of code to be tested
             for errors while it is being executed. */
            try {

                h = Double.valueOf(height);

                break;

                /* The catch statement allows for a block of code
                 to be executed, if an error occurs in the try block. */
            } catch (NumberFormatException e) {

                System.out.println("\n Error: You have to enter a number!\n");

            }

        }
        /* Here i'm calculating the value of the user's BMI using the formula that was given,
         and assigning it to the BMI variable. */
        BMI = (w / (h * h)) * 703;

        // Here i'm printing out the user's result using an else if ladder  to determin the correct response
        if (BMI < 18.50) {

            System.out.println("\n   YOUR BMI IS " + String.format("%.2f", BMI) + "\n Unfortunetly you're undereweight.\n");

        } else if (BMI >= 18.50 && BMI <= 24.90) {

            System.out.println("\n   YOUR BMI IS: " + String.format("%.2f", BMI) + "\n Congratulations! You are healthy.\n");

        } else if (BMI >= 25.00 && BMI <= 29.90) {

            System.out.println("\n   YOUR BMI IS: " + String.format("%.2f", BMI) + "\n Unfortunetly you're overweight.\n");

        } else {

            System.out.println("\n   YOUR BMI IS: " + String.format("%.2f", BMI) + "\n Unfortunetly you're obese.\n");

        }

        // I'm exiting the progrmme after the user's results have successfully been printed.
        System.exit(0);

    }

    // Here i've created a method to workout the BMI using stones and centimeters.
    static void STCM() {

        // I’ve declared all the variables for my programme here.
        String weight, height;

        double w, h, BMI;

        Scanner input = new Scanner(System.in);

        /* I created a while loop so that instead of the console crashing if the
         user were to accidently enter characters they are repeatedly prompted to
         enter a numerical value until they do.*/
        while (true) {

            System.out.println("\nPlease enter your weight in stones:\n");

            weight = input.nextLine();

            /* The try statement allows for a block of code to be tested
             for errors while it is being executed. */
            try {

                w = Double.valueOf(weight);

                break;

                /* The catch statement allows for a block of code
                 to be executed, if an error occurs in the try block. */
            } catch (NumberFormatException e) {

                System.out.println("\n Error: You have to enter a number!\n");

            }

        }

        /* I created a while loop so that instead of the console crashing if the
         user were to accidently enter characters they are repeatedly prompted to
         enter a numerical value until they do.*/
        while (true) {

            System.out.println("\nPlease enter your height in centimeters:\n");

            height = input.nextLine();

            /* The try statement allows for a block of code to be tested
             for errors while it is being executed. */
            try {

                h = Double.valueOf(height);

                break;

                /* The catch statement allows for a block of code
                 to be executed, if an error occurs in the try block. */
            } catch (NumberFormatException e) {

                System.out.println("\n Error: You have to enter a number!\n");

            }

        }

        /* Here i'm calculating the value of the user's BMI using the formula that was given,
         and assigning it to the BMI variable. */
        h = h / 100;
        BMI = ((w * 6.35029) / (h * h));

        // Here i'm printing out the user's result using an else if ladder  to determin the correct response
        if (BMI < 18.50) {

            System.out.println("\n   YOUR BMI IS: " + String.format("%.2f", BMI) + "\n Unfortunetly you're undereweight.\n");

        } else if (BMI >= 18.50 && BMI <= 24.90) {

            System.out.println("\n   YOUR BMI IS: " + String.format("%.2f", BMI) + "\n Congratulations! You are healthy.\n");

        } else if (BMI >= 25.00 && BMI <= 29.90) {

            System.out.println("\n   YOUR BMI IS: " + String.format("%.2f", BMI) + "\n Unfortunetly you're overweight.\n");

        } else {

            System.out.println("\n   YOUR BMI IS " + String.format("%.2f", BMI) + "\n Unfortunetly you're obese.\n");

        }

        // I'm exiting the progrmme after the user's results have successfully been printed.
        System.exit(0);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How would you like to calculate your BMI?\n\n A) Type A to calculate it in KG & Meters\n "
                + "B) Type B to calculate it in  Pounds & Inches\n C) Type C to calculate it in Stones & Centimeters\n");

        /* I created a while loop so that instead of the console crashing or not working
        if the user were to accidently enter numbers or values outside of what was requested
        they are repeatedly prompted to enter either A, B, or C until they do.*/
        while (true) {
            /* I declared a variable and gave it the char datatyoe and since i can't
             assign a string to a char, iv'e assigned the first value of the
             string to the variable g wiht ".charAt(0)". */
            char g = input.next().charAt(0);

            //I've used switch case statements to select the appropiate method to call.
            switch (g) {

                case 'A':

                case 'a':

                    // I'm calling the KGM method.
                    KGM();

                    break;

                case 'B':

                case 'b':

                    // I'm calling the LBIN method.
                    LBIN();

                    break;

                case 'C':

                case 'c':

                    // I'm calling the STCM method.
                    STCM();

                    break;

                // This code executes if there is no case match
                default:

                    System.out.println("\nError: Please enter A (kg & m), B (lb & in), or C (st & cm)\n");

                    break;

            }
        }
    }
}
