class MyException extends Exception
{
    public MyException ()
    {
        super ();
        System.out.println("MyException object being created");
    }

    public MyException (String s)
    {
        super (s);
        System.out.println("MyException object being created with argument " + s);
    }
}
