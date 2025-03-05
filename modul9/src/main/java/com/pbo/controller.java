package com.pbo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class controller {
    private Connection connection;

    public controller(Connection connection) {
        this.connection = connection;
    }

    // tambah data ke database
    public void createAkun(data akun) throws SQLException {
        String query = "INSERT INTO akun (uname, pwd) VALUES (?,?)";

        try (PreparedStatement preparedStatement =

                connection.prepareStatement(query)) {

            preparedStatement.setString(1, akun.getUname());
            preparedStatement.setString(2, akun.getPwd());
            preparedStatement.executeUpdate();
        }
    }

    // membaca data pada database berdasarkan id
    public data getAkunById(int id) throws SQLException {
        String query = "SELECT * FROM akun WHERE id = ?";
        try (PreparedStatement preparedStatement =

                connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return new data(resultSet.getInt("id"),

                            resultSet.getString("uname"),

                            resultSet.getString("pwd"));

                }
            }
        }
        return null;
    }

    // mengambil semua data akun dari database
    public List<data> getAllAkun() throws SQLException {
        List<data> akun = new ArrayList<>();
        String query = "SELECT * FROM akun";
        try (Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query))

        {

            while (resultSet.next()) {
                akun.add(new data(resultSet.getInt("id"),

                        resultSet.getString("uname"),

                        resultSet.getString("pwd")));

            }
        }
        return akun;
    }

    // update data pada database
    public void updateAkun(data akun) throws SQLException {
        String query = "UPDATE akun SET uname = ?, pwd = ? WHERE id = ?";

        try (PreparedStatement preparedStatement =

                connection.prepareStatement(query)) {

            preparedStatement.setString(1, akun.getUname());
            preparedStatement.setString(2, akun.getPwd());
            preparedStatement.executeUpdate();
        }
    }

    // menghapus data dari database
    public void deleteAkun(int id) throws SQLException {
        String query = "DELETE FROM akun WHERE id = ?";
        try (PreparedStatement preparedStatement =

                connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }
    }
}