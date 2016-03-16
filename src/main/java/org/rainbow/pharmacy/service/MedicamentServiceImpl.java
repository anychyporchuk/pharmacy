package org.rainbow.pharmacy.service;

import java.util.List;

import javax.swing.JOptionPane;

import org.rainbow.pharmacy.dao.MedicamentDAO;
import org.rainbow.pharmacy.domain.Medicament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedicamentServiceImpl implements MedicamentService {
	
	@Autowired 
	private MedicamentDAO medicamentDAO;
	
	@Transactional
	public List<Medicament> getAllMedicaments(){
		return medicamentDAO.getAllMedicaments();
	}
	
	public void test(){
		
	}

	@Transactional
	public void addMedicament(Medicament medicament) {
		medicamentDAO.addMedicament(medicament);
		
	}
}
