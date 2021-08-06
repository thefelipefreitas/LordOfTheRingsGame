package inimigos;

public class Ogro extends Inimigo {

    public Ogro() {
        super.setNome("Ogro");
        super.setVidaInimigo(45);
        super.setDanoAtaqueInimigo(RANDOM.nextInt(DANO_MAXIMO2));
    }

}
