
class TestException
{
    void m()
    {
         int data  = 50/0;
    }

    void n()
    {
        m();
    }
    void p()
    {
        try
        {
            n();
        }
    }
}



public class ExceptionPropagation{
    public static void main(String[] args) 
    {
        TestException obj = new TestException();
        obj.p();
        
    }
}