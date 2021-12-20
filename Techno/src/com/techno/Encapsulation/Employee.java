package com.techno.encapsulation;

public class Employee
{
private int empId;
private String ename;
private int age;
private static String designarion;



public void getEmpId() {
	System.out.println(empId);
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public  void getEname() {
	System.out.println(ename);
}
public void setEname(String ename) {
	this.ename = ename;
}
public void getAge() {
	System.out.println(age);
}
public void setAge(int age) {
	this.age = age;
}

public static void getDesignarion() {
	System.out.println(designarion);
}
public static void setDesignarion(String designarion) {
	Employee.designarion = designarion;
}

{	
}

}
