class IC
{
	private int retval;

	public int ICfunc (int n, int x, int y) throws MyException
	{
	    System.out.println("Entering switch with value of n, x, and y respectively "+n+" "+x+" "+y);
		switch (n)
		{
			case 1:
			{
			    System.out.println("n is 1");
			    System.out.println("before if testing if x and y are equal to zero or if x<=y x="+x+" y="+y);
				if ((x == 0) && (y == 0))
				{
				    System.out.println("inside if x and y are 0");
				    System.out.println("about to create object of myException");
					throw new MyException ("all zero");
				}
				else if (x <= y)
				{
				    System.out.println("inside else if so x<=y at x="+ x+ " y="+y);
					retval = x;
					return retval;
				}
				else
				{
				    System.out.println("inside else x="+x+" y="+y);
					retval = y;
					return retval;
				}
			}

			case 2:
			{
			    System.out.println("Inside case 2 so n=2");
				int i;
				System.out.println("Before if testing if x==y or x<y x="+x+" y="+y);
				if (x == y)
				{
				    System.out.println("inside if x=y x and y are "+x);
				    System.out.println("about to create object of myException");
					throw new MyException ("all equal");
				}
				else if (x < y)
				{
				    System.out.println("inside else if so x<y at x="+ x+ " y="+y);
				    System.out.println("before for ");
					for (i = x; i < y; i++)
					{
					    System.out.println("inside for loop is true at i="+i+"<y y="+y+" and x is "+x);
					    System.out.println("before if testing if i>x+5  (right above for values)");
						if (i > x + 5)
						{
						    System.out.println("inside if i>x+5 at i="+i+" x+5="+x+5);
							retval = x + 5;
							System.out.println("about to return retval="+retval+" x="+x+" i="+i);
							return retval;
						}
						System.out.println("Out of if i is "+i+" and x+5="+x+5);
						System.out.println("end for loop about to retest if i<y at i="+i+1+" y="+y);
					}
					retval = i;
					return retval;
				}
				else
				{
				    System.out.println("inside else x="+x+" y="+y);
					retval = n;
					return retval;
				}
			}

			default:
			{
			    System.out.println("Inside default case n="+n+ " x= "+x+" y="+y);
				return 0;
			}
		} // end switch
	} // end method

	public int CompareFunc (int returnVal)
	{
	    System.out.println("before if testing if retval at "+retval+" is equal to returnVal at "+returnVal);
		if (retval == returnVal){
		    System.out.println("inside if retval=returnVal at "+returnVal+" returning 1");
			return 1;
		}
		else{
		    System.out.println("inside else retval was "+retval +" and returnVal was "+returnVal+" returning 0");
			return 0;
		}
	}

} // end class
