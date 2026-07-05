import java.io.*;
class Abstraction
{
    public static void main(String args[])
    {
        English obj=new English();
        obj.speak();
        // Throws error, abstract method and abstract class cannot be called on its own
        Language obj2=new Language();
        obj2.speak();
    }
}

abstract class Language
{
    abstract void speak();
}
class English extends Language
{
    // not needed here exactly but could help if no funct in found in parent
    @Override
    void speak()
    {
        System.out.println("Hello There");
    }
}