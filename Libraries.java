import java.util.*;
import java.io.*;
import java.lang.reflect.*; 
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Libraries
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Palindrome
     */
    public static void main()
    {
        // initialise instance variables
        int repeat = 0;
        String user; 
        do 
        {
        user = Keyinput.inString("Please enter a string for the palindrome checker\n");
        String palindrome = new StringBuffer(user).reverse().toString(); 
        if(palindrome.equals(user)) 
            { 
                System.out.println("It is a Palindrome!");
            } 
            else 
            {
                System.out.println("It is not a Palindrome");
            } 
            repeat = Keyinput.inInt("Would you like to test another string?(1,0)\n");
        }
        while(repeat != 0);
        
            
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}