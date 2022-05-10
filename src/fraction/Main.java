/* By Joaquin Cuellar for CSIS 1400 */
package fraction;
import java.util.Scanner;

public class Main
{
    
    public static void main(String[] args)
    {
        //Fraction Array
        Fraction[] fraction = 
        {
            new Fraction(7,4),
            new Fraction(12,18),
            new Fraction(120,40),
            new Fraction(-6,4),
            new Fraction(9,-3),
        };
        //For Receiving user input
        Scanner input = new Scanner(System.in);
        //Checks if input is valid
        boolean valid = false;
        //Checks if user wants to quit
        boolean quitRequest = false;
        
        //START MAIN PROGRAM
        do
        {
            for(int i = 0; i < fraction.length; i++)
                System.out.println("Fraction " + i +" has the numerator " + fraction[i].n 
                        + " and the denominator " + fraction[i].d);
                    
            System.out.println("\nWhat would you like to do?"
                    + "\nEnter a number 1-5 to select from:"
                    + "\n1. Test the toString() method"
                    + "\n2. Test the Reduce() method"
                    + "\n3. Test the toMixed method"
                    + "\n4. Test the getDecimal() method"
                    + "\n5. Quit");
            do
                switch(input.nextInt())
                {
                    case 1:
                        for(int i = 0; i < fraction.length; i++)
                            System.out.println("\nFraction " + i + " toString()\n------\n" + fraction[i].toString() + "\n------");
                        valid = true;
                        break;
                    case 2:
                        for(int i = 0; i < fraction.length; i++)
                            fraction[i].reduce();
                        valid = true;
                        break;
                    case 3:
                        for(int i = 0; i < fraction.length; i++)
                            System.out.println("\nFraction " + i + " \ntoMixed\n------\n" + fraction[i].toMixed() + "\n------");
                        valid = true;
                        break;
                    case 4:
                        for(int i = 0; i < fraction.length; i++)
                            System.out.println("\nFraction " + i + " \ngetDecimal\n------\n" + fraction[i].getDecimal() + "\n------");
                        valid = true;
                        break;
                    case 5:
                        quitRequest = true;
                        valid = true;
                        break;
                    default:
                        System.out.println("Invalid input. Please select an option from 1-5:");
                        valid = false;
                }
            while(!valid);
        }while(!quitRequest);
    }
}
