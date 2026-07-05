import java.io.*;
class Polymorphism
{
    public static void main(String args[])
    {
        deer animal1=new deer();
        lion animal2=new lion();
        bear animal3=new bear();
        Herbivores[] animal={animal1,animal3};
        for (Herbivores i:animal)
        {
            i.eat();
        }
    }
}
interface Animal
{
    default void eat()
    {System.out.println("Eating..");}
}
interface Herbivores extends Animal
{
    void eatplant();
}
interface Carnivores extends Animal
{
    void eatanimal();
}
class deer implements Herbivores
{
    @Override
    public void eatplant()
    {
        System.out.println("Eating Plants");
    }
    public void eat(){System.out.println("deer is eatting");}
}
class lion implements Carnivores
{
    @Override
    public void eatanimal()
    {
        System.out.println("Eating Animal");
    }
    public void eat(){System.out.println("lion is eatting");}
}
class bear implements Herbivores,Carnivores
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
    public void eat(){System.out.println("bear is eatting");}
}