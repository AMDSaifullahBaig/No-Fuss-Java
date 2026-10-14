class Thread1 implements Runnable
{
    public void run()
    {
        try{
            for (int i=0;i<5;i++)
            {
                System.out.println("child thread running for "+i+" seconds");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Child thread is interrupted");
        }
    }
}

public class Creation_Interface 
{
    public static void main(String [] args)
    {
        Thread1 obj=new Thread1();
        Thread t=new Thread(obj);
        t.start();
    }
}