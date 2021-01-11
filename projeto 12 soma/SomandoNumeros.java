import java.util.Arrays;
import java.util.Scanner;

public class SomandoNumeros {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Digite numeros em linha separados por espaço");

        String line = entry.nextLine();
        String[] tokens = line.split(" ");//quebra a string em varios numeros dentro da array tokens
        int qtd = tokens.length;

        System.out.println("Voce digitou " + qtd + " elementos");
        
        System.out.print("[ ");

        for(int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");
        System.out.println("]");
        
        //somando todos
        float acc = 0;
        for(int i = 0; i < tokens.length; i++)
            acc += Float.parseFloat(tokens[i]);

        System.out.println("A soma deu " + acc);
        System.out.println(Arrays.asList(tokens));

        entry.close();
    }
}