package com.pbo;

import java.sql.*;

public class db {
    public static Connection con;
    public static Connection con() {
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbjava", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
