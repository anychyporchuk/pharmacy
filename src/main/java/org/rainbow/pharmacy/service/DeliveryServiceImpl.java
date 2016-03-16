package org.rainbow.pharmacy.service;

import java.util.List;

import org.rainbow.pharmacy.dao.DeliveryDAO;
import org.rainbow.pharmacy.domain.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliveryServiceImpl implements DeliveryService {
	
	@Autowired
	private DeliveryDAO deliveryDAO;

	@Transactional
	public List<Delivery> getAllDeliveries() {
		return deliveryDAO.getAllDeliveries();
	}
}
