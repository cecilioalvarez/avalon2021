package com.arquitecturajava.sql.book;

import com.arquitecturajava.sql.connection.DbConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class BookRepositoryJDBC implements BookRepository {

    @Override
    public Book selectWithChapters(Book book) {
        final String QUERY = "SELECT * FROM book b "
                + "JOIN author a ON b.fk_author = a.pk_id "
                + "LEFT JOIN chapter c ON b.pk_isbn = c.fk_book "
                + "WHERE b.pk_isbn = ?";
        Book searchedBook = null;
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, book.getPK_ISBN());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                if (searchedBook == null) {
                    Author author = new Author(resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
                    searchedBook = new Book(resultSet.getString(1), resultSet.getString(2), author);
                }
                searchedBook.addChapter(new Chapter(resultSet.getString(7), resultSet.getInt(8), book));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return searchedBook;
    }

    @Override
    public List<Book> selectWithChapters() {
        final String QUERY = "SELECT * FROM book b "
                + "JOIN author a ON b.fk_author = a.pk_id "
                + "JOIN chapter c ON b.pk_isbn = c.fk_book";
        final List<Book> BOOKS = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY);
            while (resultSet.next()) {
                Book book = new Book(resultSet.getString("pk_isbn"));
                if (!BOOKS.contains(book)) {
                    book.setTitle(resultSet.getString("title"));
                    book.setFk_author(new Author(resultSet.getString("pk_id"), resultSet.getString("name"), resultSet.getInt("age")));
                    BOOKS.add(book);
                } else {
                    book = BOOKS.get(BOOKS.size() - 1);
                }
                book.addChapter(new Chapter(resultSet.getString("pk_title"), resultSet.getInt("pages"), book));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return BOOKS;
    }
    
    public List<Book> select() {
        final String QUERY = "SELECT * FROM book b "
                + "JOIN author a ON b.fk_author = a.pk_id "
                + "LEFT JOIN chapter c ON b.pk_isbn = c.fk_book";
        final List<Book> BOOKS = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY);
            while (resultSet.next()) {
                Book book = new Book(resultSet.getString("pk_isbn"));
                if (!BOOKS.contains(book)) {
                    book.setTitle(resultSet.getString("title"));
                    book.setFk_author(new Author(resultSet.getString("pk_id"), resultSet.getString("name"), resultSet.getInt("age")));
                    BOOKS.add(book);
                } else {
                    book = BOOKS.get(BOOKS.size() - 1);
                }
                book.addChapter(new Chapter(resultSet.getString("pk_title"), resultSet.getInt("pages"), book));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return BOOKS;
    }

    @Override
    public List<Book> select(String fk_author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String fk_author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updatePk_isbn(Book book, String pk_isbn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateTitle(Book book, String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateAuthor(Book book, Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}