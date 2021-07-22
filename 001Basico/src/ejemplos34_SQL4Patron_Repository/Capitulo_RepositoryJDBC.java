package ejemplos34_SQL4Patron_Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Capitulo_RepositoryJDBC implements Capitulo_Repository {

	final static String QUERYINSERT = "INSERT INTO capitulos(titulo, paginas, libro_isbn) VALUES(?,?,?)";
	final static String QUERYDELETE= "DELETE FROM capitulos WHERE titulo=?";
	final static String QUERYSELECT = "SELECT * FROM capitulos";
	final static String QUERYFINDONE = "SELECT * FROM capitulos WHERE libro_isbn=?";
	final static String QUERYUPDATE = "UPDATE capitulos set titulo=?,paginas=?,libro_isbn=? WHERE titulo=?";
	private static DataBaseHelper helper= new DataBaseHelper();
	
	@Override
	public void addChapter(Capitulo chapter) {
		
		try(Connection conn = helper.getConexion();){
			conn.setAutoCommit(false);
			try(PreparedStatement prepSentencia = conn.prepareStatement(QUERYINSERT);){
				//PreparedStatement
			
				prepSentencia.setString(1, chapter.getTitulo());
				prepSentencia.setInt(2, chapter.getPaginas());
				prepSentencia.setString(3, chapter.getLibro_isbn());
			
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
	public void removeChapter(Capitulo chapter) {
		
		try(Connection conn = helper.getConexion();){
			conn.setAutoCommit(false);
			try(PreparedStatement prepSentencia = conn.prepareStatement(QUERYDELETE);){
				//PreparedStatement
			
				prepSentencia.setString(1, chapter.getTitulo());
			
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
	public List<Capitulo>getAllChapters(){
		
		List<Capitulo> listaCapitulos = new ArrayList<Capitulo>();
		try(Connection conn = helper.getConexion();
				Statement sentencia = conn.createStatement();) {
			//Para Resultados de SELECT
			ResultSet rs = sentencia.executeQuery(QUERYSELECT);
			
			while (rs.next()) {
				Capitulo l = new Capitulo(rs.getString("titulo"), rs.getInt("paginas"), rs.getString("libro_isbn"));
				listaCapitulos.add(l);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaCapitulos;
	}
	
	@Override
	public List<Capitulo> getBookChapters(String isbn){
		
		List<Capitulo> listaCapitulos = new ArrayList<Capitulo>();
		try(Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(QUERYFINDONE);) {
			sentencia.setString(1, isbn);
			//Para Resultados de SELECT
			
			ResultSet rs = sentencia.executeQuery();
			if(rs.next()) {
				Capitulo l = new Capitulo(rs.getString("titulo"), rs.getInt("paginas"), rs.getString("libro_isbn"));
				listaCapitulos.add(l);
			}
				
				
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaCapitulos;
	}
	
	@Override
	public void modifyChapter(Capitulo chapter) {
		
		try(Connection conn = helper.getConexion();){
			conn.setAutoCommit(false);
			try(PreparedStatement prepSentencia = conn.prepareStatement(QUERYUPDATE);){
				//PreparedStatement
			
				prepSentencia.setString(1, chapter.getTitulo());
				prepSentencia.setInt(2, chapter.getPaginas());
				prepSentencia.setString(3, chapter.getLibro_isbn());
				prepSentencia.setString(4, chapter.getTitulo());
			
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
}
