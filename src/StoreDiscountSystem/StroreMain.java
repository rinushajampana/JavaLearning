package StoreDiscountSystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class StroreMain {

	public static void main(String[] args) {
		
		double total;
		boolean member = false;
		String type;
		
		Scanner sc = new Scanner(System.in);
		Date date = null;     
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print("Enter date and time in the format yyyy-MM-dd :");
		
		while (date == null) {
			String line = sc.nextLine();
			try {
				date = format.parse(line);
			} catch (ParseException e) {
				System.out.println("Sorry, that's not valid. Please try again.");
			}
		}
		
		System.out.print("Customer's Name:");
		String name = sc.next();

		System.out.print("Price of each product :");
		int productPrice = sc.nextInt();

		System.out.print("Price of each service :");
		int servicePrice = sc.nextInt();

		System.out.print("Enter the numbers of products :");
		int productNumber = sc.nextInt();

		System.out.print("Enter the numbers of services :");
		int serviceNumber = sc.nextInt();

		System.out.print("Does the member has a membership? (Y/N)");
		String sMember = sc.next();

		
		if(sMember.equalsIgnoreCase("Y"))
		{
			member = true;
			System.out.print("Customer's Membership Type(Premium/ Gold/ Silver) :");
			type = sc.next();
		
			
		} else {
			type = "None";
		}
		
			
		double totalExpenses =  servicePrice * serviceNumber ;
		double totalProducts = productPrice * productNumber;
					
		Customer customer = new Customer(name);
		customer.setMemberType(type);
	
		Visit visit = new Visit(customer.getName(), date);	

		double pdisc = DiscountRate.getProductDiscountRate(type);
		double sdisc = DiscountRate.getServiceDiscountRate(type);
		
		total = totalExpenses + totalProducts - pdisc* totalProducts - sdisc* totalExpenses;
		
		System.out.println("Total is :"+total);
		
		System.out.println(customer.toString() + visit.toString());

	}
}




