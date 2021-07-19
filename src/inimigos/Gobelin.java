package inimigos;

public class Gobelin extends Inimigo {

    public Gobelin() {
        super();
        this.setNome("Gobelin");
        this.setVidaInimigo(30);
        this.setDanoAtaqueInimigo(RANDOM.nextInt(DANO_MAXIMO1));
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
