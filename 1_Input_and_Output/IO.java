import java.util.Scanner;
class IO
{
    public static void main(String args [])
    {
        System.out.println("say my name!");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        System.out.println("You are goddamn right!\n Iam "+name);
        input.close();
    }
}