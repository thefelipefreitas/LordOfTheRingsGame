package herois;

public class Gandalf extends Heroi {

    public Gandalf() {
        super.setNome("Gandalf");
        super.setVida(100);
        super.setDanoAtaque(50);
        super.setNumPocoesVida(5);
        super.setPocaoVidaValor(40);
        super.setChanceDeReceberPocao(50);
        super.setScore(0);
    }

    @Override
    public int atacar() {
        return danoAtaque;
    }

    @Override
    public void sofrerDano(int dano) {
        super.setVida(super.getVida() - dano);
    }

    @Override
    public void tomarPocao() {
        super.vida += super.pocaoVidaValor;
        super.numPocoesVida--;
    }

    @Override
    public void incrementaPocao() {
        super.numPocoesVida++;
    }

    @Override
    public void incrementaScore() {
        super.score++;
    }

}
