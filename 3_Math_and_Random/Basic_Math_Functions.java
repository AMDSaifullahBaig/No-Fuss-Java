import java.util.Scanner;
class Basic_Math_Functions
{
    public static void main(String args[])
    {
        System.out.println("Enter number 1:");
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        System.out.println("Enter number 2:");
        int num2=input.nextInt();

        System.out.println(num1+"^"+num2+"="+Math.pow(num1,num2));
        System.out.println("Square root of "+num1+"="+Math.sqrt(num1));
        System.out.println("Maximum between "+num1+" and "+num2+"="+Math.max(num1,num2));
        System.out.println("Minimum between "+num1+" and "+num2+"="+Math.min(num1,num2));
        System.out.println("Value of PI="+Math.PI);
        System.out.println("Value of E="+Math.E);
        input.close();
    }
}