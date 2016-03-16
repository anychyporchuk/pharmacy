package org.rainbow.pharmacy.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.rainbow.pharmacy.domain.Medicament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MedicamentDAOImpl implements MedicamentDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings({ "unchecked"})
	public List<Medicament> getAllMedicaments(){
		return sessionFactory.getCurrentSession().createQuery("from Medicament").list(); 
	}
	
	
	public void test(){
		String hql = "from Medicament m, Category c where m.category=c.categoryId";
		List<Object[]> list =  sessionFactory.getCurrentSession().createQuery(hql).list();
		/*for (Object[] aRow : listResult) {
			Medicament product = (Medicament) aRow[0];
		    Category category = (Category) aRow[1];
		    System.out.println(product.getName() + " - " + category.getCategoryName());
		}
		return listResult;*/
	}


	@Override
	public void addMedicament(Medicament medicament) {
		sessionFactory.getCurrentSession().save(medicament);
		
	}


	@Override
	public void changeMedicament(int medicamentId) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeMedicament(int medicamentId) {
		// TODO Auto-generated method stub
		
	}

}
