package com.a00953863.data;

/**
 * @author Lisa Hsu
 *
 */
public class CommissionEmployee extends Employee {

	private double salesTotal;
	private static final double COMMISSION_RATE = 0.10;

	/**
	 * Default constructor.
	 */
	public CommissionEmployee() {
	}

	/**
	 * @param firstName
	 *            is the Employee's first name.
	 * @param lastName
	 *            is the Employee's last name.
	 * @param salesTotal
	 *            is the Employee's monthly sales total.
	 */
	public CommissionEmployee(String firstName, String lastName, double salesTotal) {
		super(firstName, lastName);
		setSalesTotal(salesTotal);

	}

	/**
	 * @return the salesTotal as a double.
	 */
	public double getSalesTotal() {
		return salesTotal;
	}

	/**
	 * @param salesTotal
	 *            the salesTotal to set.
	 */
	public void setSalesTotal(double salesTotal) {
		if (salesTotal > 0) {
			this.salesTotal = salesTotal;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommissionEmployee [salesTotal=" + salesTotal + ", toString()=" + super.toString() + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Employee#calculateMonthlyEarnings()
	 */
	@Override
	public double calculateMonthlyEarnings() {
		return salesTotal * COMMISSION_RATE;

	}
}
