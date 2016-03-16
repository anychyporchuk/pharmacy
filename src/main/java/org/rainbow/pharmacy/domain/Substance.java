package org.rainbow.pharmacy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Substance")
public class Substance implements Serializable {
	
	@Id
	@Column(name="sub_name")
	private String substanceName;
	
	@Column(name="sub_price")
	private int substancePrice;


	public String getSubstanceName() {
		return substanceName;
	}

	public void setSubstanceName(String substanceName) {
		this.substanceName = substanceName;
	}

	public int getSubstancePrice() {
		return substancePrice;
	}

	public void setSubstancePrice(int substancePrice) {
		this.substancePrice = substancePrice;
	}
	
	
}
