import java.util.ArrayList;
import java.util.TreeMap;

class Pessoa{
    private String nome;
    private boolean meia;

    public Pessoa(String nome, boolean pagaMeia){
        this.nome = nome;
        this.meia = pagaMeia;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean getMeia(){
        return this.meia;
    }

    public String toString() {
        StringBuilder saida = new StringBuilder();
        saida.append("[" + nome + ", ");
        if(meia == true){
            saida.append("meia]\n");
        }else saida.append("inteira]\n");

        return saida.toString();
    }
}

class Venda{
    private Pessoa cliente;
    private Evento evento;
    private Setor setor;
    private double valor;

    public Venda(Pessoa cliente, Evento evento, Setor setor, double valor){
        this.cliente = cliente;
        this.evento = evento;
        this.setor = setor;
        this.valor = valor;
    }

    public String toString(){
        return "[" + this.cliente.getNome() + ", " + this.evento.nome + ", " + this.setor.nome + ", " + this.valor + "]";
    }
}

class Setor{
    private String nome;
    private double preco;
    private int qtd;
    private int capacidade;

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getCapacidade(){
        return this.capacidade;
    }

    void vender(){
        //
        this.qtd++;
    }

    public Setor(String nome, double preco, int capacidade){
        this.nome = nome;
        this.preco = preco;
        this.capacidade = capacidade;
}

class Evento{
    private String nome;
    private TreeMap<String, Setor> repSetores;

    public Evento(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    void addSetor(Setor setor){
        if(this.repSetores.containsKey(setor.getNome()))
            System.out.println("fail: setor " + setor.getNome() + " ja existente");
            return;
        }
        this.repSetores.put(setor.getNome(), new Setor(setor.getNome(), setor.getPreco(), setor.getCapacidade()));
    }

    public String toString() {
        return "[" + nome + "]\n";
    }

}

public class Bilheteria{
    private Arraylist<Venda> repVendas;
    private TreeMap<String, Pessoa> repPessoas;
    private TreeMap<String, Evento> repEvento;
    private double caixa;

    void vender(String cliente, String evento, String setor){

    }

    double getCaixa(){
        return this.caixa;
    }

    void showVendas(){

    }
    
    void showPessoas(){
        for(Pessoa pessoa : this.repPessoas.values()){
            System.out.println(pessoa);
        }
    }

    void showEventos(){
        for(Evento evento : this.repEvento.values()){
            System.out.println(evento);
        }
    }

    void addPessoa(String nome, boolean meia){
        if(this.repPessoas.containsKey(nome)){
            System.out.println("fail: pessoa " + nome + " ja existe");
            return;
        }
        this.repPessoas.put(nome, new Pessoa(nome, meia));
    }

    void addEvento(String idEvento){

    }

    void addSetor(String idEvento, String idSetor, double preco, int capacidade){

    }
}