package streameg;
/*class MyOuter
{
	int x =20;
	abstract class MyInner
	{
		public abstract void InnerMethod();
		
	}
	public void OuterMethod()
	{
		System.out.println("From outer method = " + x);
		class MyInner1 extends MyInner
		{
			public int x=20;
			public  void InnerMethod()
			{
				System.out.println("Inner Extended method");
			}
		}
		
		//inn.InnerMethod();
	}
	public static void main(String[] a)
	{
	MyOuter mo = new MyOuter();
	mo.OuterMethod();
	
		
	}

}*/

// Check whether the inner class can be abstract  - can be done
// can it be inherited? - can be done.


 /*class MyOuter
{
	 int y=50;
	 class MyInner
	{ public int x;
	  
		public  void InnerMethod()
		{  
		  
			System.out.println("x== " + x);
			System.out.println("y== " + MyOuter.this.y);
		}
		
	}
	public  void OuterMethod()
	{
		//System.out.println("From outer method = " + this.x);
		//System.out.println("From outer method = " + y);
		MyInner m1 = new MyInner();
		m1.x = 55;
		
		m1.InnerMethod();
		//inn.InnerMethod();
	}public static void main(String[] a)
	{
	MyOuter mo = new MyOuter() new MyInner();
	

	
	
	mo.OuterMethod();

	
	 
		
	}

}*/

//scope of instance variable within the inner class - Scope of the inner class instance variable can be accessed 
                                                     //from outer class method untill unless an instatnce created for innerclass

class MyOuter
{
	 int y=50;
	 static class MyInner
	{ public  int x;
	  
		public  void InnerMethod()
		{  
		    final int z=0;
			System.out.println("x== " + x);
			
		}
		
	}
	public static void main(String[] a)
	{
	//MyOuter mo = new MyOuter() new MyInner().z = 10;
	

	MyOuter.MyInner mi = new MyOuter.MyInner();
	mi.InnerMethod();
	
	
	
	

	
	 
		
	}

}
//scope of local variable within the inner classs - only within inner method it is declared in above example z 
                                                    //can not be accessed my mi object as well as object create from MyOuter;



