import java.util.Scanner;
import java.io.*;
class For_loop
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number greater than 0:");
        int n=input.nextInt();
        for (int i=1;i<n+1;i++)
        {
            System.out.println(i);
        }
        input.close();
    }
}