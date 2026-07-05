import java.io.*;
import java.util.*;
class IF
{
    public static void main(String args [])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name:");
        String s=input.nextLine();
        if (s.isEmpty())
        {
            System.out.println("Entry Required!");
            s="John Doe";
        }
        System.out.println("Enter your age:");
        int age=input.nextInt();
        System.out.println("hello "+s);
        if (age>=18){System.out.println("You are adult");}
        else{System.out.println("You are not adult");}
        input.close();
    }
}