package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DaoMenu;
import db.DB;
import model.entities.Menu;
import model.entities.Users;

public class DaoMenuImplements implements DaoMenu{

	private Connection conn;
	
	public DaoMenuImplements(Connection conn) {
		
		this.conn = conn;
	}

	@Override
	public Menu findById(Integer id) {
		//Uma instrução SQL é pré-compilada e armazenada em um objeto PreparedStatement.
		PreparedStatement stmt = null;
		/*Uma tabela de dados representando um conjunto de resultados de banco de dados, 
		que geralmente é gerado pela execução de uma instrução que consulta o banco de dados.*/
		ResultSet rs = null;
		
		String sql = "SELECT * FROM cardapio WHERE id = ?";

		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			
			rs = stmt.executeQuery();
			Menu menu = new Menu();
			
			while(rs.next()) {
				menu.setId(rs.getInt("id"));
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public List<Menu> findAll() {
		// TODO Auto-generated method stub
		List <Menu> menus = new ArrayList<>();
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from cardapios";
		try {
			stmt = conn.prepareStatement(sql);			
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				Menu MenuEntity = new Menu();
				
				MenuEntity.setId(rs.getInt("id"));
				
				MenuEntity.setNome(rs.getString("nome"));
				
				menus.add(MenuEntity);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return menus ;
	
	}

	@Override
	public Menu findMenu_tipo(String Menu_tipo) {
		// TODO Auto-generated method stub
		
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Integer id = null;
		 Menu menus = new Menu();
		String sql = "Select  id,nome, tipo from cardapio where id = ? ";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, Menu_tipo);
			rs = stmt.executeQuery();
		
			
			while (rs.next()) {
				
				if (Menu_tipo.equals(rs.getString("tipo"))) {
					
					menus.setId(rs.getInt("id"));
					menus.setNome(rs.getString("nome"));
					menus.setTipo("tipo");
					
					break;
					
				}	
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(stmt);
			DB.closeResultset(rs);
		}
		
		
		return menus ;
	
	}

}
