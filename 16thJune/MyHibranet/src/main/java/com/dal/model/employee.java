package com.dal.model;


import java.util.List;

import javax.persistence.*;

import com.dal.model.Department;
import com.dal.model.Address;
import com.dal.model.Name;



import javax.persistence.*;

@Entity
@NamedQueries(
		{ 
			@NamedQuery(name = "GetEmpByID", query = "from employee e where e.eid=:id"),
		    @NamedQuery(name = "GetEmpByDno", query = "from employee e where e.did=:did") 
		})
public class employee {
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	@Column
	@Embedded
	private Name ename;
	private String email;
	private String password;
	private String gender;
	
	@OneToOne
	@JoinColumn(name = "did")
	private Department did;
	
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<Address> address;

	
	public employee(int eid, Name ename, String email, String password, String gender, Department did) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.did = did;
	}


	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public Name getName() {
		return ename;
	}
	public void setName(Name name) {
		this.ename = name;
	}



	public Name getEname() {
		return ename;
	}



	public void setEname(Name ename) {
		this.ename = ename;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Department getDid() {
		return did;
	}



	public void setDid(Department did) {
		this.did = did;
	}



	public List<Address> getAddress() {
		return address;
	}



	public void setAddress(List<Address> address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", did=" + did + ", address=" + address + "]";
	}
	
	
	
	
	
	

}
