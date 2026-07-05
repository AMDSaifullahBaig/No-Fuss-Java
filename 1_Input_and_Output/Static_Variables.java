import java.io.*;
class ClassCreation
{
    public static void main(String args[])
    {
        Laptop laptop1=new Laptop();
        Laptop laptop2=new Laptop();
        Laptop laptop3=new Laptop();
        System.out.println("The number of laptops initiated:"+Laptop.num);
    }
}

class Laptop
{
    static int num;
    Laptop()
    {
        num++;
    }
}