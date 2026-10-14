import java.io.FileWriter;
class Writing
    {
        public static void main(String args[])
        {
            try(FileWriter fp=new FileWriter("file.txt"))
            {//explicit new line for each line 
                fp.write("hi\n");
                fp.write("how\n");
                fp.write("are\n");
                fp.write("you\n");
            }
            catch(Exception e)
            {
                System.out.println(e+" has Occured");
            }
        }
    }