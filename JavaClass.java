package com.dedalus;

interface Bonus
{
	void calculateBonus();
}

interface Salary extends Bonus
{
	void calculateSalary();
	
}

class employee implements Salary
{
	public void calculateBonus()
	{
		System.out.println("Calculate Bonus");
	}
	public void calculateSalary()
	{
		System.out.println("Calculate Salary");
	}
}

public class JavaClass
{
	
	public static void main(String[] args)
	{
	  Salary iSalary = new employee();
	  iSalary.calculateBonus();
	  iSalary.calculateSalary();
	}
}