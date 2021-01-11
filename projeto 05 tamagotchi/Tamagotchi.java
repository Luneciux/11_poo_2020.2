//TREINO DE ENCAPSULAMENTO
class Pokemon{

  //APENAS DENTRO DA CLASSE

  private int vida;
  private int vidaMax;
  private boolean alive;


  //CONSTRUTOR
  public Pokemon(int vidaMax){
      this.vida = vidaMax;
      this.vidaMax = vidaMax;
      this.alive = true;
  }

  //SETAR VIDA DO TAMAGOTCHI
  private void setVida(int value){
      vida = value;
      if(vida <= 0){
          vida = 0;
          System.out.println("Seu pet morreu de cansaço");

          this.alive = false;
      }
      if(vida > vidaMax)
          vida = vidaMax;
  }

  //TESTA SE ESTA VIVO
  boolean testarMorto(){
      if(this.alive)

          return false;
      System.out.println("Voce nao pode interagir com um pet morto");

      return true;
  }

  //BRINCA E REDUZ VITALIDADE
  public void brincar(){
      if(testarMorto())
          return;
      this.setVida(this.getVida() - 2);
  }

  //GETTERS E SETTERS
  public int getVida(){
      return vida;
  }

  public boolean isAlive(){
    
      return this.alive;
  }

  public String toString() {

      return vida + "/" + vidaMax;
  }
}

public class Tamagotchi{
  public static void main(String[] args) {
      Pokemon charizard = new Pokemon(30);
      while(charizard.isAlive()){
          charizard.brincar();
          System.out.println(charizard);
      }
  }
}