package com.company;

import java.sql.*;

/**
 * Created by raphael on 2/8/15.
 */
public class SQLController {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/TrueDataMap";

    static final String USER = "root";
    static final String PASS = "root";

    Connection conn;
    Statement stmt;

    public void SQLConnection(){


        try{
            Class.forName(JDBC_DRIVER).newInstance();

            System.out.println("connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("creating statement");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM TrueDataMap.Civ_info;";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                String info = rs.getString("Civ_name");

                System.out.println(info);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.err.println(e.getMessage());

        }
    }
}
