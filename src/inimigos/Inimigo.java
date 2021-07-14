package inimigos;

public abstract class Inimigo {

    String nome;
    int vidaInimigo;
    int danoAtaqueInimigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVidaInimigo() {
        return vidaInimigo;
    }

    public void setVidaInimigo(int vidaInimigo) {
        this.vidaInimigo = vidaInimigo;
    }

    public int getDanoAtaqueInimigo() {
        return danoAtaqueInimigo;
    }

    public void setDanoAtaqueInimigo(int danoAtaqueInimigo) {
        this.danoAtaqueInimigo = danoAtaqueInimigo;
    }

}
