package org.rainbow.pharmacy.service;

import java.util.List;

import org.rainbow.pharmacy.dao.SubstanceDAO;
import org.rainbow.pharmacy.domain.Substance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SubstanceServiceImpl implements SubstanceService {
	@Autowired
    private SubstanceDAO substanceDAO;
 
    @Transactional
    public void addSubstance(Substance substance) {
    	substanceDAO.addSubstance(substance);
    }
 

	@Transactional
    public List<Substance> getAllSubstances() {
        return substanceDAO.getAllSubstances();
    }
}
