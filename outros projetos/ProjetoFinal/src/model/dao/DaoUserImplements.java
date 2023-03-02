package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.StatementImpl;

import dao.DaoUser;
import db.DB;
import db.DbException;

import model.entities.Users;

public class DaoUserImplements implements DaoUser{
	
	
	private Connection conn;

	public DaoUserImplements(Connection conn) {
		
		this.conn = conn;
	}


	@Override
	public void insertUsers(Users user) {
		// TODO Auto-generated method stub
		
		PreparedStatement stmt = null;
		String sql = " INSERT INTO users(cpf_cliente,nome, userName, password) "
				+ "VALUES (?, ?, ?, ?);";
		String sql1 = "INSERT INTO cliente(cpf, nome, sobrenome) VALUES (?,?,?);";
			  
		
		try {
			stmt = conn.prepareStatement(sql,StatementImpl.RETURN_GENERATED_KEYS);
			//stmt.setInt(1, user.getId());
			//stmt.setString(2,);
			stmt.setString(1, user.getCpf());
			stmt.setString(2, user.getNome());
			stmt.setString(3, user.getUserName());
			stmt.setString(4, user.getPassword());
			stmt = conn.prepareStatement(sql1,StatementImpl.RETURN_GENERATED_KEYS);
			stmt.setString(1, user.getCpf());
			stmt.setString(2, user.getNome());
			stmt.setString(3, user.getSobrenome());
			
			int linhaAfetada = stmt.executeUpdate();
			
			
			if (linhaAfetada > 0) {

				ResultSet rs = stmt.getGeneratedKeys();
				
				if (rs.next()) {
				
				int id = rs.getInt(1);
				user.setId(id);
				
				System.out.println("Usuário cadastrado com sucesso!\n");
				System.out.println("Parabéns, você ganhou um cupom de desconto de 10%!");
			
				
				}
				
			}else {
				throw new DbException("Cadastro não realizado!");
				
				
			}
			
			
			
		} catch (SQLException | DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void updateUser(Users user) {
		// TODO Auto-generated method stub
		
		PreparedStatement stmt = null;
		String sql = "UPDATE user SET userName = ?"
				+ " WHERE cpf = ?";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,user.getUserName());
			stmt.setString(2, user.getCpf());			
			stmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		PreparedStatement stmt = null;
		String sql = "DELETE FROM users WHERE id = ?";
		
		try {			
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		
		}
	}

	/*
	@Override
	public Users findBy(String cpf) {
		// TODO Auto-generated method stub
		
		PreparedStatement stmt = null;
		ResultSet rs =null;
		String sql = "SELECT * FROM users WHERE id = ?";	
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, cpf);
			
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				
				Users user = new Users();
				
				user.set(rs.getInt("id"));
				user.setNome(rs.getString("nome"));
				
				return user ;
				
			}
			
			return null;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
*/
	@Override
	public boolean authUser(String userName, String passwordUser) {
		// TODO Auto-generated method stub
		
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "Select userName, password From users Where userName = ? ";
		
		boolean confirm = false;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, userName);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				String nameUser = rs.getString("userName");	
				String password = rs.getString("password");
				//String nome = rs.getString("nome");
				if (userName.equals(nameUser) && passwordUser.equals(password)) {
					confirm = true;
					System.out.println("Seja Bem vindo(a), " + nameUser);
					
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
		
		return confirm;
	
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		List <Users> users = new ArrayList<>();
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from users";
		try {
			stmt = conn.prepareStatement(sql);			
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				Users UserEntity = new Users();
				
				UserEntity.setId(rs.getInt("id"));
				
				UserEntity.setNome(rs.getString("nome"));
				
				users.add(UserEntity);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return users ;
	}



	@Override
	public Users findUser_id(String userName) {
		// TODO Auto-generated method stub
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Integer id = null;
		 Users user = new Users();
		String sql = "Select id, nome, userName from users where userName = ? ";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, userName);
			rs = stmt.executeQuery();
		
			
			while (rs.next()) {
				
				if (userName.equals(rs.getString("userName"))) {
					
					user.setId(rs.getInt("id"));
					user.setNome(rs.getString("nome"));	
					
					
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
		
		
		return user;
	}


	@Override
	public void insertClientes(Users user) {
		
		
	}


	

}
