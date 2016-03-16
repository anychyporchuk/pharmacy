package org.rainbow.pharmacy.web;

import java.util.Map;

import org.rainbow.pharmacy.dao.CategoryDAO;
import org.rainbow.pharmacy.domain.Category;
import org.rainbow.pharmacy.domain.Medicament;
import org.rainbow.pharmacy.domain.MedicamentComposition;
import org.rainbow.pharmacy.domain.Substance;
import org.rainbow.pharmacy.service.CategoryService;
import org.rainbow.pharmacy.service.MedicamentService;
import org.rainbow.pharmacy.service.SubstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MedicamentController {
	
	@Autowired
	private MedicamentService medicamentService;
	
	@Autowired
	private SubstanceService substanceService;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/medicaments")
	public String getAllMedicaments(Map<String, Object> map){
		map.put("medicament", new Medicament());
		map.put("medicamentList", medicamentService.getAllMedicaments());
		map.put("substList",substanceService.getAllSubstances());
		map.put("catList",categoryService.getAllCategories());
		return "medicaments";
	}
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/medicaments";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("medicament") Medicament medicament,
			BindingResult result) {
		MedicamentComposition mc = new MedicamentComposition();
		Category cat = new Category();
		cat.setCategoryName("Таблетка");
		medicament.setCategory(cat);
		mc.setMedicament(medicament.getID());
		mc.setSub("Дигидрат");
		mc.setSubCount(10);
		medicamentService.addMedicament(medicament);
		return "redirect:/medicaments";
	}

	
}
