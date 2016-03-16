package org.rainbow.pharmacy.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.rainbow.pharmacy.domain.Substance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SubstanceDAOImpl implements SubstanceDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Substance> getAllSubstances(){
		return sessionFactory.getCurrentSession().createQuery("from Substance").list();
	}




	@Override
	public void addSubstance(Substance substance) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void changeSubstance(String substanceName) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void removeSubstance(String substanceName) {
		// TODO Auto-generated method stub
		
	}

}
