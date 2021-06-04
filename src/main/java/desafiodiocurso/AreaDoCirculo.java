package desafiodiocurso;



import java.util.Scanner;

public class AreaDoCirculo {

    private static final double PI = 3.14159;


    public static void main(String[] args) {
        System.out.println("entre com o raio do circulo:");
        double area = calcAreaCirculo(new Scanner(System.in).nextDouble());
        System.out.printf("O calculo do circulo é A=%.4f\n",area );
    }

    public static Double calcAreaCirculo(Double radius) {
        return PI * Math.pow(radius, 2);
    }
}
