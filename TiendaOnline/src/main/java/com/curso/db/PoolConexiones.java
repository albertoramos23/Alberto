package com.curso.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class PoolConexiones {//para que nadie la herede.
	
	private String url = "jdbc:oracle:thin:@localhost:49161:xe";
	//private String url = "jdbc:oracle:thin:localhost:@192.168.8.99:49161:xe";
	private String usr = "HR";//SYSTEM
	private String clave = "hr";//"oracle"
	
	public PoolConexiones() {
		// Cargar Driver
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("cargó ok");
		} catch (ClassNotFoundException e) {
			System.out.println("No cargó driver");
			e.printStackTrace();
			throw new RuntimeException("No se pudo cargar el driver Oracle");
		}
		
	}// fin cosntructor
	
	public Connection getConnection() {
		
		Connection con ;
		try {
			
		con = DriverManager.getConnection(url,usr,clave);
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("No se pudo conectar"+ e.getMessage());
		}
		return con;
		
		
	}
	
	
	
	
}//fin
