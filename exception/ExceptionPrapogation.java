package com.exception;



class TestException
{
    void method1()
    {
         int data  = 50/0;
    }

    void nmethod1()
    {
    	method1();
    }
    void p()
    {
        try
        {
        	nmethod1();
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
    }
}



public class ExceptionPrapogation{
    public static void main(String[] args) 
    {
        TestException obj = new TestException();
        obj.p();
        
        System.out.println("Normal flow");
        
    }
}