package com.cg.repo;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.cg.entity.Payment;

public interface PaymentRepo<T> {

	void save(Payment entityObject);

	List<Payment> findAll();

	Payment findById(Integer id) throws EntityNotFoundException;

	Payment remove(Payment entityObject);

	Payment remove(Integer id);

	Payment update(Payment entityObject);

	Payment update(Integer id, Payment entityObject);

	Integer saveAndgetId(Payment entityObject);

}
