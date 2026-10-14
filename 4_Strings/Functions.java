import java.util.*;
class Functions
{
    public static void main(String args[])
    {
        System.out.println("Enter a string:");
        Scanner input= new Scanner(System.in);
        String str=input.nextLine();
        System.out.println("Enter a sub string:");
        String substr=input.nextLine();
        System.out.printf("The sample string %s, a substring of %s is %b\n",substr,str,str.contains(substr));
        if (!str.isEmpty())
        {
            System.out.println("String with the last char removed:"+str.substring(0,str.length()-1));
        }
        char c=str.charAt(0);
        System.out.println("The charecter at index 0 is "+Character.toUpperCase(c));
        System.out.println("The index where the charecter "+c+" occurs is "+str.indexOf(c));
 
        input.close();
    }
}