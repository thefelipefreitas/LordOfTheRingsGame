package herois;

public class Aragorn extends Heroi {

    public Aragorn() {
        this.setNome("Aragorn");
        this.setVida(100);
        this.setDanoAtaque(50);
        this.setNumPocoesVida(3);
        this.setPocaoVidaValor(30);
        this.setChanceDeReceberPocao(50);
        this.setScore(0);
    }

    public int atacar() {
        return danoAtaque;
    }

    @Override
    public void sofrerDano(int dano) {
        this.setVida(this.getVida() - dano);
    }

    public void tomarPocao() {
        this.vida += this.pocaoVidaValor;
        this.numPocoesVida--;
    }

    @Override
    public void incrementaPocao() {
        this.numPocoesVida++;
    }

    @Override
    public void incrementaScore() {
        this.score++;
    }
}
