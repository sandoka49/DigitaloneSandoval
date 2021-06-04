package desafiodiocurso;

import java.io.IOException;
import java.util.Scanner;

public class CalculoDeViagem {

    public static void main(String[] args) throws IOException {


        System.out.println("Informe a distânçia e a quantidade de combustivel gasta:");
        Scanner valores = new Scanner(System.in);

        int x  = valores.nextInt();
        double y = valores.nextDouble();

        double media = x / y;  //insira as variaveis de acordo com o enunciado
        System.out.println(String.format("Sua média de consumo é %.3f km/l", media ));
    }

}
