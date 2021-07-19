package herois;

public class Legolas extends Heroi {

    public Legolas() {
        this.setNome("Legolas");
        this.setVida(100);
        this.setDanoAtaque(35);
        this.setNumPocoesVida(5);
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
