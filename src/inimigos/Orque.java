package inimigos;

public class Orque extends Inimigo {

    public Orque() {
        super();
        this.setNome("Orque");
        this.setVidaInimigo(50);
        this.setDanoAtaqueInimigo(RANDOM.nextInt(DANO_MAXIMO3));
    }

    @Override
    public int atacar() {
        return danoAtaqueInimigo;
    }

    @Override
    public void sofrerDano(int dano) {
        this.setVidaInimigo(this.getVidaInimigo() - dano);
    }

}
