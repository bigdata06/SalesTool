package ca.demo.salestool;

import java.util.Date;

/**
 * Represent the sales data for a given period.
 */
public class SalesData {
	int data[] = {-1, 0, 4, 42, 84, 130, 25};
	
	public void display() {
		System.out.println("Data from said: ");

		int sum = 0;
		for (int i: data) {
			System.out.println("Next value: " + data[i]);
			sum += i;
		}
		
		Date date = new Date();
		System.out.println("Date is: " + date.toString());
		
		System.out.println("Sum is: " + sum);
	}

}
