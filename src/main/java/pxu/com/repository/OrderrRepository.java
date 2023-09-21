package pxu.com.repository;

import java.util.List;

import pxu.com.entity.Orderr;

public interface OrderrRepository {
	List<Orderr> findAll();

	Orderr findById(int id_order);

	void save(Orderr orderr);

	void update(Orderr orderr);

	void delete(int id_order);
}
