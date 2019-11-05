
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Menu
     */
    public static void Menu()
    {
        // initialise instance variables
        int repeat = 0, choose;
 
        do 
        {
        Keyinput.printPrompt("What version of Palindrome would you like to use?\n");
        Keyinput.printPrompt("1. For Loop version of Palindrome\n");
        Keyinput.printPrompt("2. Recursion version of Palindrome\n");
        choose = Keyinput.inInt("3. Libraries version of Palindrome\n");
        switch(choose) 
        { 
            case 1: 
                ForLoop Palin_1 = new ForLoop(); 
                Palin_1.main(); 
                break; 
            case 2: 
                Recursion Palin_2 = new Recursion(); 
                Palin_2.main(); 
                break;
            case 3: 
                Libraries Palin_3 = new Libraries(); 
                Palin_3.main();
                break;
        }
        repeat = Keyinput.inInt("Would you like to repeat the menu?(1,0)\n");
    }
    while(repeat == 1);
        
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
