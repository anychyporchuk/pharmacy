package org.rainbow.pharmacy.web;

import java.util.Map;
import org.rainbow.pharmacy.domain.Substance;
import org.rainbow.pharmacy.service.SubstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class SubstanceController {
	
	@Autowired
	private SubstanceService substanceService;
	
	@RequestMapping("/subs")
	public String listSubs(Map<String, Object> map) {
		map.put("sub", new Substance());
		map.put("subList",substanceService.getAllSubstances());
		return "sub";
		
	}
}
