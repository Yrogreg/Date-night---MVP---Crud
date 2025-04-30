/*
package Algoritimo;

import AsEscuras.User.Usuario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pessoa {
    protected int id;
    protected String email;
    protected String senha;
    protected String nome;
    protected int diaNascimento;
    protected int mesNascimento;
    protected int anoNascimento;
    protected int idade;
    protected String localizacao;
    protected int generoBio; // masc = 0 / fem = 1
    protected int altura;
    protected int peso;
    protected int formaFisica;
    protected int imc;
    protected int cabeloNatural;

    protected int pele;
    protected int tatuagens; // 0 = false, 1 = true
    protected int salario;
    protected int certificaProfi; // 0 = false, 1 = true
    protected int personalidade;

    protected int intGeneroBio;
    protected int intAltura;
    protected int intTatuagens; // 0 = false, 1 = true
    protected int intCabeloNatural; // 0 = false, 1 = true
    protected int preto; // 0 = false, 1 = true
    protected int castanho; // 0 = false, 1 = true
    protected int loiro; // 0 = false, 1 = true
    protected int ruivo; // 0 = false, 1 = true
    protected int intPele; // 0 = false, 1 = true
    protected int escuro; // 0 = false, 1 = true
    protected int cauca; // 0 = false, 1 = true
    protected int claro; // 0 = false, 1 = true
    protected int viagens; // 0 = false, 1 = true
    protected int musica; // 0 = false, 1 = true
    protected int gastronomia; // 0 = false, 1 = true
    protected int livros; // 0 = false, 1 = true
    protected int esportes; // 0 = false, 1 = true
    protected int natureza; // 0 = false, 1 = true
    protected int artes; // 0 = false, 1 = true
    protected int jogos; // 0 = false, 1 = true
    protected int animais; // 0 = false, 1 = true
    protected int causa; // 0 = false, 1 = true

    protected int atracao;
    protected int gostei; // 0 = false, 1 = true
    protected int amei; // 0 = false, 1 = true
    
    public Pessoa(){}
    // Construtor
    public Pessoa(int id, String email, String senha, String nome, int diaNascimento, int mesNascimento, int anoNascimento, int idade, String localizacao, int generoBio, int altura, int peso, int formaFisica, int imc, int cabeloNatural, int pele, int tatuagens, int salario, int certificaProfi, int personalidade, int intGeneroBio, int intAltura, int intTatuagens, int intCabeloNatural, int preto, int castanho, int loiro, int ruivo, int intPele, int escuro, int cauca, int claro, int viagens, int musica, int gastronomia, int livros, int esportes, int natureza, int artes, int jogos, int animais, int causa, int atracao, int gostei, int amei) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.idade = idade;
        this.localizacao = localizacao;
        this.generoBio = generoBio;
        this.altura = altura;
        this.peso = peso;
        this.formaFisica = formaFisica;
        this.imc = imc;
        this.cabeloNatural = cabeloNatural;
        this.pele = pele;
        this.tatuagens = tatuagens;
        this.salario = salario;
        this.certificaProfi = certificaProfi;
        this.personalidade = personalidade;
        this.intGeneroBio = intGeneroBio;
        this.intAltura = intAltura;
        this.intTatuagens = intTatuagens;
        this.intCabeloNatural = intCabeloNatural;
        this.preto = preto;
        this.castanho = castanho;
        this.loiro = loiro;
        this.ruivo = ruivo;
        this.intPele = intPele;
        this.escuro = escuro;
        this.cauca = cauca;
        this.claro = claro;
        this.viagens = viagens;
        this.musica = musica;
        this.gastronomia = gastronomia;
        this.livros = livros;
        this.esportes = esportes;
        this.natureza = natureza;
        this.artes = artes;
        this.jogos = jogos;
        this.animais = animais;
        this.causa = causa;

        this.gostei = gostei;
        this.amei = amei;
        }
    
    public void lerDadosPessoa(int id) {
        try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linha;
            // Lê cada linha do arquivo
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int id_banco = Integer.parseInt(dados[0]);
                if (id_banco == id) {
                    
                    this.id = id_banco;
                    this.email = dados[1];
                    this.senha = dados[2];
                    this.nome = dados[3];
                    
                    this.diaNascimento = Integer.parseInt(dados[4]);
                    this.mesNascimento = Integer.parseInt(dados[5]);
                    this.anoNascimento = Integer.parseInt(dados[6]);
                    this.idade = Integer.parseInt(dados[7]);
                    this.localizacao = dados[8];
                    this.generoBio = Integer.parseInt(dados[9]);
                    this.altura = Integer.parseInt(dados[10]);
                    this.peso = Integer.parseInt(dados[11]);
                    this.formaFisica = Integer.parseInt(dados[12]);
                    this.imc = Integer.parseInt(dados[13]);
                    this.cabeloNatural = Integer.parseInt(dados[14]);
                    this.pele = Integer.parseInt(dados[15]);
                    this.tatuagens = Integer.parseInt(dados[16]);
                    this.salario = Integer.parseInt(dados[17]);
                    this.certificaProfi = Integer.parseInt(dados[18]);
                    this.personalidade = Integer.parseInt(dados[19]);
                    
                    this.intGeneroBio = Integer.parseInt(dados[20]); // Index 20
                    this.intAltura = Integer.parseInt(dados[21]); // Index 21
                    this.intTatuagens = Integer.parseInt(dados[22]); // Index 22
                    this.intCabeloNatural = Integer.parseInt(dados[23]); // Index 23
                    this.preto = Integer.parseInt(dados[24]); // Index 24
                    this.castanho = Integer.parseInt(dados[25]); // Index 25
                    this.loiro = Integer.parseInt(dados[26]); // Index 26
                    this.ruivo = Integer.parseInt(dados[27]); // Index 27
                    this.pele = Integer.parseInt(dados[28]); // Index 28
                    this.escuro = Integer.parseInt(dados[29]); // Index 29
                    this.cauca = Integer.parseInt(dados[30]); // Index 30
                    this.claro = Integer.parseInt(dados[31]); // Index 31
                        
                    this.viagens = Integer.parseInt(dados[32]); // Index 32        
                    this.musica = Integer.parseInt(dados[33]); // Index 33        
                    this.gastronomia = Integer.parseInt(dados[34]); // Index 34    
                    this.livros = Integer.parseInt(dados[35]); // Index 35           
                    this.esportes = Integer.parseInt(dados[36]); // Index 36       
                    this.natureza = Integer.parseInt(dados[37]); // Index 37         
                    this.artes = Integer.parseInt(dados[38]); // Index 38            
                    this.jogos = Integer.parseInt(dados[39]); // Index 39            
                    this.animais = Integer.parseInt(dados[40]); // Index 40          
                    this.causa = Integer.parseInt(dados[41]); // Index 41   

                    break; // Sai do loop após encontrar o usuário
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os dados: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter os dados: " + e.getMessage());
        }
    }
}
*/