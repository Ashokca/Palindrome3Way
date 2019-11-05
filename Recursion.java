import java.util.*;
public class Recursion
{
     public static int test;
    public static int test2;
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        String user;
        int test = 0, test2 = 0;
        char test3;
        
        do
        {
        test = 0;
        test2 = 0;
        user = Keyinput.inString("Enter a word to test for a palindrome");
        user = user.replaceAll("[\\W]", "");
          user = user.toLowerCase();
        boolean answer = check(user);
        
            if(answer == true)
            {
                System.out.println("true");
            }
            else
                System.out.println("false");
        System.out.println("Would you like to try another word?(Y/N)");
        test3 = scan.next().charAt(0);
        }
        while(test3 == 'y' || test3 == 'Y');
    }
    
    public static boolean check(String user)
    {
        if(test <= (user.length() - 1))
        {
            if(user.charAt(test) == user.charAt(((user.length() - 1) - test)))
            {
                test++;
                test2++;
                check(user);
            }
        }
        if(test2 == user.length())
        {
            return true;
        }
        else
            return false;
    }
}