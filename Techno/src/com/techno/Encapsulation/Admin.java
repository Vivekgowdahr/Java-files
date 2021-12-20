package com.techno.encapsulation;

public class Admin extends Employee {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		employee1.setAge(22);
		employee1.setEmpId(007);
		employee1.setEname("selvan");
		employee1.setDesignarion("Software Engineer");
		employee1.getAge();
		employee1.getEmpId();
		employee1.getEname();
		employee1.getDesignarion();
		System.out.println("***********");
		employee2.setAge(23);
		employee2.setEname("Vivek Gowda");
		employee2.setEmpId(0055);
		employee2.getAge();
		employee2.getEmpId();
		employee2.getEname();
		employee2.getDesignarion();

	}
}
