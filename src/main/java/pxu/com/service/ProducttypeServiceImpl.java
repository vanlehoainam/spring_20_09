package pxu.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pxu.com.entity.Producttype;
import pxu.com.repository.ProducttypeRepository;

import java.util.List;

@Service
public class ProducttypeServiceImpl implements ProducttypeService {

	@Autowired
	private ProducttypeRepository producttypeRepository;

	@Override
	@Transactional
	public List<Producttype> fimAll() {
		// TODO Auto-generated method stub
		return producttypeRepository.findAll();
	}

}
