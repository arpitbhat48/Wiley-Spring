package com.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Application Context Started");
		Customer c1 = (Customer) context.getBean("customer");
		System.out.println(c1.getCustomerId());
		System.out.println(c1.getCustomerName());
		System.out.println(c1.getCustomerAddress().getCity());
		System.out.println(c1.getCustomerAddress().getState());
	}

}
