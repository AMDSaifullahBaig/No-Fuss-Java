import java.io.*;
class MethodOverriding
{
    public static void main(String args[])
    {
        English obj=new English();
        obj.speak();
    }
}

class Language
{
    void speak()
    {
        System.out.println("....Speaks....");
    }
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