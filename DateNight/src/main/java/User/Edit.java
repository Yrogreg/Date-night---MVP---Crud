package User;

import Banco.Conect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Yrogreg
 */
public class Edit {
    public boolean EditUser(int id, String nome, String email, String senha) {
        // Query SQL para atualizar um usuário existente
        String sql = "UPDATE user SET nome = ?, email = ?, senha= ? WHERE id = ?";

        try (Connection connection = Conect.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Configura os parâmetros da query
            statement.setString(1, nome);
            statement.setString(2, email);
            statement.setString(3, senha);
            statement.setInt(4, id);  // This was missing in your original code

            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Usuário atualizado com sucesso!");
                return true;
            } else {
                System.out.println("Nenhum usuário encontrado com este email.");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar usuário: " + e.getMessage());
            return false;
        }
    }   
}

