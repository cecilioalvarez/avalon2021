package practica1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ejercicio35.LibroAR;



public class Telefono {
	private int numero;
	private String marca;
	private double importe;
	private static DataBaseHelper helper = new DataBaseHelper();
	
	final static String CONSULTA_INSERTAR = "insert into telefonos (numero,marca,importe) values(?,?,?)";
	final static String CONSULTA_BORRAR = "delete from telefonos where numero=?";
	final static String CONSULTA_BUSCAR_TODOS = "select * from telefonos";
	final static String CONSULTA_ACTUALIZAR = "update telefonos set numero=?, marca=?, importe=? where numero=?";
	
	public Telefono() {
		super();
	}
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

		try {
			Connection conn = helper.getConexion();
			PreparedStatement sentencia = conn.prepareStatement(CONSULTA_INSERTAR);
			sentencia.setInt(1, this.getNumero());
			sentencia.setString(2, this.getMarca());
			sentencia.setDouble(3, this.getImporte());
			sentencia.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void borrar() {
		try {
			Connection conn = helper.getConexion();
			PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BORRAR);
			sentencia.setInt(1, this.getNumero());
			sentencia.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void actualizar() {

		try {
			Connection conn = helper.getConexion();
			PreparedStatement sentencia = conn.prepareStatement(CONSULTA_ACTUALIZAR);

			sentencia.setInt(1, this.getNumero());
			sentencia.setString(2, this.getMarca());
			sentencia.setDouble(3, this.getImporte());
			sentencia.setDouble(4, this.getNumero());
			sentencia.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static List<Telefono> mostrarTodos() {

		List<Telefono> listaTelefonos = new ArrayList<Telefono>();

		try {
			Connection conn = helper.getConexion();
			Statement sentencia = conn.createStatement();
			ResultSet rs = sentencia.executeQuery(CONSULTA_BUSCAR_TODOS);
			while (rs.next()) {
				Telefono t = new Telefono(rs.getInt("numero"), rs.getString("marca"), rs.getDouble("importe"));
				listaTelefonos.add(t);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaTelefonos;

	}
	@Override
	public String toString() {
		return "Telefono [numero=" + numero + ", marca=" + marca + ", importe=" + importe + "]";
	}
	
	
}
