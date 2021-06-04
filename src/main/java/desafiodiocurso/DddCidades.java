package desafiodiocurso;

import java.io.IOException;
import java.util.Scanner;

public class DddCidades {

    public static void main(String[] args) throws IOException {
       System.out.println("Informe o DDD para verificação:");
        Scanner numDDD = new Scanner(System.in);
        int DDD = numDDD.nextInt();
        switch (DDD) {
            case 61 -> System.out.println("Brasilia");
            case 71 -> System.out.println("Salvador");
            case 11 -> System.out.println("Sao Paulo");
            case 21 -> System.out.println("Rio de Janeiro");
            case 32 -> System.out.println("Juiz de Fora");
            case 19 -> System.out.println("Campinas");
            case 27 -> System.out.println("Vitoria");
            case 31 -> System.out.println("Belo Horizonte");
            case 81 -> System.out.println("Recife");
            default -> System.out.println("DDD nao cadastrado");
        }
    }

}
