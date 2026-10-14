class Static_Variables
{
    public static void main(String args[])
    {
        Laptop laptop1=new Laptop();
        Laptop laptop2=new Laptop();
        Laptop laptop3=new Laptop();
        System.out.println(laptop1+" "+laptop2+" "+laptop3);
        System.out.println("The number of laptops initiated:"+Laptop.num);
    }
}

class Laptop
{
    public static int num;
    Laptop()
    {
        num++;
    }
}