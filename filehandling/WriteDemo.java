package filehandling;
import java.io.*;
import java.FileOutputStream;

public class WriteDemo 
{
    public static void main(String[] args)
     {
        try
        {

        FileOutputStream fobj = new FileOutputStream("D:\\Eclips\\CoreJava\\src\\com\\filehandling\\n" + //
                "ew.txt");

        fobj.write(65);

        fobj.close();

        System.out.println("Success....");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
