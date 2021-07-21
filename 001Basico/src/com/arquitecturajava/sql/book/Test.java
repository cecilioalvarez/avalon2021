package com.arquitecturajava.sql.book;

import com.arquitecturajava.sql.connection.DbConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

class Test {
    
    private static final String SELECT_AUTHORS_QUERY = "SELECT * FROM author";
    private static final String SELECT_AUTHOR_PREPAREDQUERY = "SELECT * FROM author WHERE pk_id = ?";
    private static final String INSERT_AUTHOR_PREPAREDQUERY = "INSERT INTO author (pk_id, name, age) VALUES (?, ?, ?)";
    private static final String UPDATE_AGE_PREPAREDQUERY = "UPDATE author SET age = ? WHERE id = ?";
    private static final String UPDATE_NAME_PREPAREDQUERY = "UPDATE author SET name = ? WHERE id = ?";
    
    private static final String SELECT_BOOKS_QUERY = "SELECT b.pk_isbn, b.title, a.name FROM book b JOIN author a ON b.fk_id = a.pk_id";
    private static final String SELECT_BOOK_PREPAREDQUERY = "SELECT b.pk_isbn, b.title, a.name FROM book b JOIN author a"
            + " ON b.fk_id = a.pk_id WHERE b.isbn = ?";
    private static final String INSERT_BOOK_PREPAREDQUERY = "INSERT INTO book (pk_isbn, title, fk_id) VALUES (?, ?, ?)";
    private static final String UPDATE_TITLE_PREPAREDQUERY = "UPDATE book SET title = ? WHERE pk_isbn = ?";
    private static final String UPDATE_AUTHOR_PREPAREDQUERY = "UPDATE book SET fk_id = ? WHERE pk_isbn = ?";
    private static final String DELETE_BOOK_PREPAREDQUERY = "DELETE FROM book WHERE pk_isbn = ?";
    
    private static void insertAuthor(Author person) {
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(INSERT_BOOK_PREPAREDQUERY)) {
            preparedStatement.setString(1, person.getPK_ID());
            preparedStatement.setString(2, person.getName());
            preparedStatement.setInt(3, person.getAge());
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción: " + sql_ex.getMessage());
        }
    }
    
    private static void insertAuthor(Author ...people) {
        Connection conn = DbConnectionSingleton.getConnection();
        try {
            conn.setAutoCommit(false);
            Arrays.asList(people).forEach(person -> Test.insertAuthor(person));
            conn.commit();
        } catch (SQLException sql_ex) {
             System.err.println("Se ha producido un error al insertar el conjunto de personas. "
                     + "Se cancelan todas las inserciones: " + sql_ex.getMessage());
            try {
                conn.rollback();
            } catch (SQLException sql_rb_ex) {
                System.err.println("Se ha producido un error al intentar cancelar la transacción: " + sql_rb_ex.getMessage());
            }
        } finally {
            try {
                conn.close();
            } catch (SQLException sql_ex) {
                System.err.println("Se ha producido un error al intentar cerrar la conexión: " + sql_ex.getMessage());
            }
        }
    }
        
    private static void updateAuthorAge(String id, int age) {
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(UPDATE_AGE_PREPAREDQUERY)) {
            preparedStatement.setInt(1, age);
            preparedStatement.setString(2, id);
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
    }
    
    private static void updateAuthorName(String id, String name) {
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(UPDATE_NAME_PREPAREDQUERY)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, id);
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
    }
    
    private static void showAuthors() {
        System.out.println("A continuación se muestran los datos de los registros de la tabla «persona»:");
        try (Connection conn = DbConnectionSingleton.getConnection();
                Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_AUTHORS_QUERY);
            while (resultSet.next()) {                
                System.out.println(new Author(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3)));
            }    
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
    }
    
    private static void insertBook(Book book) {
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(INSERT_BOOK_PREPAREDQUERY)) {
            preparedStatement.setString(1, book.getPK_ISBN());
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.setString(3, book.getFk_id());
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción.: " + sql_ex.getMessage());
        }
    }
    
    private static void insertBook(Book ...books) {
        Connection conn = DbConnectionSingleton.getConnection();
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
            } catch (SQLException sql_ex) {
                System.err.println("Se ha producido un error al intentar cerrar la conexión: " + sql_ex.getMessage());
            }
        }
    }
        
    private static void updateBookTitle(String isbn, String title) {
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(UPDATE_TITLE_PREPAREDQUERY)) {
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, isbn);
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
    }
    
    private static void updateBookAuthor(String isbn, String id) {
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(UPDATE_AUTHOR_PREPAREDQUERY)) {
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, isbn);
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
    }
    
    private static void removeBook(String isbn) {
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(DELETE_BOOK_PREPAREDQUERY)) {
            preparedStatement.setString(1, isbn);
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
    }
    
    private static Author getAuthor(String id) {
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(SELECT_AUTHOR_PREPAREDQUERY)) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Author(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return null;
    }
    
    private static void showBooks() {
        System.out.println("A continuación se muestran los datos de los registros de la tabla «libro»:");
        try (Connection conn = DbConnectionSingleton.getConnection();
                Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_BOOKS_QUERY);
            while (resultSet.next()) {                
                System.out.println(new DaoBook(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)));
            }    
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
    }
    
    private static void genericIntegerValueUpdate(String table, String column, int newValue, String primaryKeyColumn, String primaryKeyValue) {
        final String QUERY = "UPDATE " + table + " SET " + column + " = ? WHERE " + primaryKeyColumn + " = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, newValue);
            preparedStatement.setString(2, primaryKeyValue);
            preparedStatement.executeQuery();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
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