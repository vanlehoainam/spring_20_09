package pxu.com.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pxu.com.entity.Producttype;
import pxu.com.entity.Product;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class ProducttypeRepositoryImpl implements ProducttypeRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Producttype> findAll() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Producttype> cq = cb.createQuery(Producttype.class);
		Root<Producttype> root = cq.from(Producttype.class);
		cq.select(root);
		return session.createQuery(cq).getResultList();
	}

}
