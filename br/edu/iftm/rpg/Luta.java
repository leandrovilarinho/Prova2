package br.edu.iftm.rpg;

public class Luta {

    private Inimigo inimigo1;
    private Inimigo inimigo2;
    private Jogador jogador;

    public Luta(Jogador jogador, Inimigo inimigo1, Inimigo inimigo2) {
        this.jogador = jogador;
        this.inimigo1 = inimigo1;
        this.inimigo2 = inimigo2;
    }  
    
    public void enfrentar() {
        while(this.jogador.getVida() > 0 && (this.inimigo1.getVida() > 0 || this.inimigo2.getVida() > 0)) {
            if(this.inimigo1.getVida() > 0) {
                this.jogador.atacar(inimigo1);
                this.inimigo1.atacar(jogador);
            }
            if(this.inimigo2.getVida() > 0) {
                this.jogador.atacar(inimigo2);
                this.inimigo2.atacar(jogador);
            }
        }   
    }
}

