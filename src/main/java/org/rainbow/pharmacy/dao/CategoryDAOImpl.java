
package org.rainbow.pharmacy.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.rainbow.pharmacy.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeCategory(String categoryName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCategory(String categoryName) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public List<Category> getAllCategories() {
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}

	
}
