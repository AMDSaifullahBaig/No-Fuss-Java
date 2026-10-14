import java.util.Scanner;
class Methods
{
    static void printmsg(String msg)
    {
        System.out.println(msg);
    }
    public static void main(String args[])
    {
        char s=' ';
        Scanner input=new Scanner(System.in);
        do
        {
            System.out.print("Enter a message to print:");
            printmsg(input.nextLine());
            System.out.print("Enter q to quit:");
            s=input.nextLine().charAt(0);
        }
        while (s!='q');
        input.close();
    }
}