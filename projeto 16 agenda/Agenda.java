import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;


class Pessoa{

    String id;
    int idade;

    public Pessoa(String id, int idade){


        this.id = id;
        this.idade = idade;
    }
    public String toString(){
        return this.id + ":" + this.idade;
    }

    public boolean equals(Object obj){


        if(!(obj instanceof Pessoa))
            return false;
        Pessoa other = (Pessoa) obj;
        return this.id.equals(other.id);
    }
}

class ComparadorPessoas implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa arg0, Pessoa arg1) {

        if(arg0 == null)

            return -1;
        if(arg1 == null)

            return 1;
        int resultado = arg0.id.compareTo(arg1.id);
        if (resultado != 0)

            return resultado;
        return Integer.compare(arg0.idade, arg1.idade);
    }
}

class ComparadorPessoaPorIdade implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa arg0, Pessoa arg1) {
        if(arg0 == null)

            return -1;
        if(arg1 == null)
        
            return 1;
        return Integer.compare(arg0.idade, arg1.idade);
    }
}

public class Agenda{
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("Josué", 1));

        //TESTE PARA NULO
        pessoas.add(null);    
    }
}