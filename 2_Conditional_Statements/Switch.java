import java.util.Scanner;
class Switch
{
    public static void main(String args[])
    {
        System.out.println("Enter a day of the week:");
        Scanner input=new Scanner(System.in);
        String day=input.nextLine();
        switch(day)
        {
            case "Monday","Tuesday","Wednesday","Thursday","Friday"->System.out.println("Weekdays");
            case "Saturday","Sunday"->System.out.println("Weekend");
            default->System.out.println("Invalid day");
        }
        input.close();
    }
}