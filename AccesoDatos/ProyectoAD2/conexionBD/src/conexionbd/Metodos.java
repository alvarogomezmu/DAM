/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd;

import java.sql.*;

public class Metodos {

    public static void main(String args[]) {
        try {
            DriverManager.registerDriver(
                    new oracle.jdbc.driver.OracleDriver());
            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:oracle",
                    "scott",
                    "tiger");
            Statement stmt = conn.createStatement();
            ResultSet rset = stmt.executeQuery(
                    "SELECT empno, ename, sal "
                    + "FROM emp order by ename");
            while (rset.next()) {
                System.out.println(
                        rset.getInt(1) + "-"
                        + rset.getString("ename") + "-"
                        + rset.getFloat("sal")
                );
            }
            rset.close();
            stmt.close();
            conn.close();
        } catch (SQLException x) {
            x.printStackTrace();
        }
    }
}
