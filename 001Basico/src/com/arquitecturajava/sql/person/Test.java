package com.arquitecturajava.sql.person;

import com.arquitecturajava.sql.connection.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

class Test {
    
    private static String insertAuthorQuery = "INSERT INTO author (pk_id, name, age) VALUES (?, ?, ?)";
    private static String selectAuthorQuery = "SELECT * FROM author WHERE pk_id = ?";
    private static String selectBooksQuery = "SELECT b.pk_isbn, b.title, a.name FROM book b JOIN author a ON b.fk_id = a.pk_id";
    private static String updateAgeQuery = "UPDATE person SET age = ? WHERE id = ?";
    private static String updateNameQuery = "UPDATE person SET name = ? WHERE id = ?";
    
    private static String insertBookQuery = "INSERT INTO book (pk_isbn, title, fk_id) VALUES (?, ?, ?)";
    private static String updateTitleQuery = "UPDATE book SET title = ? WHERE pk_isbn = ?";
    private static String updateAuthorQuery = "UPDATE book SET fk_id = ? WHERE pk_isbn = ?";
    
    private static void insertPerson(Author person) {
        try (Connection conn = DbConnection.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(insertBookQuery)) {
            preparedStatement.setString(1, person.getPK_ID());
            preparedStatement.setString(2, person.getName());
            preparedStatement.setInt(3, person.getAge());
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción.");
        }
    }
    
    private static void insertAuthor(Author ...people) {
        Connection conn = DbConnection.getConnection();
        try {
            conn.setAutoCommit(false);
            Arrays.asList(people).forEach(person -> Test.insertPerson(person));
            conn.commit();
        } catch (SQLException sql_ex) {
             System.err.println("Se ha producido un error al insertar el conjunto de personas. Se cancelan todas las inserciones.");
            try {
                conn.rollback();
            } catch (SQLException ex) {
                System.err.println("Se ha producido un error al intentar cancelar la transacción.");
            }
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.err.println("Se ha producido un error al intentar cerrar la conexión.");
            }
        }
    }
        
    private static void updateAuthorAge(String id, int age) {
        try (Connection conn = DbConnection.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(updateAgeQuery)) {
            preparedStatement.setInt(1, age);
            preparedStatement.setString(2, id);
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción.");
        }
    }
    
    private static void updateAuthorName(String id, String name) {
        try (Connection conn = DbConnection.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(updateNameQuery)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, id);
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción.");
        }
    }
    
    private static void showAuthors() {
        System.out.println("A continuación se muestran los datos de los registros de la tabla «persona»:");
        try (Connection conn = DbConnection.getConnection();
                Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM person");
            while (resultSet.next()) {                
                System.out.println(new Author(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3)));
            }    
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción.");
        }
    }
    
    private static void insertBook(Book book) {
        try (Connection conn = DbConnection.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(insertBookQuery)) {
            preparedStatement.setString(1, book.getPK_ISBN());
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.setString(3, book.getFk_id());
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción.");
            sql_ex.printStackTrace();
        }
    }
    
    private static void insertBook(Book ...books) {
        Connection conn = DbConnection.getConnection();
        try {
            conn.setAutoCommit(false);
            Arrays.asList(books).forEach(book -> Test.insertBook(book));
            conn.commit();
        } catch (SQLException sql_ex) {
             System.err.println("Se ha producido un error al insertar el conjunto de libros. Se cancelan todas las inserciones.");
            try {
                conn.rollback();
            } catch (SQLException ex) {
                System.err.println("Se ha producido un error al intentar cancelar la transacción.");
            }
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.err.println("Se ha producido un error al intentar cerrar la conexión.");
            }
        }
    }
        
    private static void updateBookTitle(String isbn, String title) {
        try (Connection conn = DbConnection.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(updateTitleQuery)) {
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, isbn);
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción.");
        }
    }
    
    private static void updateBookAuthor(String isbn, String id) {
        try (Connection conn = DbConnection.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(updateAuthorQuery)) {
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, isbn);
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción.");
        }
    }
    
    private static Author getAuthor(String id) {
        try (Connection conn = DbConnection.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(selectAuthorQuery)) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Author(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección.");
        }
        return null;
    }
    
    private static void showBooks() {
        System.out.println("A continuación se muestran los datos de los registros de la tabla «libro»:");
        try (Connection conn = DbConnection.getConnection();
                Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(selectBooksQuery);
            while (resultSet.next()) {                
                System.out.println(new DtoBook(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)));
            }    
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección.");
            sql_ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        Test.insertPerson(
//                new Author(
//                        IOHelper.askForString("el NIF", 9, 9),
//                        IOHelper.askForString("el nombre", 3, 25),
//                        IOHelper.askForInteger("la edad", 0, 120)
//                )
//        );
//        Test.showPeople();
//        Test.updatePersonAge(
//                IOHelper.askForString("el NIF", 9, 9),
//                IOHelper.askForInteger("la edad", 0, 120)
//        );
//        Test.showPeople();
//        Test.updatePersonName(
//                IOHelper.askForString("el NIF", 9, 9),
//                IOHelper.askForString("el nombre", 3, 25)
//        );
//        Test.showPeople();
        
        /*Test.insertBook(
                new Book("5fksir68r30hh", "Don Quijote de La Mancha", "11111111h"), 
                new Book("fif6her901cxp", "Fuenteovejuna", "22222222j"),
                new Book("lgoh7564fjgrt", "Don Juan Tenorio", "33333333p"), 
                new Book("dhrte1230lce4", "El Lazarillo de Tormes", "00000000t")
        );*/
        Test.showBooks();
    }
}