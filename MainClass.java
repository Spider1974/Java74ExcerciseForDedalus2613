package inger.com.dedalus;

import inger.com.dedalus.Salary;
class employee 
{
	int empNo;
	String empName;
	Salary sal = new Salary();
	public  employee()
	{
		
	}
	public employee(double basic)
	{
		empNo=101;
		empName = "Vairamuthu";
		sal.Calculatehradapf(basic);
	}
	
	public void calculateNet()
	{
		System.out.println("Net Salary " + ((sal.basic+sal.da+sal.hra) - sal.pf));
	}
	
	
	public String toString() {
		return "employee [empNo=" + empNo + ", empName=" + empName + "]";
	}
	
	public void getDetails()
	{
		System.out.println("Employee inromation" + empNo + "  " + empName  + sal);
	}
}

class Manager extends employee
{
	public Manager()
	{
	
	}
	public Manager(double basic)
	{
		super(basic);
	}
      String depart = "IT";
      
    		  
    		  public void getDetails()
    		  { 
    			  super.toString();
    			  System.out.println("Employee Department" + depart);
    			  
    		  }
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Manager mn = new Manager(80000);
		System.out.println("Employee information");
		System.out.println(mn);
		System.out.println("Salary information");
		mn.calculateNet();
		
		
		
				

	}

}
