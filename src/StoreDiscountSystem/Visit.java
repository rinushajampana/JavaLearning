package StoreDiscountSystem;

import java.util.Date;

public class Visit {

	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit(String name, Date date )
	{
		 this.customer = new Customer(name);
		 this.date = date;
	}

	public String getName()
	{
		return customer.getName();
	}
	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double ex) {
		serviceExpense = ex;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double ex) {
		productExpense = ex;
	}
	public double getTotalExpense() {
		return productExpense;
	}
	
	public String toString()
	{
		return "\nVisited on :"+ date;
	}
}
