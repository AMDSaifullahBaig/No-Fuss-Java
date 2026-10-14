class Args_Ellipsis
{
    public static void main(String args[])
    {
        System.out.printf("The sum of numbers = %d\n",add(1,2,3,4,5,6,7,8,9,10));
    }

    static int add(int ... num)
    {
        int sum=0;
        for (int i:num)
        {
            sum+=i;
        }
        return sum;
    }
}