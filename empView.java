package empView.com.dedalus;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.io.*;


import empmodel.com.dedalus.empModel;	

public class empView {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		BiPredicate<String, String> UserPassword = (un,pw)->{
			return (un.equals("vairam") && pw.equals("Password@13"));};
			Scanner sc = new Scanner(System.in);
			String uname = sc.next();
			String pword = sc.next();
		if (UserPassword.test(uname, pword))
		{
		/*	EmployeeController emp = new EmployeeController();
		emp.addempModel();
		emp.viewempModel();
		emp.updateempMode();
		emp.viewempModel();
		emp.deleteempMode();
		emp.viewempModel();*/
			
			empModel[] stArray = new empModel[3];
			stArray[0] = new empModel(103,"Kushdeep");
			stArray[1] = new empModel(105,"Bhavana");
			stArray[2] = new empModel(102,"Gowthami");
			
			Arrays.sort(stArray);
			System.out.println("Sorted empModel Array :" + Arrays.toString(stArray));
			
			Arrays.sort(stArray,empModel.EmployeeNameComparator);
			System.out.println("Sorted empModel Array w.r.t Employee Name :" + Arrays.toString(stArray));
			
			Arrays.sort(stArray,empModel.EmployeeNoComparator);
			System.out.println("Sorted empModel Array w.r.t Employee No :" + Arrays.toString(stArray));
		}
	
		else
		{
			System.out.println("UserName or Passowrd is wrong");
		}
		
	}

}
