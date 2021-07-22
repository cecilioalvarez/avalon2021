package com.arquitecturajava.sql.product;

import com.arquitecturajava.sql.ActiveRecord;
import com.arquitecturajava.sql.connection.DbConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class ProductAr implements ActiveRecord {
    
    private Product product;

    ProductAr(Product product) {
        this.product = product;
    }
    
    ProductAr() {
    }

    public Product getProduct() {
        return product;
    }
    
    @Override
    public int insert() {
        final String QUERY = "INSERT INTO product (name, price) VALUES (?, ?)";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, this.product.getName());
            preparedStatement.setDouble(2, this.product.getPrice());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción: " + sql_ex.getMessage());
        }
        return 0;
    }

    @Override
    public int update() {
        final String QUERY = "UPDATE product SET name = ?, price = ? WHERE pk_id = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, this.product.getName());
            preparedStatement.setDouble(2, this.product.getPrice());
            preparedStatement.setInt(3, this.product.getPk_id());
            preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    int updateName(String newValue) {
        final String QUERY = "UPDATE product SET name = ? WHERE pk_id = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, newValue);
            preparedStatement.setInt(2, this.product.getPk_id());
            preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    int updatePrice(double newValue) {
        final String QUERY = "UPDATE product SET price = ? WHERE pk_id = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setDouble(1, newValue);
            preparedStatement.setInt(2, this.product.getPk_id());
            preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public int delete() {
        final String QUERY = "DELETE FROM product WHERE pk_id = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, this.product.getPk_id());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    public static int delete(String name) {
        final String QUERY = "DELETE FROM product WHERE name = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    public static int delete(double price) {
        final String QUERY = "DELETE FROM product WHERE price = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setDouble(1, price);
            preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    public static int delete(String name, double price) {
        final String QUERY = "DELETE FROM product WHERE name = ? AND price = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public Product select() {
        final String QUERY = "SELECT * FROM product WHERE pk_id = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, this.product.getPk_id());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return this.product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3));
            } else {
                return this.product = null;
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return null;
    }
    
    @Override
    public List<Product> selectAll() {
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
    
    public static List<Product> select(String name) {
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
    
    public static List<Product> select(Double price) {
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
    
    public static List<Product> select(String name, double price) {
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