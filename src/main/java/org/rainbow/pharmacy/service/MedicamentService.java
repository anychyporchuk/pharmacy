package org.rainbow.pharmacy.service;

import java.util.List;

import org.rainbow.pharmacy.domain.Medicament;

public interface MedicamentService {
	public void addMedicament(Medicament medicament);
	public List<Medicament> getAllMedicaments();
	public void test();

}
