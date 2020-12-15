package br.edu.iftm.rpg;

public class Inimigo {
    
    private String nome;
    private int vida;
    private int dano;
    private int defesa;

    public Inimigo() {

    }

    public Inimigo(String nome, int vida, int dano, int defesa) {

        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.defesa = defesa;
    }

    public void atacar(Jogador jogador) {
        String ataque = this.nome + "o " + jogador.getNome() + " perde " + this.dano + " de vida.";
        System.out.println(ataque);
        jogador.perderVida(this.dano);
    }

    public void perderVida(int pontos) {
        int dano = pontos - this.defesa;
        this.vida -= dano > 0 ? dano : 0;
        if (this.vida <= 0) {
            System.out.println("O " + this.nome + " morreu.");
        } else if (this.vida > 0) {
            System.out.println("O " + this.nome + " perdeu " + dano + " de vida.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
