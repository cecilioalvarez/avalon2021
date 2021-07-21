package practica1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sql2.DataBaseHelper;
import sql2.Libro;

public class Telefono {
	private int numero;
	private String marca;
	private double precio;
	private static DataBaseHelper helper = new DataBaseHelper();

	final static String CONSULTA_INSERTAR = "insert into telefono (numero,marca,precio) values (?,?,?)";
	final static String CONSULTA_BORRAR = "delete from telefono  where numero =?";
	final static String CONSULTA_BUSCAR_TODOS = "select * from telefono";
	final static String CONSULTA_UPDATE = "UPDATE `telefono` SET `numero` = ?, `marca` = ?, `precio` = ? WHERE `telefono`.`numero` = ?;";

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

	public void insertar() {

		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_INSERTAR);) {

			sentencia.setInt(1, this.getNumero());
			sentencia.setString(2, this.getMarca());
			sentencia.setDouble(3, this.getPrecio());
			sentencia.execute();
			System.out.println("Insertado correctamente");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update(int numero) {

		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_UPDATE);) {

			sentencia.setInt(1, this.getNumero());
			sentencia.setString(2, this.getMarca());
			sentencia.setDouble(3, this.getPrecio());
			sentencia.setInt(4, numero);

			sentencia.execute();
			System.out.println(CONSULTA_UPDATE);
			System.out.println("Actualizado correctamente");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	public void borrar() {
		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BORRAR);) {

			sentencia.setInt(1, this.getNumero());
			sentencia.execute();
			System.out.println("Telefono borrado correctamente");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public Telefono buscarUno(int numero) {

		String CONSULTA_LIBRO = "select * from telefono where numero = ?";

		Telefono telefonoBuscado = null;

		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_LIBRO);) {
			sentencia.setInt(1, numero);
			ResultSet rs = sentencia.executeQuery();
			

			while (rs.next()) {

				telefonoBuscado = new Telefono(rs.getInt("numero"), rs.getString("marca"), rs.getDouble("precio"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return telefonoBuscado;

	}


}
