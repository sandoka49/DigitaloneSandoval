package desafiodiocurso;


import com.sun.source.util.SourcePositions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AcharNumerosPares {
    public static final int NUMERO_ENTRADA = 6;
    private final List<Integer> numeros;
    private int par = 0, negativo = 0, positivo = 0;

    public AcharNumerosPares(List<Integer> numeros) {
        this.numeros = numeros;
         numerosPares();
    }
            public static void main(String[] args) {
        System.out.println("Escreva 6 numeros");
            AcharNumerosPares numerosPares = lerEntradas();
            System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)",
                    numerosPares.valoresPares(), numerosPares.valoresImpares(), numerosPares.valoresPositivos(), numerosPares.valoresNegativos());
        }
        private static AcharNumerosPares lerEntradas() {
            Scanner scanner = new Scanner(System.in);
            return new AcharNumerosPares(IntStream.rangeClosed(1, NUMERO_ENTRADA)
                    .mapToObj(value -> scanner.nextInt())
                    .collect(Collectors.toCollection(ArrayList::new)));
        }

    public int valoresImpares() {
        return NUMERO_ENTRADA - this.par;
    }

    public int valoresPositivos() {
        return this.positivo;
    }

    public int valoresNegativos() {
        return this.negativo;
    }

    public int valoresPares() {
        return this.par;
    }

    private void numerosPares() {
        this.numeros.forEach(numeros -> {
            this.par += numeroePar(numeros) ? 1 : 0;
            this.negativo += numeroeNegativo(numeros) ? 1 : 0;
            this.positivo += numeroePositivo(numeros) ? 1 : 0;

        });
    }
       private static boolean numeroePar(int numero) {
        return numero % 2 == 0;
       }

    private static boolean numeroePositivo(int numero) {
        return numero > 0;
    }

    private static boolean numeroeNegativo(int numero) {
        return numero < 0;
    }
}



