package com.pbo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        controller conn = new controller(db.con());
        add(conn);
    }

    public static void add(controller controller) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(input);
        String uname, pwd;
        System.out.print("Masukkan username: ");
        uname = read.readLine();
        System.out.print("Masukkan password: ");
        pwd = read.readLine();
        data acc = new data(0, uname, pwd);
        try {
            controller.createAkun(acc);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
