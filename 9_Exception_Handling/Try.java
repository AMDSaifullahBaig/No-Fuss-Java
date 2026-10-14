class Try
{
    public static void main(String args[])
    {
        try
        {
            int a;
            a=3/0;
            System.out.print(a);
        }
        // if one catches other dont
        // getting the exception name via e is mandatory
        catch (ArithmeticException e)
        {
            System.out.println("Dont divide a number with zero");
        }
        catch (Exception e)
        {
            System.out.println("Exception "+e+" occured" );
        }
        finally
        {
            System.out.println("Program Ends here");
        }
    }
}