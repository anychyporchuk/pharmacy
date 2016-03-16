package org.rainbow.pharmacy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Technology")
public class Technology implements Serializable{
	
	@Id
	@Column(name="tech_id")
	@GeneratedValue
	private int technologyId;
	
	@Column(name="method_cook", columnDefinition="TEXT")
	private String methodOfCooking;
	
	@Column(name="cook_time")
	private String cookingTime;

	public int getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}

	public String getMethodOfCooking() {
		return methodOfCooking;
	}

	public void setMethodOfCooking(String methodOfCooking) {
		this.methodOfCooking = methodOfCooking;
	}

	public String getCookingTime() {
		return cookingTime;
	}

	public void setCookingTime(String cookingTime) {
		this.cookingTime = cookingTime;
	}
	
	
	
	
}
