import java.io.*;
class Interface
{
    public static void main(String args[])
    {
        deer animal1=new deer();
        animal1.eatplant();
        System.out.println();
        lion animal2=new lion();
        animal2.eatanimal();
        System.out.println();
        bear animal3=new bear();
        animal3.eatanimal();
        animal3.eatplant();
    }
}
public interface Herbivores
{
    void eatplant();
}
public interface Carnivores
{
    void eatanimal();
}
public class deer implements Herbivores
{
    @Override
    public void eatplant()
    {
        System.out.println("Eating Plants");
    }
}
public class lion implements Carnivores
{
    @Override
    public void eatanimal()
    {
        System.out.println("Eating Animal");
    }
}
public class bear implements Herbivores,Carnivores
{
    @Override
    public void eatanimal()
    {
        System.out.println("Eating Animal");
    }
    @Override
    public void eatplant()
    {
        System.out.println("Eating Plant");
    }
}