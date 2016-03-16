package org.rainbow.pharmacy.dao;

import java.util.List;

import org.rainbow.pharmacy.domain.Delivery;

public interface DeliveryDAO {
	public void addDelivery(Delivery delivery);
	public List<Delivery> getAllDeliveries();
}
