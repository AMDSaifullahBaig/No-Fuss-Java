import java.util.Scanner;
class OverLoading_Methods
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter num1:");
        int a=input.nextInt();
        System.out.print("Enter num2:");
        int b=input.nextInt();
        System.out.print("Enter num3:");
        int c=input.nextInt();
        System.out.printf("The sum of %d and %d = %d\n",a,b,add(a,b));
        System.out.printf("The sum of %d,%d and %d = %d\n",a,b,c,add(a,b,c));
        input.close();
    }

    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b, int c)
    {
        return a+b+c;
    }
}