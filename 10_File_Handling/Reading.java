import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
class Writing
{
    public static void main(String args[])
    {
        try(BufferedReader fp=new BufferedReader(new FileReader("file.txt")))
        {
            String line;
            while ((line=fp.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(Exception e)
        {
            System.out.println(e+" has Occured");            
        }
    }
}