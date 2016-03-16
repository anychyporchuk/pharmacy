package org.rainbow.pharmacy.service;

import java.util.List;

import org.rainbow.pharmacy.dao.SubstanceDAO;
import org.rainbow.pharmacy.domain.Medicament;
import org.rainbow.pharmacy.domain.Substance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;





public interface SubstanceService {
	public List<Substance> getAllSubstances();
}
