package org.rainbow.pharmacy.service;

import java.util.List;

import org.rainbow.pharmacy.dao.CategoryDAO;
import org.rainbow.pharmacy.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryDAO categoryDAO;

	@Transactional
	public List<Category> getAllCategories() {
		return categoryDAO.getAllCategories();
	}

}
