package herois;

import java.util.Random;

public abstract class Heroi {

    protected String nome;
    protected int vida;
    protected int danoAtaque;
    protected int numPocoesVida;
    protected int pocaoVidaValor;
    protected int chanceDeReceberPocao; //Porcentagem
    protected int score;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setDanoAtaque(int danoAtaque) {
        this.danoAtaque = danoAtaque;
    }

    public int getNumPocoesVida() {
        return numPocoesVida;
    }

    public void setNumPocoesVida(int numPocoesVida) {
        this.numPocoesVida = numPocoesVida;
    }

    public int getPocaoVidaValor() {
        return pocaoVidaValor;
    }

    public void setPocaoVidaValor(int pocaoVidaValor) {
        this.pocaoVidaValor = pocaoVidaValor;
    }

    public int getChanceDeReceberPocao() {
        return chanceDeReceberPocao;
    }

    public void setChanceDeReceberPocao(int chanceDeReceberPocao) {
        this.chanceDeReceberPocao = chanceDeReceberPocao;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int atacar() {
        return danoAtaque;
    }

    public void sofrerDano(int dano) {
        this.setVida(this.getVida() - dano);
    }

    public void tomarPocao() {
        if (this.getNumPocoesVida() > 0) {
            this.vida += this.pocaoVidaValor;
            this.numPocoesVida--;

            if (this.getVida() > 100) {
                this.setVida(100);
            }
            System.out.println("\t> " + this.getNome() + " bebeu uma poção de Miruvor, curando-se por " + this.getPocaoVidaValor() + "."
                    + "\n\t> Agora " + this.getNome() + " têm " + this.getVida() + " de vida."
                    + "\n\t> " + this.getNome() + " ainda têm " + this.getNumPocoesVida() + " poções.\n");
        } else {
            System.out.println("\t> " + this.getNome() + " não têm poções de Miruvor! Derrote inimigos para ter a chance de pegar uma!\n");
        }
    }

    public void possibilidadePocao(String nomeInimigo) {
        Random rand = new Random();
        if (rand.nextInt(100) < this.getChanceDeReceberPocao()) {
            this.numPocoesVida++;
            System.out.println(" # O " + nomeInimigo + " dropou uma poção de Miruvor! # ");
            System.out.println(" # Agora " + this.getNome() + " têm  " + this.getNumPocoesVida() + " poção(ões). # ");
        }
    }

    public void incrementaScore() {
        this.score++;
    }
}
