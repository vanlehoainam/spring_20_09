package pxu.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pxu.com.entity.Orderr;
import pxu.com.entity.Product;
import pxu.com.repository.OrderrRepository;
import pxu.com.repository.ProductRepository;

import java.util.List;

@Service
public class OrderrServiceImpl implements OrderrService {

	@Autowired
	private OrderrRepository orderrRepository;

	@Override
	@Transactional
	public void save(Orderr orderr) {
		orderrRepository.save(orderr);
	}

	@Override
	@Transactional
	public void update(Orderr orderr) {
		orderrRepository.update(orderr);
	}

	@Override
	@Transactional
	public void delete(int id_order) {
		orderrRepository.delete(id_order);
	}

	@Override
	@Transactional
	public List<Orderr> fimAll() {
		// TODO Auto-generated method stub
		return orderrRepository.findAll();
	}

	@Override
	@Transactional
	public Orderr finByid(int id_order) {
		// TODO Auto-generated method stub
		return orderrRepository.findById(id_order);
	}

}
