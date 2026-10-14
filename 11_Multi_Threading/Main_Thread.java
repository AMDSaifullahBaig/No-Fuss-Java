// The active thread is only made to sleep so the class Thread is used to call method "sleep()"
class Main_Thread
{
    public static void main(String [] args)
    {
        Thread t=Thread.currentThread();
        System.out.println("current thread: "+t);
        t.setName("Main Thread");
        System.out.println(t);
        try
        {
            for (int n=5;n>0;n--)
            {
                Thread.sleep(1000);
                System.out.println(n);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
    }
}