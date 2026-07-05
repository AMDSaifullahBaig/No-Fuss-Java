import java.io.*;
import java.util.Scanner;
class ClassCreation
{
    public static void main(String args[])
    {
        Laptop laptop1=new Laptop("HP",24,128);
        Laptop laptop2=new Laptop("Lenovo",16,512);
        Laptop laptop3=new Laptop("ASUS",32,128);

        laptop1.display();
        laptop2.display();
        laptop3.display();
    }
}

class Laptop
{
    String brand;
    int ram;
    int storage;

    Laptop(String brand,int ram,int storage)
    {
        this.brand=brand;
        this.ram=ram;
        this.storage=storage;
    }
    void display()
    {
        System.out.printf("The laptop brand:%s\nRam:%d\nStorage:%d\n\n",this.brand,this.ram,this.storage);
    }
}