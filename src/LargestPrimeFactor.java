/*
    Ryan Bachman

    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143?
 */

import java.util.ArrayList; // Allow the use of an ArrayList.
import java.util.List; // Allow the use of List.
import java.util.Collections; // Allow the use of max to get the highest prime factor in the list.
import java.util.Scanner;

public class LargestPrimeFactor
{
    // Function that returns all of the prime factors for the set number as a list.
    public static List<Long> getFactors(long numberToCheck)
    {
        // Set a new long equal to long passed in from the argument.
        long primeFactor = numberToCheck;
        // Create the list.
        List<Long> factorList = new ArrayList<Long>();

        // For loop, if 2 and less than the number we need....
        for (long i = 2L; i <= primeFactor; i++)
        {
            // While loop that activates when i is divisible by the argument passed in.
            while (primeFactor % i == 0)
            {
                // If so, add it to the list and divide the long passed in by where we are in the for loop.
                factorList.add(i);
                primeFactor /= i;
            }
        }
        if (primeFactor > 1)
        {
            factorList.add(primeFactor);
        }

        return factorList; // Return the list back to the user.
    }

    // Function that ingests a list as an argument and returns the max from that list.
    public static long largestPrimeFactor(List<Long> factorList)
    {
        // Uses Collections.max to find max number in the list.
        long largestPrime = Collections.max(factorList);

        return largestPrime;
    }

    // Main function.
    public static void main(String[] args)
    {
        // Number to check for prime factors.
        long numberToCheck;

        // Get input from the user.
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        numberToCheck = userInput.nextLong();

        // Create a new list we can use to interface with.
        List<Long> factorList = getFactors(numberToCheck);

        System.out.print("\nThe prime factors of " + numberToCheck + " are ");

        // For lip that iterates through the list and prints out the prime numbers.
        for (long Long : factorList)
        {
            // Checks to see if not at the end of the list. If not, add a comma...
            if (factorList.indexOf(Long) != (factorList.size() - 1))
            {
                System.out.print(Long + ", ");
            }
            else // If at end of list, put a period for formatting.
            {
                System.out.print(Long + ".");
            }
        }

        // Output for the largest prime number.
        System.out.println("\n\nThe largest prime factor of " + numberToCheck + " is " + largestPrimeFactor(getFactors(numberToCheck)) + ".");
    }
}