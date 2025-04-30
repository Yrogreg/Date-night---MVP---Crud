/*
package Algoritimo;

import User.User;

/**
 *
 * @author Yrogreg
 */
/*
public class Compatibilidade extends User{
    int aux = 0;
    int cont;
    
    public int atracao(int id_banco, String nome_banco, int idade_banco, String localizacao_banco, int generoBio_banco, int altura_banco, int peso_banco, int formaFisica_banco, int imc_banco, int cabeloNatural_banco, int pele_banco, int tatuagens_banco, int salario_banco, int certificaProfi_banco, int personalidade_banco, int intGeneroBio_banco, int intAltura_banco, int intTatuagens_banco, int intCabeloNatural_banco, int preto_banco, int castanho_banco, int loiro_banco, int ruivo_banco, int intpele_banco, int escuro_banco, int cauca_banco, int claro_banco, int viagens_banco, int musica_banco, int gastronomia_banco, int livros_banco, int esportes_banco, int natureza_banco, int artes_banco, int jogos_banco, int animais_banco, int causa_banco) {
        System.out.println("AsEscuras.Compatibilidade.atracao()");
        this.cont = 0; // conta paridade dos usuários
        System.out.println(this.id + " compara com " + id_banco);

        Idade(generoBio_banco, idade_banco); // idade
        Altura(intAltura_banco, altura_banco); // altura
        Imc(imc_banco); // imc
        FormaFisica(formaFisica_banco); // forma fisica
        Cabelo(intCabeloNatural_banco, cabeloNatural_banco); // cabelo
        Pele(intpele_banco, pele_banco); // tom de pele
        Tatuagens(intTatuagens_banco, tatuagens_banco); // tatuagens
        Certifica(certificaProfi_banco); // certificação profissional
        Salario(salario_banco); // salário
        Personalidade(personalidade_banco); // personalidade
        Interesees(viagens_banco, livros_banco, causa_banco, animais_banco, jogos_banco, artes_banco, natureza_banco, esportes_banco, gastronomia_banco, musica_banco); // interesses  
        
        return cont;
    }

    public void Idade(int generoBio_banco, int idade_banco  ) {
        aux = 0;
        if (generoBio_banco == 0 && this.generoBio == 1) {
            aux = idade_banco / 2 + 7;
            if (this.idade >= aux) {
                this.cont++;
            }
        } else {
            if (this.generoBio == 0 && generoBio_banco == 1) {
                aux = this.idade / 2 + 7;
                if (idade_banco >= aux) {
                    this.cont++;
                }
            }
        }
        System.out.println("AsEscuras.Algoritimo.Compatibilidade.Idade()" + cont );
    }

    public void Altura(int intAltura_banco, int altura_banco) {
        

        if (intAltura_banco == 0 && this.altura <= altura_banco) {
            if (this.intAltura == 1 || this.intAltura == 2) {
                this.cont++;
            }
        } else if (intAltura_banco == 2 && this.altura >= altura_banco) {
            if (this.intAltura == 1 || this.intAltura == 0) {
                this.cont++;
            }
        } else if (intAltura_banco == 1) {
            if (this.intAltura == 0 && this.altura >= altura_banco) {
                this.cont++;
            } else if (this.intAltura == 2 && this.altura <= altura_banco) {
                this.cont++;
            } else if (this.intAltura == 1) {
                this.cont++;
            }
        }
        System.out.println("AsEscuras.Algoritimo.Compatibilidade.Altura()" + cont);
    }

    public void Imc(int imc_banco) {
        

        switch (imc_banco) {
            case 0: {
                if (this.imc == 0 || this.imc == 1) {
                    this.cont++;
                }
                break; // Adicionando break para evitar "fall-through"
            }
            case 1: {
                if (this.imc == 0 || this.imc == 1 || this.imc == 2) {
                    this.cont++;
                }
                break; // Adicionando break para evitar "fall-through"
            }
            case 2: {
                if (this.imc == 1 || this.imc == 2 || this.imc == 3) {
                    this.cont++;
                }
                break; // Adicionando break para evitar "fall-through"
            }
            case 3: {
                if (this.imc == 2 || this.imc == 3) {
                    this.cont++;
                }
                break; // Adicionando break para evitar "fall-through"
            }
            default: throw new AssertionError();
        }
        System.out.println("AsEscuras.Algoritimo.Compatibilidade.Imc()" + cont);
    }

    public void FormaFisica(int formaFisica_banco) {
        
        if (formaFisica_banco == this.formaFisica) {
            this.cont++;
        }
        System.out.println("AsEscuras.Algoritimo.Compatibilidade.FormaFisica()" + cont);
    }

    public void Cabelo(int intCabeloNatural_banco, int cabeloNatural_banco) {
        
        int pc = 0; // Usando int para representar a condição

        if (intCabeloNatural_banco == 1) { // Verifica se intCabeloNatural é verdadeiro
            switch (cabeloNatural_banco) {
                case 0: {
                    if (this.preto == 1) {
                        pc = 1; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                case 1: {
                    if (this.castanho == 1) {
                        pc = 1; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                case 2: {
                    if (this.loiro == 1) {
                        pc = 1; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                case 3: {
                    if (this.ruivo == 1) {
                        pc = 1; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                default: throw new AssertionError();
            }
        } else if (intCabeloNatural_banco == 0 && this.intCabeloNatural == 0) {
            this.cont++; // Ambos são não naturais
        }

        if (pc == 1 && this.intCabeloNatural == 1) { // Se a condição foi verdadeira
            switch (cabeloNatural_banco) {
                case 0: {
                    if (this.preto == 1) {
                        this.cont++; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                case 1: {
                    if (this.castanho == 1) {
                        this.cont++; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                case 2: {
                    if (this.loiro == 1) {
                        this.cont++; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                case 3: {
                    if (this.ruivo == 1) {
                        this.cont++; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                default: throw new AssertionError();
            }
        } else if (pc == 1 && this.intCabeloNatural == 0) {
            this.cont++; // Se a condição foi verdadeira e não é natural
        }
        System.out.println("AsEscuras.Algoritimo.Compatibilidade.Cabelo()" + cont);
    }

    public void Pele(int intPele_banco, int pele_banco) {
        
        int pc = 0; // Usando int para representar a condição

        if (intPele_banco == 1) { // Verifica se intPele é verdadeiro
            switch (pele_banco) {
                case 0: {
                    if (this.claro == 1) {
                        pc = 1; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                case 1: {
                    if (this.cauca == 1) {
                        pc = 1; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                case 2: {
                    if (this.escuro == 1) {
                        pc = 1; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                default: throw new AssertionError();
            }
        } else if (intPele_banco == 0 && this.intPele == 0) {
            this.cont++; // Ambos são não naturais
        }

        if (pc == 1 && this.intPele == 1) { // Se a condição foi verdadeira
            switch (pele_banco) {
                case 0: {
                    if (this.claro == 1) {
                        this.cont++; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                case 1: {
                    if (this.cauca == 1) {
                        this.cont++; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                case 2: {
                    if (this.escuro == 1) {
                        this.cont++; // Condição verdadeira
                    } else {
                        this.cont--; // Condição falsa
                    }
                    break; // Adicionando break para evitar "fall-through"
                }
                default: throw new AssertionError();
            }
        } else if (pc == 1 && this.intPele == 0) {
            this.cont++; // Se a condição foi verdadeira e não é natural
        }
        System.out.println("AsEscuras.Algoritimo.Compatibilidade.Pele()"+ cont);
    }

    public void Tatuagens(int intTatuagens_banco, int tatuagens_banco) {
        

        if (intTatuagens_banco == 1 && tatuagens_banco == 1) {
            this.cont--;
        } else if (this.intTatuagens == 1 && tatuagens_banco == 1) {
            this.cont--;
        }
        System.out.println("AsEscuras.Algoritimo.Compatibilidade.Tatuagens()" + cont);
    }
    
    public void Certifica(int certificaProfi_banco) {
        
        if (certificaProfi_banco == 1 && this.certificaProfi == 1) {
            this.cont++;
        } else {
            this.cont++;
        }
        System.out.println("AsEscuras.Algoritimo.Compatibilidade.Certifica()" + cont);
    }

    public void Salario(int salario_banco) {
        
        switch (salario_banco) {
            case 0: {
                if (this.salario == 0 || this.salario == 1) {
                    this.cont++;
                }
                break; // Adicionando break para evitar "fall-through"
            }
            case 1: {
                if (this.salario == 0 || this.salario == 1 || this.salario == 2) {
                    this.cont++;
                }
                break; // Adicionando break para evitar "fall-through"
            }
            case 2: {
                if (this.salario == 1 || this.salario == 2 || this.salario == 3) {
                    this.cont++;
                }
                break; // Adicionando break para evitar "fall-through"
            }
            case 3: {
                if (this.salario == 2 || this.salario == 3) {
                    this.cont++;
                }
                break; // Adicionando break para evitar "fall-through"
            }
            default: throw new AssertionError(); // Adicionando uma verificação de erro
        }
        System.out.println("AsEscuras.Algoritimo.Compatibilidade.Salario()" + cont);
    }

    public void Personalidade(int personalidade_banco) {
        
        if (personalidade_banco != this.personalidade) {
            this.cont++;
        }
        System.out.println("AsEscuras.Algoritimo.Compatibilidade.Personalidade()" + cont);
    }

    public void Interesees(int viagens_banco, int livros_banco,
                           int causa_banco, int animais_banco,
                           int jogos_banco, int artes_banco,
                           int natureza_banco, int esportes_banco,
                           int gastronomia_banco, int musica_banco) {
        

        if (viagens_banco == this.viagens) { this.cont++; }
        if (livros_banco == this.livros) { this.cont++; }
        if (causa_banco == this.causa) { this.cont++; }
        if (animais_banco == this.animais) { this.cont++; }
        if (jogos_banco == this.jogos) { this.cont++; }
        if (artes_banco == this.artes) { this.cont++; }
        if (natureza_banco == this.natureza) { this.cont++; }
        if (esportes_banco == this.esportes) { this.cont++; }
        if (gastronomia_banco == this.gastronomia) { this.cont++; }
        if (musica_banco == this.musica) { this.cont++; }
        
        System.out.println("AsEscuras.Algoritimo.Compatibilidade.Interesees()" + cont);
    }
}
*/