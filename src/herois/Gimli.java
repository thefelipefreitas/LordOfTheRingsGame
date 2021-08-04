package herois;

public class Gimli extends Heroi {

    public Gimli() {
        super.setNome("Gimli");
        super.setVida(100);
        super.setDanoAtaque(35);
        super.setNumPocoesVida(3);
        super.setPocaoVidaValor(35);
        super.setChanceDeReceberPocao(50);
        super.setScore(0);
    }

    public int atacar() {
        return danoAtaque;
    }

    @Override
    public void sofrerDano(int dano) {
        super.setVida(super.getVida() - dano);
    }

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
