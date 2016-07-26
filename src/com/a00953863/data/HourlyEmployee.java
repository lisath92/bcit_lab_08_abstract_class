/**
 * 
 */
package com.a00953863.data;

/**
 * @author Lisa Hsu
 *
 */
public class HourlyEmployee extends Employee {

	private double hoursWorked;
	private final double HOURLY_WAGE = 10.25;

	/**
	 * Default constructor.
	 */
	public HourlyEmployee() {
	}

	/**
	 * @param firstName
	 *            is the employee's first name.
	 * @param lastName
	 *            is the employee's last name.
	 * @param hoursWorked
	 *            is the number of hours worked in a month.
	 */
	public HourlyEmployee(String firstName, String lastName, double hoursWorked) {
		super(firstName, lastName);
		setHoursWorked(hoursWorked);
	}

	/**
	 * @return the hoursWorked is the number of hours worked in a week as a
	 *         double.
	 */
	public double getHoursWorked() {
		return hoursWorked;
	}

	/**
	 * @param hoursWorked
	 *            the hoursWorked to set.
	 */
	public void setHoursWorked(double hoursWorked) {
		if (hoursWorked > 0) {
			this.hoursWorked = hoursWorked;
		}
	}

	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HourlyEmployee [hoursWorked=" + hoursWorked + ", HOURLY_WAGE=" + HOURLY_WAGE + ", toString()="
				+ super.toString() + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Employee#calculateMonthlyEarnings()
	 */
	@Override
	public double calculateMonthlyEarnings() {
		return hoursWorked * HOURLY_WAGE;
	}

}
