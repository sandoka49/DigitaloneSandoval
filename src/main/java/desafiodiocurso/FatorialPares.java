package desafiodiocurso;

import java.util.Scanner;

public class FatorialPares {
    private int pares;
    public static int maiorPar;


    public static void main(String[] args) {
        System.out.println("Escreva um numeros Maior que 0");
        Scanner scanner = new Scanner(System.in);
        final int NUMEROENTRANTE = scanner.nextInt();
        if (NUMEROENTRANTE <= 0) {
            System.out.println("Este numero é menor que 0");
        } else if  (NUMEROENTRANTE % 2 ==0){
           maiorPar = NUMEROENTRANTE;
        }else {
            maiorPar = NUMEROENTRANTE -1;
        }
        while (maiorPar >= 2) {
            System.out.println(maiorPar);
            maiorPar -= 2;
        }

        System.out.println(NUMEROENTRANTE);
    }
}