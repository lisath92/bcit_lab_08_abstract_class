package com.a00953863.collection;

import com.a00953863.data.*;
import java.util.ArrayList;

/**
 * @author Lisa Hsu
 *
 */
public class Company {

	private ArrayList<Employee> employees;

	/**
	 * Initializes the ArrayList.
	 */
	public Company() {
		employees = new ArrayList<Employee>();
	}

	/**
	 * Adds employee to the company.
	 * 
	 * @param employee
	 *            is the employee to be added to the company.
	 */
	public void addEmployee(Employee employee) {
		if (employee != null) {
			employees.add(employee);

		}
	}

	/**
	 * Removes the employee from the company.
	 * 
	 * @param employee
	 *            is the employee to be removed.
	 */
	public void removeEmployee(Employee employee) {
		if (employee != null) {
			employees.remove(employee);
		}
	}

	/**
	 * Displays all the employees.
	 */
	public void displayEmployees() {
		for (Employee employee : employees) {
			System.out.println("Employee Name: " + employee.getFirstName() + " " + employee.getLastName()
					+ "----> Monthly Earnings: " + employee.calculateMonthlyEarnings());

		}
	}

}
