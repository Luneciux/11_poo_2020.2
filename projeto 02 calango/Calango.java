import java.util.Scanner;

public class Calango {

  //ATRIBUTOS DO CALANGO  
  int bucho;
  int maxBucho;
  int nPatas;
  int vida;
  boolean alive;

  //CONSTRUTOR
  Calango(int maxBucho){
      this.bucho = maxBucho;
      this.maxBucho = maxBucho;
      this.nPatas = 4;
      this.vida = 4;
      this.alive = true;
  }

  void comer(int qtd){
      bucho += qtd;
      if(bucho > maxBucho){
          bucho = maxBucho;
          System.out.println("Buchin xei :) <3");
      }else{
          System.out.println("Tô cheio");
      }
  }

  void andar(){
      if(nPatas < 2){
          System.out.println("Estou impossibilitado de tal tarefa");
          return;
      }
      if(bucho > 0){
          bucho -= 1;
          System.out.println("Que passeio agradavel");
          return;
      }
      System.out.println("Já não estou suportando mais");
      
  }

  void acidentar(){
      if(nPatas > 0){
          nPatas -= 1;
          System.out.println("Perdi uma pata ; - ; - ;");
      }else{
          System.out.println("Já virei cobra!!");
          alive = false;
      }
  }

  void regenerar(){
      if(nPatas == 4){
          System.out.println("Só o pips");
      }else if (bucho > 0){
          nPatas += 1;
          bucho -= 1;
          System.out.println("Recuperei uma pata!");
      }else{
          System.out.println("Nao tenho energia suficiente para me recuperar");
      }
  }

  public String toString() {
      return "Bucho: " + bucho + "/" + maxBucho + " Patas: " + nPatas  + " Alive:" + alive;
  }

  public static void main(String[] args) {

    Calango dead = new Calango(20);
    
    Scanner entry = new Scanner(System.in);
    int opc = 0;

    do {
        System.out.println("-- DEADLANGO DASHBOARD --");
        System.out.println("-- 1. COMER");
        System.out.println("-- 2. ANDAR");
        System.out.println("-- 3. ACIDENTAR");
        System.out.println("-- 4. REGENERAR");
        System.out.println("-- 5. INFO");
        System.out.println("-- 6. SAIR");
        System.out.print("Opção: ");

        opc = entry.nextInt();
        
        switch(opc){
            case 1:
                int qtd = entry.nextInt();
                dead.comer(qtd);
                break;
            case 2:
                dead.andar();
                break;
            case 3:
                dead.acidentar();
                break;    
            case 4:
                dead.regenerar();
                break;
            case 5:
                System.out.println(dead);
                break;
            case 6:
                break;        
            default:
                break;
        }
    } while (opc != 6);

    entry.close();
  }
}