/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd;

import java.sql.*;

public class ConexionBD {

    public static void main(String args[]) {
        try {
            DriverManager.registerDriver(
                    new oracle.jdbc.driver.OracleDriver());
            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:oracle",
                    "scott",
                    "tiger");
            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT empno, ename, sal FROM emp "
                    + "WHERE sal >= ? ORDER BY ename");
            double prueba[] = {1300.00, 2000.00, 3000.00};
            for (int i = 0; i < prueba.length; i++) {
                stmt.setDouble(1, prueba[i]);
                ResultSet rset = stmt.executeQuery();
                System.out.println("Probando con " + prueba[i]);
                while (rset.next()) {
                    System.out.println(
                            rset.getInt(1) + "-"
                            + rset.getString("ename") + "-"
                            + rset.getFloat("sal")
                    );
                }
                rset.close();
            }
            stmt.close();
            conn.close();
        } catch (SQLException x) {
            x.printStackTrace();
        }
    }
}
