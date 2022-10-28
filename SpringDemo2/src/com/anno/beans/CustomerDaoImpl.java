package com.anno.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "customerDaoImpl")
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int addCustomer(Customer customer) {
		int rows = 0;
		String insertQuery = "insert into customer values(?,?)";
		rows = jdbcTemplate.update(insertQuery, customer.getCustomerId(), customer.getCustomerName());

		return rows;
	}

	@Override
	public int updateCustomer(int customerId, String customerName) {
		String updateQuery = "UPDATE customer SET customerName = ?";
		int rows = 0;
		rows = jdbcTemplate.update(updateQuery, customerName);
		return rows;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		String deleteQuery = "DELETE FROM customer WHERE customerId = ?";
		int rows = jdbcTemplate.update(deleteQuery, customerId);
		return rows>0;
	}

}