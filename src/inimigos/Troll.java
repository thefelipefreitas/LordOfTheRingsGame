package inimigos;

public class Troll extends Inimigo {

    public Troll() {
        super.setNome("Troll");
        super.setVidaInimigo(50);
        super.setDanoAtaqueInimigo(RANDOM.nextInt(DANO_MAXIMO2));
    }

}
