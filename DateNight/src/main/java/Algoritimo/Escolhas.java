/*
package Algoritimo;

import AsEscuras.User.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Yrogreg
 */
/*
public class Escolhas extends Usuario{
    
    public Escolhas(){}
    
    public String[] passa(int id, int atracao, String nome, int gostei, int amei) {
        System.out.println("AsEscuras.Algoritimo.Escolhas.passa()");
        System.out.println("ID: " + id + ", Atracao: " + atracao + ", Nome: " + nome + ", Gostei: " + gostei + ", Amei: " + amei);

        String linha;
        boolean found = false;

        int userId = userLeitura();
        lerDadosUser (userId);

        String filePath = this.nome + this.id + ".txt"; // Caminho do arquivo de entrada
        System.out.println(filePath);
        String tempFilePath = "temp" + filePath;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilePath, true))) {

             while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int idLido = Integer.parseInt(dados[0]);

                if (id == 0 || found == true) {
                    return new String[] { dados[0], dados[1], dados[2], dados[3], dados[4] };
                }else if (id == idLido) {         
                    writer.write(id + ";" + atracao + ";" + nome + ";" + gostei + ";" + amei + ";");
                    writer.newLine();
                    found = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao manipular os arquivos: " + e.getMessage());
        }

        return new String[0]; // Retorna os dados da linha correspondente ou uma linha anterior
    }
}
*/