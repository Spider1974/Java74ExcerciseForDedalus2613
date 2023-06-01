package dao.data.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import empmodel.com.dedalus.empModel;
import com.data.util.MyDbConnection;

public class EmployeeDao {
	
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	
	public void insertEmployee(empModel emp) {
		
		con =MyDbConnection.getMyConnection();
		try {
			ps =con.prepareStatement("insert into EMPMODEL values(?,?)");
			ps.setInt(1, emp.getempNO());
			ps.setString(2, emp.getempName());
			int noofrows =ps.executeUpdate();
			System.out.println(noofrows + " got inserted into DB successfully!");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
	
	public void showEmployee() {
		con =MyDbConnection.getMyConnection();
		try {
			stmt =con.createStatement();
			rs =stmt.executeQuery("select * from empmodel");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void updateempmodel()
	{
		con =MyDbConnection.getMyConnection();
		try {
			ps =con.prepareStatement("update  EMPMODEL set enmpname=? where empno=?");
			ps.setString(1, "Modified");
			ps.setInt(2, 101);
			int noofrows =ps.executeUpdate();
			System.out.println(noofrows + " got modified into DB successfully!");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
	
	public void deleteempModel()
	{
		con =MyDbConnection.getMyConnection();
		try {
			ps =con.prepareStatement("delete from empmodel where empno=?");
			ps.setInt(1, 101);
			int noofrows =ps.executeUpdate();
			System.out.println(noofrows + " got deleted into DB successfully!");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
	
	
}
