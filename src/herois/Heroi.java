package herois;

public abstract class Heroi {

    String nome;
    int vida;
    int danoAtaque;
    int numPocoesVida;
    int pocaoVidaValor;
    int chanceDeReceberPocao; //Porcentagem
    int score;

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

    public int getDanoAtaque() {
        return danoAtaque;
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
}