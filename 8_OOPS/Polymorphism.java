class Polymorphism
{
    public static void main(String args[])
    {
        deer animal1=new deer();
        lion animal2=new lion();
        bear animal3=new bear();
        Herbivores[] herbivores_animal={animal1,animal3};
        Carnivores[] carnivores_animal={animal2};
        for (Herbivores i:herbivores_animal)
        {
            i.eat();
        }
        for (Carnivores j:carnivores_animal)
        {
            j.eat();
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
    public void eat(){System.out.println("deer is eating");}
}
class lion implements Carnivores
{
    @Override
    public void eatanimal()
    {
        System.out.println("Eating Animal");
    }
    public void eat(){System.out.println("lion is eating");}
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
    public void eat(){System.out.println("bear is eating");}
}