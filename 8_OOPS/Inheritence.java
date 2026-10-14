class Inheritence
{
    public static void main(String args[])
    {
        English obj=new English();
        obj.speak();
        System.out.println(obj.num);
    }
}

class Language
{
    int num=1000;

    void speak()
    {
        System.out.println("....Speaks....");
    }
}
class English extends Language
{
    void speak()
    {
        System.out.println("Hello There");
    }
}