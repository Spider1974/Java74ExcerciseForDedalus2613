package employeContoller.com.dedalus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.data.util.EmployeeDao;
import empmodel.com.dedalus.empModel;

public class EmployeeController  {
	
	Scanner sc = new Scanner(System.in);
	empModel emp;
	List<empModel> emplist = new ArrayList<empModel>();
	EmployeeDao empdao = new EmployeeDao();
	public void addempModel()
	{		
		emp = new empModel();
		System.out.println("Enter Eno");
		int eno =sc.nextInt();
		emp.setempNO(eno);
		
		System.out.println("Enter Ename");
		String ename =sc.next();
		emp.setempName(ename);
		emplist.add(emp);
		empdao.insertEmployee(emp);
		System.out.println("empModel Added Successfully");
		
	}
	
	public void viewempModel() {
		//System.out.println(emp.getEmpno());
		//System.out.println(emp.getEname());
		
		//System.out.println(emplist);
		
		/*Iterator<empModel> i = emplist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}*/
		
		System.out.println("Dataas from DB:");
		empdao.showEmployee();
		
	}
	
	public void updateempMode()
	{
		empdao.updateempmodel();
		System.out.println("empModel updated Successfully");
	}
	
	public void deleteempMode()
	{
		empdao.deleteempModel();
		System.out.println("empModel deleted Successfully");
		
	}

}
