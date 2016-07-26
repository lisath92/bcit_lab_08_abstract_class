package com.a00953863.data;

/**
 * @author Lisa Hsu
 *
 */
public class SalariedEmployee extends Employee {

	private double yearlySalary;
	private int WEEKS_PER_YEAR = 35;

	/**
	 * Default constructor.
	 */
	public SalariedEmployee() {
	}

	/**
	 * @param firstName
	 *            is the employee's first name,
	 * @param lastName
	 *            is the employee's last name.
	 * @param yearlySalary
	 *            is the employee's yearly salary.
	 */
	public SalariedEmployee(String firstName, String lastName, double yearlySalary) {
		super(firstName, lastName);
		setYearlySalary(yearlySalary);
	}

	/**
	 * @return the yearlySalary as a double.
	 */
	public double getYearlySalary() {
		return yearlySalary;
	}

	/**
	 * @param yearlySalary
	 *            the yearlySalary to set.
	 */
	public void setYearlySalary(double yearlySalary) {
		if (yearlySalary > 0) {
			this.yearlySalary = yearlySalary;
		}
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SalariedEmployee [yearlySalary=" + yearlySalary + ", WEEKS_PER_YEAR=" + WEEKS_PER_YEAR + ", toString()="
				+ super.toString() + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Employee#calculateMonthlyEarnings()
	 */
	@Override
	public double calculateMonthlyEarnings() {
		return (yearlySalary / WEEKS_PER_YEAR) * (52 / 12);
	}

}
