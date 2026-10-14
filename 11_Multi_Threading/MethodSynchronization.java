//The lock is first given to thread 1 and then to thread 2 after complete execution of thread 1
class Printing
{
    synchronized void display(int num)
    {
        for (int i=0;i<=5;i++)
        {
            System.out.println("Thread "+num+" printing "+i);
        }
    }
}
class T1 extends Thread
{
    Printing obj;
    T1(Printing obj){this.obj=obj;}
    public void run()
    {
        obj.display(1);
    }
}
class T2 extends Thread
{
    Printing obj;
    T2(Printing obj){this.obj=obj;}
    public void run()
    {
        obj.display(2);
    }
}
public class MethodSynchronization {
    public static void main(String[] args) {
        Printing obj=new Printing();
        T1 t1=new T1(obj);
        T2 t2=new T2(obj);
        t1.start();
        t2.start();
    }
}
