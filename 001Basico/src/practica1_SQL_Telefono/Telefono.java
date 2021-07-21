package practica1_SQL_Telefono;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Telefono {
	
	private int numero;
	private String marca;
	private double precio;
	
	final static String QUERYINSERT = "INSERT INTO Phones(numero, marca, precio) VALUES(?,?,?)";
	final static String QUERYSELECT = "SELECT * FROM Phones";
	final static String QUERYFINDBrand = "SELECT * FROM Phones WHERE marca=?";
	final static String QUERYDELETE= "DELETE FROM Phones WHERE numero=?";
	final static String QUERYUPDATEPrice = "UPDATE Phones set precio=? WHERE numero=?";
	final static String QUERYUPDATEBrand = "UPDATE Phones set marca=? WHERE numero=?";
	final static String QUERYFINDONE = "SELECT * FROM Phones WHERE numero=?";
	private static DataBaseHelper helper= new DataBaseHelper();
	
	public Telefono(int numero, String marca, double precio) {
		super();
		this.numero = numero;
		this.marca = marca;
		this.precio = precio;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//estático porque busca todos los libros
	public static List<Telefono>getAllPhones(){
		
		List<Telefono> listaTelefonos = new ArrayList<Telefono>();
		try(Connection conn = helper.getConexion();
				Statement sentencia = conn.createStatement();) {
			//Para Resultados de SELECT
			ResultSet rs = sentencia.executeQuery(QUERYSELECT);
			
			while (rs.next()) {
				Telefono phoneAux = new Telefono(rs.getInt("numero"), rs.getString("marca"), rs.getDouble("precio"));
				listaTelefonos.add(phoneAux);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaTelefonos;
	}
	//Ver 1
	public static Telefono getPhone(int numero){
		
		Telefono telefono = null;
		try(Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(QUERYFINDONE);) {
			sentencia.setInt(1, numero);
			//Para Resultados de SELECT
			
			ResultSet rs = sentencia.executeQuery();
			if(rs.next()) {
				Telefono phoneAux = new Telefono(rs.getInt("numero"), rs.getString("marca"), rs.getDouble("precio"));
				telefono= phoneAux;
			}
				
				
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return telefono;
	}
	
	public static List<Telefono> getPhonebyBrand(String brand){
		
		List<Telefono> listaTelefonos = new ArrayList<Telefono>();
		try(Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(QUERYFINDBrand);) {
			sentencia.setString(1, brand);
			//Para Resultados de SELECT
			
			ResultSet rs = sentencia.executeQuery();
			while(rs.next()) {
				Telefono telAux = new Telefono(rs.getInt("numero"), rs.getString("marca"), rs.getDouble("precio"));
				listaTelefonos.add(telAux);
			}
				
				
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaTelefonos;
	}
	
	//Agregar a DB
	public void addPhone() {
		
		try(Connection conn = helper.getConexion();){
			conn.setAutoCommit(false);
			try(PreparedStatement prepSentencia = conn.prepareStatement(QUERYINSERT);){
				//PreparedStatement
			
				prepSentencia.setInt(1, this.getNumero());
				prepSentencia.setString(2, this.getMarca());
				prepSentencia.setDouble(3, this.getPrecio());
			
				prepSentencia.execute();
			}catch (Exception ex) {
				ex.printStackTrace();
				conn.rollback();
			}
			
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		//Borrar DB
		public void removePhone() {
			
			try(Connection conn = helper.getConexion();){
				conn.setAutoCommit(false);
				try(PreparedStatement prepSentencia = conn.prepareStatement(QUERYDELETE);){
					//PreparedStatement
				
					prepSentencia.setInt(1, this.getNumero());
				
					prepSentencia.execute();
				}catch (Exception ex) {
					ex.printStackTrace();
					conn.rollback();
				}
				
				conn.commit();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		public void modifyPhonePrice(Double newData) {
			
			try(Connection conn = helper.getConexion();){
				conn.setAutoCommit(false);
				try(PreparedStatement prepSentencia = conn.prepareStatement(QUERYUPDATEPrice);){
					//PreparedStatement
				
					prepSentencia.setDouble(1, newData);
					prepSentencia.setInt(2, this.numero);
				
					prepSentencia.execute();
				}catch (Exception ex) {
					ex.printStackTrace();
					conn.rollback();
				}
				
				conn.commit();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void modifyPhoneBrand(String newData) {
			
			try(Connection conn = helper.getConexion();){
				conn.setAutoCommit(false);
				try(PreparedStatement prepSentencia = conn.prepareStatement(QUERYUPDATEBrand);){
					//PreparedStatement
				
					prepSentencia.setString(1, newData);
					prepSentencia.setInt(2, this.numero);
				
					prepSentencia.execute();
				}catch (Exception ex) {
					ex.printStackTrace();
					conn.rollback();
				}
				
				conn.commit();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public String toString() {
			return "Datos del telefono: numero = " + numero + ", marca = " + marca + ", precio = " + precio;
		}

		
}
