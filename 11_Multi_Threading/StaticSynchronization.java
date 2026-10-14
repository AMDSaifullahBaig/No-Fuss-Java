class Display
{
    synchronized public static void Print(int i)
    {
        System.out.println("The Thread "+i+" is now executing.");
    }
}
class T1 extends Thread
{
    public void run()
    {
        Display.Print(1);
    }
}
class T2 extends Thread
{
    public void run()
    {
        Display.Print(2);
    }
}
class T3 extends Thread
{
    public void run()
    {
        Display.Print(3);
    }
}
public class StaticSynchronization {
    public static void main(String[] args)
    {
        T1 t1=new T1();
        T2 t2=new T2();
        T3 t3=new T3();

        t1.start();
        t2.start();
        t3.start();
    }
}