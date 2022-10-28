package com.anno.beans;

public interface CustomerDao {
	public int addCustomer(Customer customer);

	public int updateCustomer(int customerId, String customerName);

	public boolean deleteCustomer(int customerId);

}