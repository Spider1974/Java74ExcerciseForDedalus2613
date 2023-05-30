package empView.com.dedalus;

import java.io.IOException;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.io.*;

import employeContoller.com.dedalus.EmpController;	

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
		EmpController emp = new EmpController();
		emp.addEmployee();
		emp.addEmployee();
		emp.addEmployee();
		emp.serializeObject();
		emp.deserializeObject();
		emp.displayEmployee();
		}
		else
		{
			System.out.println("UserName or Passowrd is wrong");
		}
		
	}

}
