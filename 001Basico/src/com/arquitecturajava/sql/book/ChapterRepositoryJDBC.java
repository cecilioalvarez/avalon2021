package com.arquitecturajava.sql.book;

import com.arquitecturajava.sql.connection.DbConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class ChapterRepositoryJDBC implements ChapterRepository {

    @Override
    public Chapter select(Chapter chapter) {
        final String QUERY = "SELECT * FROM chapter WHERE pk_title = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, chapter.getPK_TITLE());
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next() ? new Chapter(resultSet.getString(1), resultSet.getInt(2)) : null;
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return null;
    }

    @Override
    public List<Chapter> select(String fk_book) {
        final String QUERY = "SELECT * FROM chapter WHERE fk_book = ?";
        final List<Chapter> CHAPTERS = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, fk_book);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                CHAPTERS.add(new Chapter(resultSet.getString(1), resultSet.getInt(2)));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return CHAPTERS;
    }

    @Override
    public List<Chapter> select() {
        final String QUERY = "SELECT * FROM chapter";
        final List<Chapter> CHAPTERS = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY);
            while (resultSet.next()) {
                CHAPTERS.add(new Chapter(resultSet.getString(1), resultSet.getInt(2)));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return CHAPTERS;
    }

    @Override
    public int insert(Chapter chapter) {
        final String QUERY = "INSERT INTO chapter (pk_title, pages, fk_book) VALUES (?, ?, ?)";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, chapter.getPK_TITLE());
            preparedStatement.setInt(2, chapter.getPAGES());
            preparedStatement.setString(3, chapter.getFk_book().getPK_ISBN());
            preparedStatement.execute();
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción: " + sql_ex.getMessage());
        }
        return 0;
    }

    @Override
    public int delete(Chapter chapter) {
        final String QUERY = "DELETE FROM chapter WHERE pk_title = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, chapter.getPK_TITLE());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
        return 0;
    }

    @Override
    public int delete(String fk_isbn) {
        final String QUERY = "DELETE FROM chapter WHERE fk_book = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, fk_isbn);
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
        return 0;
    }

    @Override
    public int update(Chapter chapter) {
        final String QUERY = "UPDATE chapter SET pages = ?, fk_book = ? WHERE pk_title = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, chapter.getPAGES());
            preparedStatement.setString(2, chapter.getFk_book().getPK_ISBN());
            preparedStatement.setString(3, chapter.getPK_TITLE());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
        return 0;
    }

    @Override
    public int updateTitle(Chapter chapter, String title) {
        final String QUERY = "UPDATE chapter SET pk_title = ? WHERE pk_title = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, chapter.getPK_TITLE());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
        return 0;
    }

    @Override
    public int updatePages(Chapter chapter, int pages) {
        final String QUERY = "UPDATE chapter SET pages = ? WHERE pk_title = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, pages);
            preparedStatement.setString(2, chapter.getPK_TITLE());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
        return 0;
    }

    @Override
    public int updateBook(Chapter chapter, String fk_isbn) {
        final String QUERY = "UPDATE chapter SET fk_book = ? WHERE pk_title = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, fk_isbn);
            preparedStatement.setString(2, chapter.getPK_TITLE());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
        return 0;
    }
}