import java.io.*;
import java.util.Scanner;
class Scanner_java
{
    public static void main(String args [])
    {
        System.out.println("If i get two inputs, then the first one takes the word entered and the second one takes in \\n as an input");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        input.nextLine();//requires manual removal of \n after nextInt such that the stdin does not store \n in the nextLine()

        String s=input.nextLine();
        System.out.println("\n"+n+","+s);
        input.close();
    }
}