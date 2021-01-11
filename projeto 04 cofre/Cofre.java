enum Moeda {

  //TAMANHO DAS MOEDAS
  M10(0.10f, 1),
  M25(0.25f, 2),
  M50(0.50f, 3),
  M100(1f, 4);

  float valor;
  int volume;

  Moeda(float valor, int volume) {
      this.valor = valor;
      this.volume = volume;
  }

  public String toString() {
      return "Valor: " + valor + "\nVolume: " + valor + "\n";
  }
}

//ITEMS QUE PODEM SER COLOCADOS NO COFRE
class Item {
  String descricao;
  int volume;

  Item(String descricao, int volume) {
      this.descricao = descricao;
      this.volume = volume;
  }

  public String toString() {
      return "Descricao:" + descricao + "\nVolume: " + volume + "\n";
  }
}


//PORQUINHO (COFRE)
class Porco{
  String itens = "";
  float valor = 0.0f;
  int volume = 0;
  int volumeMax;
  boolean estaQuebrado = false;
  
  //CONSTRUTOR
  Porco(int volumeMax) {
      this.volumeMax = volumeMax;
  }

  //ADICIONA MONEYS NO PORCU
  boolean adicionarDinheiro(Moeda moeda){
      if(estaQuebrado == true){
          System.out.println("O porco esta quebrado");

          return false;
      }
      if(moeda.volume + this.volume > this.volumeMax){
          System.out.println("Porco esta lotado");

          return false;
      }
      this.valor += moeda.valor;
      this.volume += moeda.volume;

      return true;
  }

  //ADICIONA ITEM NO PUERCO
  boolean adicionarItem(Item item) {
      if(estaQuebrado == true){
          System.out.println("O porco esta quebrado");

          return false;
      }
      if(this.volume + item.volume > volumeMax) {
          System.out.println("Objeto insuportável no cofre");

          return false;
      }
      this.volume += item.volume;
      if(this.itens.equals(""))
          this.itens = item.descricao;            
      else
          this.itens += ", " + item.descricao;

      return true;
  }   

  //MORTE CRUEL
  boolean quebrar(){
      if(estaQuebrado)

          return false;

      estaQuebrado = true;

      return true;
  }

  //RECOLHE DINHEIRO DO PUERCO
  float pegarDinheiro(){
      if(!estaQuebrado){
          System.out.println("Voce deve quebrar o cofre primeiro");

          //VALOR 0
          return 0.0f;
      }
      float aux = this.valor;
      this.valor = 0;

      return aux;
  }

  //COISAS ALÉM DE MONEYS DENTRO DO COFRE
  String pegarCoisas(){
      if(!estaQuebrado){
          System.out.println("Voce deve quebrar o cofre primeiro");

          return "";
      }
      String aux = this.itens;
      this.itens = "";

      return aux;
  }

  //STRINGS
  public String toString() {
      return itens + ":" + valor +":" + volume + "/" + volumeMax + ":" + estaQuebrado;
  }
}

//MAIN
public class Cofre{
  public static void main(String[] args) {
    
      //NOVO PUERCO E TAMANHO
      Porco porco = new Porco(25);
      System.out.println(porco);
      porco.adicionarDinheiro(Moeda.M100);
      porco.adicionarDinheiro(Moeda.M100);
      porco.adicionarDinheiro(Moeda.M25);
      porco.adicionarDinheiro(Moeda.M50);
      System.out.println(porco);
      porco.adicionarItem(new Item("cordao de ouro", 10));
      System.out.println(porco);
      porco.adicionarItem(new Item("anel", 4));
      System.out.println(porco);
      porco.adicionarItem(new Item("rolex", 6));
      System.out.println(porco);
      porco.adicionarItem(new Item("juliet", 20));
      System.out.println(porco);

      porco.quebrar();
      porco.pegarCoisas();

      porco.pegarDinheiro();
      porco.quebrar();
  }
}