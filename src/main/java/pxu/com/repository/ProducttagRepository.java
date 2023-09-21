package pxu.com.repository;

import java.util.List;

import pxu.com.entity.Product;
import pxu.com.entity.Producttag;

public interface ProducttagRepository {

	List<Producttag> findAll();

	
}