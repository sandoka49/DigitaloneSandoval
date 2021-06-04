package desafiodiocurso;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MostrandoNumerosPares {

    public static void main(String[] args) {
        System.out.println("Escreva um numeros Maior que 0");
        int numero = new Scanner(System.in).nextInt();

        numerosParesAteoNumero(numero).forEach(System.out::println);
        System.out.println(numero);

    }

    public static IntStream numerosParesAteoNumero(int numero) {
        IntStream numeroPares = IntStream.rangeClosed(1, numero);
        return numeroPares.filter(x -> x % 2 == 0);
    }
}