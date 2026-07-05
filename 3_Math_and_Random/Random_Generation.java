import java.io.*;
import java.util.Scanner;
import java.util.Random;
class Random_Generation
{
    public static void main(String args[])
    {
        System.out.println("Choose a number between 1 to 10:");
        Scanner input=new Scanner (System.in);
        int num=input.nextInt();
        Random random=new Random();
        int generated=random.nextInt(1,num+1);// Exclusive-num cannot be generated
        System.out.println("Random number generated is:"+generated);
        input.close();
    }
}