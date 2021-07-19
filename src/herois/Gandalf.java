package herois;

public class Gandalf extends Heroi {

    public Gandalf() {
        this.setNome("Gandalf");
        this.setVida(100);
        this.setDanoAtaque(50);
        this.setNumPocoesVida(5);
        this.setPocaoVidaValor(40);
        this.setChanceDeReceberPocao(50);
        this.setScore(0);
    }

    @Override
    public int atacar() {
        return danoAtaque;
    }

    @Override
    public void tomarPocao() {
        this.vida += this.pocaoVidaValor;
        this.pocaoVidaValor--;
    }

    @Override
    public void sofrerDano(int dano) {
        this.setVida(this.getVida() - dano);
    }

}
