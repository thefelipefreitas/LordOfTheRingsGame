package inimigos;

public class Orque extends Inimigo {

    public Orque() {
        super.setNome("Orque");
        super.setVidaInimigo(60);
        super.setDanoAtaqueInimigo(RANDOM.nextInt(DANO_MAXIMO3));
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
