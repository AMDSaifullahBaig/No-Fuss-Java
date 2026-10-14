class Threads extends Thread
{
    public void run()
    {
        try
        {
            for (int i=0;i<=5;i++)
            {
                System.out.println("The Child Thread is running for "+i+" seconds");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread Interrupted");
        }
    }
}

public class Creation_Extend 
{
    public static void main(String[] args)
    {
        Threads t=new Threads();
        t.start();
    }    
}
