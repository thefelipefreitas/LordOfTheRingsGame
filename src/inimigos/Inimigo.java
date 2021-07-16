package inimigos;

import java.util.Random;

public abstract class Inimigo {

    public static final int DANO_MAXIMO1 = 15;
    public static final int DANO_MAXIMO2 = 25;
    public static final int DANO_MAXIMO3 = 30;
    public static final Random RANDOM = new Random();
    protected String nome;
    protected int vidaInimigo;
    protected int danoAtaqueInimigo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVidaInimigo(int vidaInimigo) {
        this.vidaInimigo = vidaInimigo;
    }

    public void setDanoAtaqueInimigo(int danoAtaqueInimigo) {
        this.danoAtaqueInimigo = danoAtaqueInimigo;
    }

    public String getNome() {
        return nome;
    }

    public int getVidaInimigo() {
        return vidaInimigo;
    }

    public int getDanoAtaqueInimigo() {
        return danoAtaqueInimigo;
    }

    public abstract int atacar();

    public abstract void sofrerDano(int dano);

}
