package User;

import Banco.Conect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Yrogreg
 */
public class Del {
    public boolean DelUser(int id) {  // Accept ID as a parameter
        // Query SQL para deletar um usuário
        String sql = "DELETE FROM user WHERE id = ?";

        try (Connection connection = Conect.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Configura o parâmetro da query
            statement.setInt(1, id);

            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Usuário deletado com sucesso!");
                return true;
            } else {
                System.out.println("Nenhum usuário encontrado com este id.");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar usuário: " + e.getMessage());
            return false;
        }
    }
}