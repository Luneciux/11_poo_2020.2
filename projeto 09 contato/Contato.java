import java.util.ArrayList;

//CLASSE FONE PARA GUARDAR OS TELEFONES DOS CONTATOS
class Fone{


    String label;
    String number;

    //CONSTRUTOR
    public Fone(String label, String number){
        this.label = label;
        this.number = number;
    }


    //VALIDAÇÃO DE CONTATO
    public static boolean validate(String number){
        String validos = "0123456789()-";
        for(int i = 0; i < number.length(); i++)
            if(validos.indexOf(number.charAt(i)) == -1)

                return false;

        return true;
    }

    public String toString(){

        return label + ":" + number;
    }
}

//CLASSE CONTATO
class Contato{

    String nome;
    ArrayList<Fone> fones;

    //CONSTRUTOR
    public Contato(String nome){
        this.nome = nome;
        this.fones = new ArrayList<>();
    }

    //ADICIONA FONE
    public void addFone(String label, String number){//vai má!
        if(Fone.validate(number))
            fones.add(new Fone(label, number));
    }

    //RECUPERA UM FONE
    Fone getFone(int index){
        if(index >= 0 && index < fones.size()) {

            return fones.get(index);
        }
        System.out.println("Indice invalido");

        return null;
    }
    
    //RETORNA NULO SE NÃO ENCONTRAR
    Fone getFone(String label) {
        for(Fone fone : fones)
            if(fone.label.equals(label))

                return fone;

        return null;
    }

    //REMOVE UM FONE INDICE
    boolean rmFone(int index){
        if(index < 0 || index >= fones.size())

            return false;
        fones.remove(index);

        return true;
    }

    //REMOVE FONE POR STRING
    boolean rmFone(String number){
        if(!Fone.validate(number)){
            System.out.println("Digite um numero valido");

            return false;
        }
        for(Fone fone : fones){
            if(fone.number.equals(number)){
                Crianca sair = fone;
                fones.remove(fone);

                return sair;
            }
        }

        return false;
    }

    public String toString(){
        String saida = this.nome;
        int i = 0;
        for(Fone fone : fones){
            saida += " [" + i + ":" + fone + "]";
            i++;
        }

        return saida;
    }

    //MAIN
    public static void main(String[] args) {

        Contato contato = new Contato("JOSUÉ");
        contato.addFone("CLARO", "88");
        System.out.println(contato);
        System.out.println(contato.getFone(1));

        //REMOVENDO O FONE 88 DA ARRAY
        contato.rmFone("88");
        System.out.println(contato);
    }
}