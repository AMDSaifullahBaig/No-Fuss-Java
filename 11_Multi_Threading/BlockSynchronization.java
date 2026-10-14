class T1 extends Thread
{
    Operation obj;
    T1(Operation obj)
    {
        this.obj=obj;
    }
    public void run()
    {
        obj.print(1);
    }
}

class T2 extends Thread
{
    Operation obj;
    T2(Operation obj)
    {
        this.obj=obj;
    }
    public void run()
    {
        obj.print(2);
    }
}

class Operation
{
    public void print (int i)
    {
        System.out.println("Thread "+i+" started operation");
        synchronized (this)
        {
            for (int j=0;j<=5;j++)
                System.out.println("Thread "+i+" printing "+j);
        }
    }
}

public class BlockSynchronization {
    public static void main(String[] args) {
        Operation ops=new Operation();
        T1 t1=new T1(ops);
        T2 t2=new T2(ops);

        t1.start();
        t2.start();
    }
}
