package com.a00953863.driver;
import com.a00953863.data.*;
import com.a00953863.collection.*;


public class EmployeeDriver {

	public static void main(String[] args) {
		Employee employee_1 = new HourlyEmployee("Bob", "sMiTH", 160);
		Employee employee_2 = new CommissionEmployee("Ross", "browN", 30000);
		Employee employee_3 = new SalariedEmployee("Cecilia", "WHITE", 46000);

		Company PaulsStudentWorkers = new Company();
		PaulsStudentWorkers.addEmployee(employee_3);
		PaulsStudentWorkers.addEmployee(employee_2);
		PaulsStudentWorkers.addEmployee(employee_1);
		
		System.out.println("Company Name: Paul's Student Workers -----");
		PaulsStudentWorkers.displayEmployees();
		
		System.out.println("Paul fires a student ----");
		PaulsStudentWorkers.removeEmployee(employee_2);
		PaulsStudentWorkers.displayEmployees();
	}

}
