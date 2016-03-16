package org.rainbow.pharmacy.web;

import java.util.Map;

import org.rainbow.pharmacy.domain.Delivery;
import org.rainbow.pharmacy.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeliveryController {
	
	@Autowired
	private DeliveryService deliveryService;
	
	@RequestMapping("/deliveries")
	public String getAllDeliveries(Map<String, Object> map){
		map.put("delivery", new Delivery());
		map.put("deliveryList", deliveryService.getAllDeliveries());
		return "deliveries";
	}
}
