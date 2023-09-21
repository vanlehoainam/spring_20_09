package pxu.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pxu.com.entity.Producttag;
import pxu.com.entity.Producttype;
import pxu.com.repository.ProducttagRepository;
import pxu.com.repository.ProducttypeRepository;

import java.util.List;

@Service
public class ProducttagServiceImpl implements ProducttagService {

	@Autowired
	private ProducttagRepository producttagRepository;

	@Override
	@Transactional
	public List<Producttag> fimAll() {
		// TODO Auto-generated method stub
		return producttagRepository.findAll();
	}

}
