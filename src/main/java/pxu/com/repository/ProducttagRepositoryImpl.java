package pxu.com.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pxu.com.entity.Product;
import pxu.com.entity.Producttag;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class ProducttagRepositoryImpl implements ProducttagRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Producttag> findAll() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Producttag> cq = cb.createQuery(Producttag.class);
		Root<Producttag> root = cq.from(Producttag.class);
		cq.select(root);
		return session.createQuery(cq).getResultList();
	}

}
