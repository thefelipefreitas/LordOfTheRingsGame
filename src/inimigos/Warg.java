package inimigos;

public class Warg extends Inimigo {

    public Warg() {
        super.setNome("Warg");
        super.setVidaInimigo(50);
        super.setDanoAtaqueInimigo(RANDOM.nextInt(DANO_MAXIMO2));
    }

}
