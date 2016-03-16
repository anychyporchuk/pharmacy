package org.rainbow.pharmacy.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Medicament")
public class Medicament implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private int ID;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="category")
	private Category category;
	
	@OneToOne
	@JoinColumn(name="tech_id")
	private Technology technology;
	
	@Column(name="price")
	private double price;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="medicamentId")
	List<MedicamentComposition> subList;
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name="stor_life")
	private int storageLife;
	

	@Column(name="crit_rate")
	private int criticalRate;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology) {
		this.technology = technology;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStorageLife() {
		return storageLife;
	}

	public void setStorageLife(int storageLife) {
		this.storageLife = storageLife;
	}

	public int getCriticalRate() {
		return criticalRate;
	}

	public void setCriticalRate(int criticalRate) {
		this.criticalRate = criticalRate;
	}

	public List<MedicamentComposition> getSubList() {
		return subList;
	}

	public void setSubList(List<MedicamentComposition> subList) {
		this.subList = subList;
	}
	
	

}
