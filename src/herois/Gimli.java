package herois;

public class Gimli extends Heroi {

    public Gimli() {
        this.setNome("Gimli");
        this.setVida(100);
        this.setDanoAtaque(35);
        this.setNumPocoesVida(3);
        this.setPocaoVidaValor(35);
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
