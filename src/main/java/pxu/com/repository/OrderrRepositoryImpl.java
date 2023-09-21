package pxu.com.repository;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pxu.com.entity.Orderr;
import pxu.com.entity.Product;

@Repository
public class OrderrRepositoryImpl implements OrderrRepository {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Orderr> findAll() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Orderr> cq = cb.createQuery(Orderr.class);
		Root<Orderr> root = cq.from(Orderr.class);
		cq.select(root);
		return session.createQuery(cq).getResultList();
	}

	@Override
	@Transactional
	public Orderr findById(int id_order) {
		Session session = sessionFactory.getCurrentSession();
        return session.get(Orderr.class, id_order);
	}

	@Override
	public void save(Orderr orderr) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Orderr orderr) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id_order) {
		// TODO Auto-generated method stub

	}

}
