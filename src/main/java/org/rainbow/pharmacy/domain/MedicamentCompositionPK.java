package org.rainbow.pharmacy.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;

public class MedicamentCompositionPK implements Serializable{
	
	
	protected int medicamentId;
	
	protected String subName;
	
	public MedicamentCompositionPK(){}
	
	public MedicamentCompositionPK(int medicament, String subName){
		this.medicamentId = medicament;
		this.subName = subName;
	}

}
