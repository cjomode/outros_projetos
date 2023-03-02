package dao;

import db.DB;
import model.dao.DaoMenuImplements;
import model.dao.DaoUserImplements;

public class DaoFactory {

public static DaoUser createUsers() {
		
		return new DaoUserImplements(DB.getConnection());
	}
public static DaoMenu createMenu() {
	
	return new DaoMenuImplements(DB.getConnection());
}


	
}
