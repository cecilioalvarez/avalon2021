package com.arquitecturajava.sql.phone;

import com.arquitecturajava.sql.connection.DbConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class PhoneRepositoryJDBC implements PhoneRepository {
    
    @Override
    public Phone select(Phone phone) {
        final String QUERY = "SELECT * FROM phone WHERE pk_number = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, phone.getPk_number());
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next() ? new Phone(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)) : null;
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return null;
    }
    
    @Override
    public List<Phone> select(String brand) {
        final String QUERY = "SELECT * FROM phone WHERE brand = ?";
        final List<Phone> PHONES = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, brand);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                PHONES.add(new Phone(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return PHONES;
    }
    
    @Override
    public List<Phone> select(double price) {
        final String QUERY = "SELECT * FROM phone WHERE price = ?";
        final List<Phone> PHONES = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setDouble(1, price);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                PHONES.add(new Phone(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return PHONES;
    }
    
    @Override
    public List<Phone> select(String brand, double price) {
        final String QUERY = "SELECT * FROM phone WHERE brand = ? AND price ?";
        final List<Phone> PHONES = new ArrayList<>();
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, brand);
            preparedStatement.setDouble(2, price);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                PHONES.add(new Phone(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
            }
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de selección: " + sql_ex.getMessage());
        }
        return PHONES;
    }

    @Override
    public List<Phone> select() {
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
    public int insert(Phone phone) {
        final String QUERY = "INSERT INTO phone (pk_number, brand, price) VALUES (?, ?, ?)";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setDouble(1, phone.getPk_number());
            preparedStatement.setString(2, phone.getBrand());
            preparedStatement.setDouble(3, phone.getPrice());
            preparedStatement.execute();
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de inserción: " + sql_ex.getMessage());
        }
        return 0;
    }

    @Override
    public int delete(Phone phone) {
        final String QUERY = "DELETE FROM phone WHERE pk_number = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setInt(1, phone.getPk_number());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public int delete(String brand) {
        final String QUERY = "DELETE FROM phone WHERE brand = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, brand);
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de borrado: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public int delete(double price) {
        final String QUERY = "DELETE FROM phone WHERE price = ?";
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
    public int update(Phone phone) {
        final String QUERY = "UPDATE phone SET brand = ?, price = ? WHERE pk_number = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, phone.getBrand());
            preparedStatement.setDouble(2, phone.getPrice());
            preparedStatement.setInt(3, phone.getPk_number());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public int updateBrand(Phone phone, String newValue) {
        final String QUERY = "UPDATE phone SET brand = ? WHERE pk_number = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setString(1, newValue);
            preparedStatement.setInt(2, phone.getPk_number());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public int updatePrice(Phone phone, double newValue) {
        final String QUERY = "UPDATE phone SET price = ? WHERE pk_number = ?";
        try (Connection conn = DbConnectionSingleton.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
            preparedStatement.setDouble(1, newValue);
            preparedStatement.setInt(2, phone.getPk_number());
            return preparedStatement.executeUpdate();
        } catch (SQLException sql_ex) {
            System.err.println("Error al lanzar la consulta de actualización: " + sql_ex.getMessage());
        }
        return 0;
    }
}