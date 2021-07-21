package Practica1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Ejemplos35.DataBaseHelper;
import Ejemplos35.Libro;

public class Telefono {
	private int numero;
	private String marca;
	private double importe;
	static final String CONSULTA_INSERTAR = "insert into telefonos (Numero,Marca,Importe) values (?,?,?)";
	static final String CONSULTA_BORRAR = "delete from telefonos where Numero =?";
	final static String CONSULTA_ACTUALIZAR = "update telefonos set marca=? , importe=? where numero=?";
	final static String CONSULTA_BUSCAR_UNO = "select * from telefonos where numero=?";
	final static String CONSULTA_BUSCAR_UNO_NUMERO= "select * from telefonos where numero=?";
	final static String CONSULTA_BUSCAR_UNO_MARCA= "select * from telefonos where marca=?";
	final static String CONSULTA_BUSCAR_UNO_IMPORTE= "select * from telefonos where importe=?";
	private static DataBaseHelper helper = new DataBaseHelper();

	public Telefono(int numero, String marca, double importe) {
		super();
		this.numero = numero;
		this.marca = marca;
		this.importe = importe;
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

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public void insertar() {

		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_INSERTAR);) {

			sentencia.setInt(1, this.getNumero());
			sentencia.setString(2, this.getMarca());
			sentencia.setDouble(3, this.getImporte());
			sentencia.execute();
			System.out.println("Libro insertado");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void borrar() {
		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BORRAR);) {

			sentencia.setInt(1, this.getNumero());
			sentencia.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void actualizar() {

		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_ACTUALIZAR);) {

			sentencia.setInt(3, this.getNumero());
			sentencia.setString(1, this.getMarca());
			sentencia.setDouble(2, this.getImporte());
			sentencia.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static List<Telefono> buscarTodos() {
		final String CONSULTA = "select * from telefonos";
		DataBaseHelper helper = new DataBaseHelper();
		List<Telefono> listaTelefonos = new ArrayList<Telefono>();
		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				Statement sentencia = conn.createStatement();
				ResultSet rs = sentencia.executeQuery(CONSULTA);) {
			while (rs.next()) {
				Telefono t = new Telefono(rs.getInt("Numero"), rs.getString("Marca"), rs.getDouble("Importe"));
				listaTelefonos.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaTelefonos;
	}
	public static Telefono buscarPorNumero(int numero) {

		Telefono tel = null;
		//String consulta_buscar=CONSULTA_BUSCAR_UNO+"'"+isbn+"'";
		//System.out.println(consulta_buscar);
		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO);) {
			sentencia.setInt(1, numero);
			ResultSet rs = sentencia.executeQuery();
			rs.next();

			tel = new Telefono(rs.getInt("Numero"), rs.getString("Marca"), rs.getDouble("Importe"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tel;
	}
	public static Telefono buscarPorMarca(String marca) {

		Telefono tel = null;
		//String consulta_buscar=CONSULTA_BUSCAR_UNO+"'"+isbn+"'";
		//System.out.println(consulta_buscar);
		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO_MARCA);) {
			sentencia.setString(1, marca);
			ResultSet rs = sentencia.executeQuery();
			rs.next();

			tel = new Telefono(rs.getInt("Numero"), rs.getString("Marca"), rs.getDouble("Importe"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tel;
	}
	public static Telefono buscarPorImporte(double importe) {

		Telefono tel = null;
		//String consulta_buscar=CONSULTA_BUSCAR_UNO+"'"+isbn+"'";
		//System.out.println(consulta_buscar);
		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO_IMPORTE);) {
			sentencia.setDouble(1, importe);
			ResultSet rs = sentencia.executeQuery();
			rs.next();

			tel = new Telefono(rs.getInt("Numero"), rs.getString("Marca"), rs.getDouble("Importe"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tel;
	}

}
