package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	
			private static Connection conn = null;
		
			public static Connection getConnection() {
			
				if (conn == null) {
					
					
					Properties props = loadProperties();
					String url = props.getProperty("dburl");
					try {
						
						conn = DriverManager.getConnection(url, props);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						//Tratamento da exceção
						throw new DbException(e.getMessage());
					}
					}
				//Retorno da conexão
				return conn;
			}
			
			private static Properties loadProperties() {

				try {
					
					
					FileInputStream fs = new FileInputStream("db.properties");
					
					Properties props = new Properties();
					
					props.load(fs);
					return props;
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new DbException(e.getMessage());
				}
					
			}
			
			//Metódo para fechar a conexão
			public static void closeConnetion() {
				
					if (conn != null) {
						
						try {
							conn.close();
							
						}catch(SQLException e) {
							
							throw new DbException(e.getMessage());
						}
						
					}
				
			}
			
			//Metódo para fechar o ResultSet
			public static void closeResultset(ResultSet rs) {
				
					if (rs != null) {
						
						try {
							rs.close();
							
						}catch(SQLException e) {
							
							throw new DbException(e.getMessage());
						}
						
					}
				
			}
			
			// Método para fechar o Statement
			
			public static void closeStatement(Statement stmt ) {
				
				if (stmt != null) {
					
					try {
						stmt.close();
						
					}catch(SQLException e) {
						
						throw new DbException(e.getMessage());
					}
					
				}
			
		}
			
}
