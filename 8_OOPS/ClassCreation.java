import java.io.*;
import java.util.Scanner;
class ClassCreation
{
    public static void main(String args[])
    {
        Laptop laptop=new Laptop();
        laptop.ON();
        laptop.OFF();
    }
}

class Laptop
{
    void ON()
    {
        System.out.println("Laptop turned on");
    }
    void OFF()
    {
        System.out.println("Laptop turned off");
    }    
}