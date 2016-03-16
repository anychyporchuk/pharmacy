package org.rainbow.pharmacy.dao;

import java.util.List;

import org.rainbow.pharmacy.domain.Medicament;
import org.rainbow.pharmacy.domain.Substance;

public interface SubstanceDAO {
	public void addSubstance(Substance substance);
	public void changeSubstance(String substanceName);
	public void removeSubstance(String substanceName);
	public List<Substance> getAllSubstances();
	
	
}
