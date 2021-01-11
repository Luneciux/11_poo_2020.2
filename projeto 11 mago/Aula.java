import java.util.Scanner;
import java.util.Arrays;

class Mago {

  String nome;
  String titulo;
  String magia;
  int mana;

  Mago(String nome, String titulo, String magia, int mana){
      this.nome = nome;
      this.titulo = titulo;
      this.magia = magia;
      this.mana = mana;
  }

  void lancarMagia(String magia, int forca){

      if(this.magia.equals(magia)){

          if(this.mana >= forca){
              System.out.println("I GOT THE POWER!");
              this.mana -= forca;
          }else{
              System.out.println("Mana insuficiente");
          }
      }else{
          System.out.println("Magia desconhecida");
      }
  }

  public String toString(){
      return "Nome: " + nome + " Titulo: " + titulo + " Magia: " + magia + " Mana: " + mana;
  }
  
}

public class Aula{
  public static void main(String[] args) {
    
      Scanner scanner = new Scanner(System.in);

      Mago mago = new Mago("", "", "", 0);

      while(true){

        String line = scanner.nextLine();
        String[] opc_act = line.split(" ");
        
        if(opc_act[0].equals("end")){
          break;
          
        }else if(opc_act[0].equals("init")){ //init _nome _titulo _magia _mana
          mago = new Mago(opc_act[1], opc_act[2], opc_act[3], Integer.parseInt(opc_act[4]));

        }else if(opc_act[0].equals("show")){ //show
          System.out.println(mago);

        }else if(opc_act[0].equals("magia")){ //magia _nome _forca
          mago.lancarMagia(opc_act[1], Integer.parseInt(opc_act[2]));

        }else{
          System.out.println("fail: comando invalido");
        }
      }
      scanner.close();
  }
}