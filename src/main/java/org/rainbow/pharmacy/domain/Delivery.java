package org.rainbow.pharmacy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Delivery")
public class Delivery implements Serializable {
	
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int ID;
	
	@ManyToOne
	@JoinColumn(name="med_id")
	private Medicament medicament;
	
	@Column(name = "deliv_date")
	private java.sql.Date deliveryDate;
	
	@Column(name = "med_count")
	private int medicamentCount;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Medicament getMedicament() {
		return medicament;
	}

	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}

	public java.sql.Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(java.sql.Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public int getMedicamentCount() {
		return medicamentCount;
	}

	public void setMedicamentCount(int medicamentCount) {
		this.medicamentCount = medicamentCount;
	}
	
	
	
	
}
