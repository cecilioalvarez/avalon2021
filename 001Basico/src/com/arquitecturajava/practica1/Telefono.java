package com.arquitecturajava.practica1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.ejemplos35Cecilio.DataBaseHelper;
import com.arquitecturajava.ejemplos35Cecilio.LibroAR;

public class Telefono {
	private int numero;
	private String marca;
	private double importe;
	private static DataBaseHelper helper = new DataBaseHelper();
	final static String CONSULTA_INSERTAR = "insert into telefonos (numero,marca,importe) values (?,?,?)";
	final static String CONSULTA_TODOSLOSTELEFONOS = "select * from telefonos";
	final static String CONSULTA_BUSCAR_UNO_MARCA = "select * from telefonos where marca=?";
	final static String CONSULTA_BUSCAR_MARCA_NUMERO = "select * from telefonos where numero =? and marca =?";
	
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
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Telefono(int numero, String marca, double importe) {
		super();
		this.numero = numero;
		this.marca = marca;
		this.importe = importe;
	}
	
	public void insertarTelefono() {
		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_INSERTAR);) {

			sentencia.setInt(1, this.getNumero());;
			sentencia.setString(2, this.getMarca());
			sentencia.setDouble(3, this.getImporte());
			sentencia.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<Telefono> buscarTodos() {

		List<Telefono> listaTelefono = new ArrayList<Telefono>();

		try (Connection conn = helper.getConexion();
				Statement sentencia = conn.createStatement();
				ResultSet rs = sentencia.executeQuery(CONSULTA_TODOSLOSTELEFONOS);) {
			while (rs.next()) {

				Telefono l = new Telefono(rs.getInt("numero"), rs.getString("marca"), rs.getDouble("importe"));
				listaTelefono.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaTelefono;
	}
	
	public static Telefono buscarUnoPorMarca(String marca) {

		Telefono telefono = null;
		
		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO_MARCA);){
				sentencia.setString(1, marca);
				ResultSet rs = sentencia.executeQuery();
				rs.next();

				telefono = new Telefono(rs.getInt("numero"), rs.getString("marca"), rs.getDouble("importe"));
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return telefono;

	}
	
	public static List<Telefono> buscarTodosNumeroMarca(int numero, String marca) {

		List<Telefono> listaTelefonos = new ArrayList<Telefono>();

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_MARCA_NUMERO);) {
				sentencia.setInt(1, numero);
				sentencia.setString(2, marca);
				
				ResultSet rs = sentencia.executeQuery();
				while (rs.next()) {
	
					Telefono l = new Telefono(rs.getInt("numero"), rs.getString("marca"), rs.getDouble("importe"));
					listaTelefonos.add(l);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaTelefonos;

	}
	
}
