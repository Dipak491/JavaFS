package filehandling;

import java.io.FileInputStream;
// to read char in file 
public class ReadDemo 
{
    public static void main(String[] args) 
    {
        try 
        {
         FileInputStream obj = new FileInputStream("D:\\Eclips\\CoreJava\\src\\com\\filehandling\\new.txt");
         
         int i = obj.read();

         System.out.println((char)i); // read only single character 
            obj.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
