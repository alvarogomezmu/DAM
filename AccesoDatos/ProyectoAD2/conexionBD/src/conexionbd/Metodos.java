/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd;

import java.sql.*;

public class Metodos {

    public static void main(String args[]) {

        //CONEXION A UNA BASE DE DATOS
        String usuario = "hr";
        String password = "root";
        String host = "localhost"; // tambien puede ser una ip como "192.168.1.14"
        String puerto = "1521";
        String sid = "XE";
        String driver = "oracle.jdbc.driver.OracleDriver";
        String ulrjdbc = "jdbc:oracle:thin:" + usuario + "/" + password + "@" + host + ":" + puerto + ":" + sid;

        Connection conn = null;

        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(ulrjdbc);
            System.out.println("Te has conectado correctamente a la BBDD. ");
            if (conn != null) {
                /*
                 try {
                 conn.close();
                 } catch (SQLException e) {
                 e.printStackTrace();
                 }
                 */
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //return conn;
    }
}
