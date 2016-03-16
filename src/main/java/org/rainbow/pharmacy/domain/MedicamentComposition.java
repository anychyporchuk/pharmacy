package org.rainbow.pharmacy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="MedicamentComposition")
@IdClass(MedicamentCompositionPK.class)
public class MedicamentComposition implements Serializable {
	@Id
	@Column(name = "med_id")
	private int medicamentId;
	
	@Id
	@Column(name = "sub_name")
	private String subName;
	
	@Column(name = "sub_count")
	private int subCount;

	public int getMedicament() {
		return medicamentId;
	}

	public void setMedicament(int medicament) {
		this.medicamentId = medicament;
	}

	public String getSub() {
		return subName;
	}

	public void setSub(String sub) {
		this.subName = sub;
	}

	public int getSubCount() {
		return subCount;
	}

	public void setSubCount(int subCount) {
		this.subCount = subCount;
	}

	public int getMedicamentId() {
		return medicamentId;
	}

	public void setMedicamentId(int medicamentId) {
		this.medicamentId = medicamentId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}
	

}
