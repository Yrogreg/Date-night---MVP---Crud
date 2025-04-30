package User;

import Banco.Conect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gregory Gorziza
 */
public class Cad {
    public boolean cadUser(String nome, String email, String senha) {

        // Query SQL atualizada com todas as colunas
        String sql = "INSERT INTO user (nome, email, senha) " +
                     "VALUES (?, ?, ?)";

        try (Connection connection = Conect.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Configura os parâmetros da query
            statement.setString(1, nome);
            statement.setString(2, email);
            statement.setString(3, senha);

            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Usuário cadastrado com sucesso!");
                return true;
            } else {
                System.out.println("Falha ao cadastrar usuário.");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
            return false;
        }
    }
}
