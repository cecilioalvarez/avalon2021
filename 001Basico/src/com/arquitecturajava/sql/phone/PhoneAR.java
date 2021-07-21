package com.arquitecturajava.sql.phone;

import com.arquitecturajava.sql.ActiveRecord;
import com.arquitecturajava.sql.connection.DbConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class PhoneAR implements ActiveRecord {
    
    private Phone phone;

    PhoneAR() {
    }

    PhoneAR(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return this.phone.toString();
    }
    
    @Override
    public Phone select() {
        final String QUERY = "SELECT * FROM phone WHERE pk_number = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, this.phone.getPk_number());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return this.phone = new Phone(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3));
            } else {
                return this.phone = null;
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return null;
    }
    
    public static List<Phone> select(String brand) {
        final String QUERY = "SELECT * FROM phone WHERE brand = ?";
        final List<Phone> PHONES = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            preparedStatement.setString(1, brand);
            while (resultSet.next()) {
                PHONES.add(new Phone(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return PHONES;
    }
    
    public static List<Phone> select(double price) {
        final String QUERY = "SELECT * FROM phone WHERE price = ?";
        final List<Phone> PHONES = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            preparedStatement.setDouble(1, price);
            while (resultSet.next()) {
                PHONES.add(new Phone(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return PHONES;
    }
    
    public static List<Phone> select(String brand, double price) {
        final String QUERY = "SELECT * FROM phone WHERE brand = ? AND price ?";
        final List<Phone> PHONES = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            preparedStatement.setString(1, brand);
            preparedStatement.setDouble(2, price);
            while (resultSet.next()) {
                PHONES.add(new Phone(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return PHONES;
    }

    @Override
    public List<Phone> selectAll() {
        final String QUERY = "SELECT * FROM phone";
        final List<Phone> PHONES = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                Statement statement = conn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY);
            while (resultSet.next()) {
                PHONES.add(new Phone(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return PHONES;
    }

    @Override
    public void insert() {
        final String QUERY = "INSERT INTO phone (pk_number, brand, price) VALUES (?, ?, ?)";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setDouble(1, this.phone.getPk_number());
            preparedStatement.setString(2, this.phone.getBrand());
            preparedStatement.setDouble(3, this.phone.getPrice());
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción: " + sql_ex.getMessage());
        }
    }

    @Override
    public void delete() {
        final String QUERY = "DELETE FROM phone WHERE pk_number = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, this.phone.getPk_number());
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
    }
    
    public static void delete(String brand) {
        final String QUERY = "DELETE FROM phone WHERE brand = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, brand);
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
    }
    
    public static void delete(double price) {
        final String QUERY = "DELETE FROM phone WHERE price = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setDouble(1, price);
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
    }

    @Override
    public void update() {
        final String QUERY = "UPDATE phone SET brand = ?, price = ? WHERE pk_number = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, this.phone.getBrand());
            preparedStatement.setDouble(2, this.phone.getPrice());
            preparedStatement.setInt(3, this.phone.getPk_number());
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
    }
    
    void updateBrand(String newValue) {
        final String QUERY = "UPDATE phone SET brand = ? WHERE pk_number = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, newValue);
            preparedStatement.setInt(2, this.phone.getPk_number());
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
    }
    
    void updatePrice(double newValue) {
        final String QUERY = "UPDATE phone SET price = ? WHERE pk_number = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setDouble(1, newValue);
            preparedStatement.setInt(2, this.phone.getPk_number());
            preparedStatement.execute();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
    }
}