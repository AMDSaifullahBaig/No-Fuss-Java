class T1 extends Thread
{
    public void run()
    {
        System.out.println("Thread 1 is running");
        for (int i=0;i<50;i++){System.out.println("T1");}
    }
}
class T2 extends Thread
{
    public void run()
    {
        System.out.println("Thread 2 is running");
        for (int i=0;i<50;i++){System.out.println("T2");}
    }
}
class T3 extends Thread
{
    public void run()
    {
        System.out.println("Thread 3 is running");
        for (int i=0;i<50;i++){System.out.println("T3");}
    }
}
class SetPriority
{
    public static void main(String[] args)
    {
        T1 t1=new T1();
        T2 t2=new T2();
        T3 t3=new T3();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(t2.getPriority()-1);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
