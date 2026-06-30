package com.tka;



public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Employ emp1 = new Employ();
  
  
  emp1.name = "Adarsh";
  emp1.birthDate = 1998;
  emp1.Salary = "20000";
  
  
  
  System.out.println("Emloyee Name = " + emp1.name);
  System.out.println("Birth Year=" + emp1.birthDate);
  System.out.println("Salary="+ emp1.Salary);
  System.out.println("--------------------->");
  
  Employ emp2 = new Employ();
  emp2. name = "Shubham";
  emp2. birthDate = 1999;
  emp2.Salary= "21000";
  System.out.println("Employ Name ="  + emp2.name);
  System.out.println("Employ Year =" + emp2.birthDate);
  System.out.println("Employ alary="+ emp2.Salary);
	}

}
