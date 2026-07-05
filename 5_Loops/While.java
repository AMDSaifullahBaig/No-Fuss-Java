import java.io.*;
import java.util.Scanner;
class While
{
    public static void main(String args[])
    {
        Scanner input=new Scanner (System.in);
        char s=' ';
        do
        {
            System.out.println("Enter q to Quit the looop:");
            // java has no nextChar method but we need to get the input and get the 1st char explicitly
            s=input.next().charAt(0);
        }
        while (s!='q');
    }
}