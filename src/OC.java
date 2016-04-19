

class OC
{
	private int n;
	private IC  myIC;
   
	public int OCfunc (int x, int y)
	{
		int retval = 0;
		int compare = 0;
		System.out.println("before while testing if n!=3 n="+n);
		while (n != 3)
		{
		   System.out.println("Inside while n="+n);
			try
			{
			    System.out.println("Entering try block");
			    System.out.println("about to call IC method ICfunc argument n, x, y respectively "+n+" "+x+" "+y);
				retval = myIC.ICfunc (n, x, y);
				System.out.println("exited ICfunc call");
				System.out.println("calling IC method compareFunc with argument retval at "+retval);
				compare = myIC.CompareFunc (retval);
				System.out.println("Exited CompareFunc call");
				System.out.println("Exiting try block");
			}
			catch (Exception ex)
			{
			    System.out.println("Entering catch block");
				System.out.println ("Exception caught: " + ex);
				retval = 0;
			}

			n = n + 1;
			System.out.println("End of while check if n!=3 n="+n);
		}
		System.out.println("out of while loop check if n!=3 n="+n);

		return retval;
	}

	public void OCinit ()
	{
		n = 0;
		System.out.println("about to create new IC()");
		myIC = new IC ();
		System.out.println("created new IC");
	}
}

