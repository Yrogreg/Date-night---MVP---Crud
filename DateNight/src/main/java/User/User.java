package User;

import Banco.Conect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Yrogreg
 */
public class User {
    private int id;
    
    public  User(){
        this.id = 0;
    }
    
    public User(int id){
        this.id = id;
    }
    
    public boolean login(String email, String senha) {
        // Query SQL para buscar o usuário
        String sql = "SELECT id FROM user WHERE email = ? AND senha = ?";

        // Obtém a conexão com o banco de dados
        try (Connection connection = Conect.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Configura os parâmetros da query
            statement.setString(1, email);
            statement.setString(2, senha);

            // Executa a query
            try (ResultSet resultSet = statement.executeQuery()) {
                // Se houver um resultado, o usuário existe
                if (resultSet.next()) {
                    this.id = resultSet.getInt("id");
                    System.out.println(this.id + " foi logado com sucesso.");
                    return true; // Retorna true se o login e senha estiverem corretos
                } else {
                    System.out.println("Email ou senha incorretos.");
                    return false; // Retorna false se o login ou senha estiverem incorretos
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao executar a query: " + e.getMessage());
            return false; // Retorna false em caso de erro na conexão ou query
        }
    }
    
    public int getId() { System.out.println("user: " + this.id); return this.id; }
    public void setId(int id) { this.id = id; System.out.println("user: " + this.id);}
}
