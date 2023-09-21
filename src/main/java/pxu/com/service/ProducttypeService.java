package pxu.com.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pxu.com.entity.Producttype;

public interface ProducttypeService {
	List<Producttype> fimAll();
}
