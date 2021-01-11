//PRATICAS DE ARRAYLIST EM JAVA
import java.util.ArrayList;

//CLASSE CRIANÇA QUE VAI SER USADA NAS ARRAYS
class Crianca{

    String nome;
    int idade;

    //CONSTRUTOR
    public Crianca(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String toString(){
        return nome + ":" + idade;
    }
}


//CLASSE DO PULA PULA QUE VAI TER AS ARRAYS [MAIN]
class Pula_Pula{

    //ARRAYS DE CRIANÇAS NA FILA
    ArrayList<Crianca> esperando;
    ArrayList<Crianca> brincando;

    public PulaPula(){
        this.esperando = new ArrayList<>();
        this.brincando = new ArrayList<>();
    }

    //METODO ADD PARA ARRAY
    public void chegar(Crianca crianca){
        esperando.add(0, crianca);
    }

    //TIRA DA FILA E ESPERA
    public void entrar(){
        if(esperando.isEmpty())
            return;

        //PEGA A CRIANÇA
        Crianca primeira = esperando.get(esperando.size() - 1);

        //RETIRA DA ARRAY DE ESPERA
        esperando.remove(esperando.size() - 1);

        //ADICIONA NO BRINCANDO
        brincando.add(0, primeira);
    }

    public void sair(){

    }

    //REMOVE CRIANÇA
    public Crianca remover(String nome){
        for(Crianca crianca : esperando){
            if(crianca.nome.equals(nome)){
                Crianca aux = crianca;
                esperando.remove(crianca);
                return aux;
            }
        }
        for(Crianca crianca : brincando){
            if(crianca.nome.equals(nome)){
                Crianca aux = crianca;
                esperando.remove(crianca);
                return aux;
            }
        }
        return null;
    }

    public String toString(){
        return "=>" + esperando + " => " + brincando;
    }


    //MAIN
    public static void main(String[] args) {


        PulaPula pp = new PulaPula();
        pp.chegar(new Crianca("JOÃO", 3));
        System.out.println(pp);
        pp.entrar();
        System.out.println(pp);
        
    }
}