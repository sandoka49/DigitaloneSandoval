
package desafiodiocurso;

import java.util.Scanner;

public class FolhaSalarial {
    private final int TrabadHoras, QuantHoras;
    private final double ValorHora;

    public FolhaSalarial(int QuantHoras, int TrabadHoras, double ValorHora) {
        this.TrabadHoras = TrabadHoras;
        this.QuantHoras = QuantHoras;
        this.ValorHora = ValorHora;
    }

    public static void main(String[] args){
        System.out.println("Entre Seu Codigo e suas horas trabalhadas e o Valor da Hora");
        FolhaSalarial CheqPag = readEntries();
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", CheqPag.getQuantHoras(), CheqPag.getSalary());
    }

    private static FolhaSalarial readEntries(){
        Scanner scanner = new Scanner(System.in);
        return new FolhaSalarial(scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
    }

    public double getSalary(){
        return this.TrabadHoras * this.ValorHora * 1f;
    }

    public int getQuantHoras (){
        return this.QuantHoras;
    }
}