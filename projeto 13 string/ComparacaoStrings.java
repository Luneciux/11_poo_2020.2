public class ComparacaoStrings {
  public static void main(String[] args) {
      //true - mesma entrada na tabela de constantes
      System.out.println("Yasuo" == "Yasuo");

      //false - objetos diferentes
      System.out.println("Miau" == new String("Miau"));

      //true - mesmo conteúdo
      System.out.println("A".equals(new String("A")));
  }
}