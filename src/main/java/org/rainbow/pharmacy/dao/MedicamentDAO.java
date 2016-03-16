package org.rainbow.pharmacy.dao;

import java.util.List;

import org.rainbow.pharmacy.domain.Category;
import org.rainbow.pharmacy.domain.Medicament;

public interface MedicamentDAO {
	public void addMedicament(Medicament medicament);
	public void changeMedicament(int medicamentId);
	public void removeMedicament(int medicamentId);
	public List<Medicament> getAllMedicaments();
}
