package empmodel.com.dedalus;

import java.io.*;
import java.util.Comparator;



import java.io.Serializable;

public class empModel implements Comparable<empModel>, Serializable{
	private int empNO;
	private String empName;
	
	public empModel(int eNO,String eName)
	{
		this.empNO = eNO;
		this.empName = eName;
		
	}
	
	public int getempNO()
	{
		return empNO;
	}
	public String getempName()
	{
		return empName;
	}
	

	public void setempNO( int empno)
	{
		empNO = empno;
	}
	
	public void setempName(String empname)
	{
		empName = empname;
	}
	@Override
	public String toString() {
		return "empModel [empNO=" + empNO + ", empName=" + empName + "]";
	}
	
	@Override
	public int compareTo(empModel s1) {
		
		return this.empNO - s1.empNO;
	}
	
	
		public static Comparator<empModel> EmployeeNameComparator = new Comparator<empModel>() {

			@Override
			public int compare(empModel s1, empModel s2) {
				
				return (s1.getempName().compareTo(s2.getempName()));
			}
			
			
		};

		
			public static Comparator<empModel> EmployeeNoComparator = new Comparator<empModel>() {

				@Override
				public int compare(empModel s1, empModel s2) {
					
					return (s1.getempNO() - s2.getempNO());
				}
				
				
			};

}
