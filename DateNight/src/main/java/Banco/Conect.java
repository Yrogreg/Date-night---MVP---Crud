package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Gregory Gorziza
 */
public class Conect {

    // Atributos para a conexão com o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/date_night"; // Substitua pelo nome do seu banco
    private static final String USER = "root"; // Substitua pelo usuário do banco
    private static final String PASSWORD = "1511"; // Substitua pela senha do banco

    // Método para estabelecer a conexão com o banco de dados
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Tenta estabelecer a conexão
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
        } catch (SQLException e) {
            // Em caso de erro, exibe uma mensagem
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return connection;
    }

    // Método para fechar a conexão com o banco de dados
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexão com o banco de dados fechada com sucesso!");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
            }
        }
    }
}