package inimigos;

public class Ogro extends Inimigo {

    public Ogro() {
        super();
        this.setNome("Ogro");
        this.setVidaInimigo(45);
        this.setDanoAtaqueInimigo(RANDOM.nextInt(DANO_MAXIMO2));
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
