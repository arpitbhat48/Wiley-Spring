package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository(value = "customerDAOJDBCSupportImpl")
public class CustomerDAOJDBCSupportImpl extends JdbcDaoSupport implements CustomerDAO {

	@Autowired
	public CustomerDAOJDBCSupportImpl(JdbcTemplate jdbcTemplate) {
		setJdbcTemplate(jdbcTemplate);
	}

	@Override
	public int addCustomer(Customer customer) {
		int rows = 0;
		String insertQuery = "insert into customer values(?,?)";
		rows = getJdbcTemplate().update(insertQuery, customer.getCustomerId(), customer.getCustomerName());
		return rows;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		return false;
	}

	@Override
	public int updateCustomer(int customerId, String customerName) {
		return 0;
	}

}