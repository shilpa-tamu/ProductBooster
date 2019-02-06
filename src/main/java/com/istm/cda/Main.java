package com.istm.cda;

import java.util.ArrayList;
import java.util.List;

import com.istm.cda.data.*;
import com.istm.cda.data.Statement;

/**
 * Proof of architecture - Main class
 * @author Team 4 (601)
 */
public class Main {

	/**
	 * The database connection gets established and queries for retrieving data are executed
	 */
	public static void main(String[] args) {
		displayTitle();
		/*DataConnection datasource = null;
		try {
			datasource = new DataConnection();
			Statement statement = new Statement(datasource);
			displayCustomerCount(statement);
			displayOrderCount(statement);
			displayNumberOfUniqueOrders(statement);		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			datasource.disconnect();
		}*/
		
	}
	
	private static void displayTitle() {
		List<Integer> num=new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		System.out.println(num);
		
		//System.out.println("Customer Data Analysis (CDA) v0.1");
	}
	
	/**
	 *  This method retrieves the number of customer records
	 */
	private static void displayCustomerCount(Statement statement) {
		String query = "MATCH (n:Customer) RETURN COUNT(n)";
		DataResult dataResult = statement.get(query);
		System.out.println("Customers: " + dataResult.get(0));
	}
	
	/**
	 * This method retrieves the number of order records
	 */
	private static void displayOrderCount(Statement statement) {
		String query = "MATCH (n:Order) RETURN COUNT(n)";
		DataResult dataResult = statement.get(query);
		System.out.println("Orders: " + dataResult.get(0));
	}

	/**
	 * This method retrieves the number of unique orders
	 */
	private static void displayNumberOfUniqueOrders(Statement statement) {
		String query = "MATCH q=()-[p:PLACED]->() RETURN COUNT(q)";
		DataResult dataResult = statement.get(query);
		System.out.println("Number of unique orders placed: " + dataResult.get(0));
	}

}
