package com.del.service;

import com.del.dao.PaymentDao;
import com.del.dao.PaymentDaoImplementation;
import com.del.exception.PaymentException;
import com.del.service.PaymentService;

public class PaymentServiceImplementation implements PaymentService {

	private PaymentDao pDao;

	public PaymentServiceImplementation() {

		pDao = new PaymentDaoImplementation();

	}

	@Override
	public boolean authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void payAmount(double amount) throws PaymentException {
		// TODO Auto-generated method stub
		
	}

	

}