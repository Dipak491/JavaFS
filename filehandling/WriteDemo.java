package filehandling;
import java.io.*;
import java.io.FileOutputStream;
// to write char in file in the ascii format cause write file have int parameter
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
