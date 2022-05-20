package Dbase;
import jdk.swing.interop.SwingInterOpUtils;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlunoDb {

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;

        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }

            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/aluno", "root", "123456");
            System.out.println("Conexão feita com sucesso");

            try {

                stmt = conn != null ? conn.createStatement() : null;

                String sql = "INSERT INTO alunos (id, Nome, Idade, Nota) VALUES(1, 'Alef Lima', 22, 10)";

                if (stmt != null) {
                    stmt.executeUpdate(sql);
                }

                System.out.println("Registro inserido com sucesso!");

            } catch (SQLException e) {
                System.out.println(e);
            }

            try {

                stmt = conn != null ? conn.createStatement() : null;

                String sql = "INSERT INTO alunos (id, Nome, Idade, Nota) VALUES(2, 'Carlos Lopes', 20, 7.5)";

                if (stmt != null) {
                    stmt.executeUpdate(sql);
                }

                System.out.println("Registro inserido com sucesso!");

            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //DELETAR TODA A TABELA
        /**try {

            // Use DELETE
            String sql = "DELETE FROM alunos";

            // Execute deletion
            stmt.executeUpdate(sql);
        } catch (SQLException e) {}*/


        System.out.println("Cheque sua tabela!");
    }
}
