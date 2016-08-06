package com.hand.ServiceImpl;

import com.hand.Dao.CustomerDao;
import com.hand.DaoImpl.CustomerDaoImpl;
import com.hand.Service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	CustomerDao cd=new CustomerDaoImpl();
	public boolean findCustomerByName(String name) {
		// TODO Auto-generated method stub
		return cd.findCustomerByName(name);
	}

}
