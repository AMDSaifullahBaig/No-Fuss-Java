import java.io.*;
import java.util.Scanner;
class Ternary
{
    public static void main(String args[])
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your age:");
        int age=input.nextInt();
        String result=(age>=18)? "Adult":"Minor";
        System.out.println("The person is "+result);
    }
}