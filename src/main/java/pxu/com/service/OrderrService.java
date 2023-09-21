package pxu.com.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pxu.com.entity.Orderr;
import pxu.com.entity.Product;


public interface OrderrService {
	 List<Orderr> fimAll();

	 Orderr finByid(int id_order);

	 void save(Orderr orderr);

	 void update(Orderr orderr); 

	 void delete(int id_order);
}
