package com.demo;

import com.demo.Customer;

public interface CustomerDAO {
	public int addCustomer(Customer customer);

	public int updateCustomer(int customerId, String customerName);

	public boolean deleteCustomer(int customerId);

}