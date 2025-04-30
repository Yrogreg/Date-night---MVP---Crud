/*
package Algoritimo;

import AsEscuras.User.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class Lista extends User{
      
    public void criarLista(int id) {
        System.out.println("AsEscuras.Ler_Banco.criarLista()");
        int gostei = 0; // 0 = não gostei, 1 = gostei
        int amei = 0;   // 0 = não amei, 1 = amei
        int atracao = 0;
        
        lerDadosUser(id);
        
        try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linha;
            // Lê cada linha do arquivo
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");

                // Dados da pessoa
                int id_banco = Integer.parseInt(dados[0]);
                String nome_banco = dados[3];

                int idade_banco = Integer.parseInt(dados[7]);
                String localizacao_banco = dados[8];
                int generoBio_banco = Integer.parseInt(dados[9]);
                int altura_banco = Integer.parseInt(dados[10]);
                int peso_banco = Integer.parseInt(dados[11]);
                int formaFisica_banco = Integer.parseInt(dados[12]);
                int imc_banco = Integer.parseInt(dados[13]);
                int cabeloNatural_banco = Integer.parseInt(dados[14]);
                int pele_banco = Integer.parseInt(dados[15]);
                int tatuagens_banco = Integer.parseInt(dados[16]);
                int salario_banco = Integer.parseInt(dados[17]);
                int certificaProfi_banco = Integer.parseInt(dados[18]);
                int personalidade_banco = Integer.parseInt(dados[19]);

                int intGeneroBio_banco = Integer.parseInt(dados[20]); // Index 20
                int intAltura_banco = Integer.parseInt(dados[21]); // Index 21
                int intTatuagens_banco = Integer.parseInt(dados[22]); // Index 22
                int intCabeloNatural_banco = Integer.parseInt(dados[23]); // Index 23
                int preto_banco = Integer.parseInt(dados[24]); // Index 24
                int castanho_banco = Integer.parseInt(dados[25]); // Index 25
                int loiro_banco = Integer.parseInt(dados[26]); // Index 26
                int ruivo_banco = Integer.parseInt(dados[27]); // Index 27
                int intpele_banco = Integer.parseInt(dados[28]); // Index 28
                int escuro_banco = Integer.parseInt(dados[29]); // Index 29
                int cauca_banco = Integer.parseInt(dados[30]); // Index 30
                int claro_banco = Integer.parseInt(dados[31]); // Index 31

                int viagens_banco = Integer.parseInt(dados[32]); // Index 32        
                int musica_banco = Integer.parseInt(dados[33]); // Index 33        
                int gastronomia_banco = Integer.parseInt(dados[34]); // Index 34    
                int livros_banco = Integer.parseInt(dados[35]); // Index 35           
                int esportes_banco = Integer.parseInt(dados[36]); // Index 36       
                int natureza_banco = Integer.parseInt(dados[37]); // Index 37         
                int artes_banco = Integer.parseInt(dados[38]); // Index 38            
                int jogos_banco = Integer.parseInt(dados[39]); // Index 39            
                int animais_banco = Integer.parseInt(dados[40]); // Index 40          
                int causa_banco = Integer.parseInt(dados[41]); // Index 41
                
                System.out.println("leu usuario " + nome_banco);
                // Verifica se usuário é o mesmo e a sexualidade dos usuários
                if (this.id != id_banco && intGeneroBio_banco == this.generoBio && this.intGeneroBio == generoBio_banco) {
                    System.out.println("encontrou usuario " + nome_banco);
                    Compatibilidade c = new Compatibilidade(id, nome, diaNascimento, mesNascimento, anoNascimento, idade, localizacao, generoBio, altura, peso, formaFisica, imc, cabeloNatural, pele, tatuagens, salario, certificaProfi, personalidade, intGeneroBio, intAltura, intTatuagens, intCabeloNatural, preto, castanho, loiro, ruivo, intPele, escuro, cauca, claro, viagens, musica, gastronomia, livros, esportes, natureza, artes, jogos, animais, causa);
                    atracao = c.atracao(id_banco, nome_banco, idade_banco, localizacao_banco, generoBio_banco, altura_banco, peso_banco, formaFisica_banco, imc_banco, cabeloNatural_banco, pele_banco, tatuagens_banco, salario_banco, certificaProfi_banco, personalidade_banco, intGeneroBio_banco, intAltura_banco, intTatuagens_banco, intCabeloNatural_banco, preto_banco, castanho_banco, loiro_banco, ruivo_banco, intpele_banco, escuro_banco, cauca_banco, claro_banco, viagens_banco, musica_banco, gastronomia_banco, livros_banco, esportes_banco, natureza_banco, artes_banco, jogos_banco, animais_banco, causa_banco);
                    if (atracao > 1){salvaLista(id_banco, atracao, nome_banco, gostei, amei);}
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os dados: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter os dados: " + e.getMessage());
        }
        
        atualizaLista();
        
    }
    
    public void salvaLista(int id, int atracao, String nome, int gostei, int amei) {
        System.out.println("GerenciadorDeAtrações.salvaLista()");
        String filePath = this.nome + this.id + ".txt"; // Caminho do arquivo de entrada
        String tempFilePath = "temp.txt"; // Arquivo temporário para escrita
        boolean inserido = false;

        File originalFile = new File(filePath);

        // Cria o arquivo original se não existir
        if (!originalFile.exists()) {
            try {
                originalFile.createNewFile(); // Cria um novo arquivo vazio
            } catch (IOException e) {
                System.out.println("Erro ao criar o arquivo: " + e.getMessage());
                return; // Sai do método se houver erro na criação do arquivo
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilePath))) { // Não usar 'true' para append

            String linha;

            // Lê cada linha do arquivo de atrações
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");

                int id_banco = Integer.parseInt(dados[0]);
                int atracao_banco = Integer.parseInt(dados[1]);
                String nome_banco = dados[2];
                int gostei_banco = Integer.parseInt(dados[3]);
                int amei_banco = Integer.parseInt(dados[4]);

                // Ignora a entrada se o ID já existir
                if (id_banco == id) {
                    continue; // Não escreve no arquivo temporário
                }

                // Escreve as atrações existentes no arquivo temporário
                

                // Insere a nova atração de acordo com a lógica de comparação
                if (!inserido) {
                    if (amei_banco == 1 || amei == 1) {
                        if (atracao_banco < atracao + 10) {
                            writeData(writer, id, atracao, nome, gostei, amei);
                            inserido = true; // Marca que já inseriu a nova atração
                        }
                    } else if (gostei_banco == 1 || gostei == 1) {
                        if (atracao_banco < atracao + 5) {
                            writeData(writer, id, atracao, nome, gostei, amei);
                            inserido = true; // Marca que já inseriu a nova atração
                        }
                    } else if (atracao_banco < atracao) {
                        writeData(writer, id, atracao, nome, gostei, amei);
                        inserido = true; // Marca que já inseriu a nova atração
                    }
                }
                writeData(writer, id_banco, atracao_banco, nome_banco, gostei_banco, amei_banco);
            }

            // Se a nova atração não foi inserida, adiciona no final
            if (!inserido) {
                writeData(writer, id, atracao, nome, gostei, amei);
            }

        } catch (IOException e) {
            System.out.println("Erro ao manipular os arquivos: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter os dados: " + e.getMessage());
        }

        // Após a gravação, substitui o arquivo original pelo temporário
        File tempFile = new File(tempFilePath);
        if (originalFile.delete()) {
            if (!tempFile.renameTo(originalFile)) {
                System.out.println("Erro ao substituir o arquivo.");
            }
        } else {
            System.out.println("Erro ao excluir o arquivo original.");
        }
    }

    // Método para atualizar a lista a partir de um arquivo temporário
    public void atualizaLista() {
        System.out.println("GerenciadorDeAtrações.atualizaLista()");
        String filePath = "temp" + this.nome + this.id + ".txt";
        File file = new File(filePath);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linha;
            // Lê cada linha do arquivo
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");

                // Dados da atração
                int id = Integer.parseInt(dados[0]);
                int atracao = Integer.parseInt(dados[1]);
                String nome = dados [2];
                int gostei = Integer.parseInt(dados[3]);
                int amei = Integer.parseInt(dados[4]);

                // Salva a atração lida
                salvaLista(id, atracao, nome, gostei, amei);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo temporário: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter os dados: " + e.getMessage());
        }

        // Deleta o arquivo temporário após a atualização
        if (file.delete()) {
            System.out.println("Arquivo temporário deletado com sucesso.");
        } else {
            System.out.println("Erro ao deletar o arquivo temporário.");
        }
    }

    // Método para adicionar dados ao arquivo
    public void writeData(BufferedWriter writer, int id, int atracao, String nome, int gostei, int amei) throws IOException {
        System.out.println("AsEscuras.Algoritimo.Lista.writeData()");
        writer.write(id + ";" + atracao + ";" + nome + ";" + gostei + ";" + amei + ";");
        writer.newLine();
    }
    

}

*/