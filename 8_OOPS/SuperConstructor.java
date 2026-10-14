class Inheritence
{
    public static void main(String args[])
    {
        English obj=new English("Western",2000,"UK");
        obj.display();
    }
}

class Language
{
    String region;
    int age;
    Language(String region,int age)
    { 
        this.region=region;
        this.age=age;
    }
}
class English extends Language
{
    String type;
    English(String region,int age,String type)
    {
        super(region,age);
        this.type=type;
    }
    void display()
    {
        System.out.printf("The language is originated:%s\nThe language is %d years old\nThe language is a variant from %s",this.region,this.age,this.type);
    }
}