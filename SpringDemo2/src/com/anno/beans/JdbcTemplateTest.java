package com.anno.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CustomerDao customerDao = (CustomerDao) context.getBean("customerDaoImpl");

		// Insert
		int rows = customerDao.addCustomer(new Customer(901, "Don joe"));
		if (rows > 0)
			System.out.println("Record inserted successfully");
		else
			System.out.println("Record not inserted");

//		// Update
//		rows = customerDao.updateCustomer(901, "Lon Bow");
//		if (rows > 0)
//			System.out.println("Record Updated successfully");
//		else
//			System.out.println("Record not UPdated");
//
//		// Delete
//		boolean b = customerDao.deleteCustomer(901);
//		if (b)
//			System.out.println("Record Deleted successfully");
//		else
//			System.out.println("Record not Deleted");

	}

}
