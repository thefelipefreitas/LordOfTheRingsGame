package inimigos;

public class Orque extends Inimigo {

    public Orque() {
        super.setNome("Orque");
        super.setVidaInimigo(60);
        super.setDanoAtaqueInimigo(RANDOM.nextInt(DANO_MAXIMO3));
    }

}
