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

    public void tomarPocao() {
        this.vida += this.pocaoVidaValor;
        this.pocaoVidaValor--;
    }

    @Override
    public void sofrerDano(int dano) {
        this.setVida(this.getVida() - dano);
    }

}
