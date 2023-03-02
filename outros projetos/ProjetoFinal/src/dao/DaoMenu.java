package dao;

import java.util.List;

import model.entities.Menu;

public interface DaoMenu {

	Menu findById(Integer id);
	List<Menu> findAll();
	Menu findMenu_tipo(String Menu_tipo);
	
}
