package org.rainbow.pharmacy.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.rainbow.pharmacy.domain.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeliveryDAOImpl implements DeliveryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addDelivery(Delivery delivery) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public List<Delivery> getAllDeliveries() {
		return sessionFactory.getCurrentSession().createQuery("from Delivery").list();
		
	}
}
