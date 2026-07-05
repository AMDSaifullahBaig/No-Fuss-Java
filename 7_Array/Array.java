import java.io.*;
import java.util.Scanner;
class Array
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int[] numbers={1,2,3,4,5};
        for (int i:numbers)
        {
            System.out.print(i);
        }

        System.out.println();

        System.out.println("Enter elements for array:");
        String[] day=new String[5];

        // no parenthesis for length
        // we can dynamically allocate the size of array unlike in c
        
        int len=day.length;
        for (int i=0;i<len;i++)
        {
            day[i]=input.nextLine();
        }
        System.out.println("The elements of the array:");
        for (String j:day)
        {
            System.out.print(j+" ");
        }
        input.close();
    }
}