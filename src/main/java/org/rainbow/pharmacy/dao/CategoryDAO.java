package org.rainbow.pharmacy.dao;

import java.util.List;

import org.rainbow.pharmacy.domain.Category;

public interface CategoryDAO {
	public void addCategory(Category category);
	public void changeCategory(String categoryName);
	public void removeCategory(String categoryName);
	public List<Category> getAllCategories();
}
