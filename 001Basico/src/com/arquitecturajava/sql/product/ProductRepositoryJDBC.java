package com.arquitecturajava.sql.product;

import com.arquitecturajava.sql.connection.DbConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class ProductRepositoryJDBC implements ProductRepository {
    
    @Override
    public int insert(Product product) {
        final String QUERY = "INSERT INTO product (name, price) VALUES (?, ?)";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción: " + sql_ex.getMessage());
        }
        return 0;
    }

    @Override
    public int update(Product product) {
        final String QUERY = "UPDATE product SET name = ?, price = ? WHERE pk_id = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getPk_id());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public int updateName(Product product, String newValue) {
        final String QUERY = "UPDATE product SET name = ? WHERE pk_id = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, newValue);
            preparedStatement.setInt(2, product.getPk_id());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public int updatePrice(Product product, double newValue) {
        final String QUERY = "UPDATE product SET price = ? WHERE pk_id = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setDouble(1, newValue);
            preparedStatement.setInt(2, product.getPk_id());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public int delete(Product product) {
        final String QUERY = "DELETE FROM product WHERE pk_id = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, product.getPk_id());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public int delete(String name) {
        final String QUERY = "DELETE FROM product WHERE name = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, name);
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public int delete(double price) {
        final String QUERY = "DELETE FROM product WHERE price = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setDouble(1, price);
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public int delete(String name, double price) {
        final String QUERY = "DELETE FROM product WHERE name = ? AND price = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public Product select(Product product) {
        final String QUERY = "SELECT * FROM product WHERE pk_id = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, product.getPk_id());
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next() ? new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)) : null;
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return null;
    }
    
    @Override
    public List<Product> select() {
        final String QUERY = "SELECT * FROM product";
        final List<Product> PRODUCTS = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY);
            while (resultSet.next()) {
                PRODUCTS.add(new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return PRODUCTS;
    }
    
    @Override
    public List<Product> select(String name) {
        final String QUERY = "SELECT * FROM product WHERE name = ?";
        final List<Product> PRODUCTS = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            preparedStatement.setString(1, name);
            while (resultSet.next()) {
                PRODUCTS.add(new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return PRODUCTS;
    }
    
    @Override
    public List<Product> select(double price) {
        final String QUERY = "SELECT * FROM product WHERE price = ?";
        final List<Product> PRODUCTS = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            preparedStatement.setDouble(1, price);
            while (resultSet.next()) {
                PRODUCTS.add(new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return PRODUCTS;
    }
    
    @Override
    public List<Product> select(String name, double price) {
        final String QUERY = "SELECT * FROM product WHERE name = ? AND price ?";
        final List<Product> PRODUCTS = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            while (resultSet.next()) {
                PRODUCTS.add(new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return PRODUCTS;
    }
}