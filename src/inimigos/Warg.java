package inimigos;

public class Warg extends Inimigo {

    public Warg() {
        super.setNome("Warg");
        super.setVidaInimigo(50);
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
