package inimigos;

public class Ogro extends Inimigo {

    public Ogro() {
        super.setNome("Ogro");
        super.setVidaInimigo(45);
        super.setDanoAtaqueInimigo(RANDOM.nextInt(DANO_MAXIMO2));
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
