package inimigos;

public class Gobelin extends Inimigo {

    public Gobelin() {
        super.setNome("Gobelin");
        super.setVidaInimigo(30);
        super.setDanoAtaqueInimigo(RANDOM.nextInt(DANO_MAXIMO1));
    }

    @Override
    public int atacar() {
        return danoAtaqueInimigo;
    }

    @Override
    public void sofrerDano(int dano) {
        super.setVidaInimigo(super.getVidaInimigo() - dano);
    }

}
