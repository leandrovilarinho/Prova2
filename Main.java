import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Luta;

class Main {
    public static void main(String[] args) {
          
      Jogador jogador1 = new Jogador(100, "Sir Alonne", 10, 15);
          
      Inimigo inimigo1 = new Inimigo("Vendrick", 100, 2, 5);
      Inimigo inimigo2 = new Inimigo("Smelter Demon", 100, 5, 8);
          
      Luta luta = new Luta(jogador1, inimigo1, inimigo2);
          
      System.out.println("Os vilões Vendrick e Smelter Demon aparecem para derrotar Sir Alone!!");
      luta.enfrentar();
    }
  }