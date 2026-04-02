package Exercicios_I;
import java.util.Scanner;
/* 17.Uma fábrica de camisetas produz os tamanhos, pequeno, médio e grande, cada uma sendo vendidas respectivamente por 10, 12 e 15 reais. 
Faça um programa em Linguagem Java, em que o usuário forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda, 
e o computador informe quanto será o valor arrecadado.*/
public class Exercicio_017 {
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_017(){
        
        int cami_p,cami_m,cami_g;
        double calculo;
        
        System.out.print("\nQuantas camisas tamanho P foram compradas: : ");
        cami_p = banana.nextInt();
        System.out.print("Quantas camisas tamanho M foram compradas: ");
        cami_m = banana.nextInt();
        System.out.print("Quantas camisas tamanho G foram compradas: ");
        cami_g = banana.nextInt();
        
        calculo = ((cami_p * 10) + (cami_m * 12) + (cami_g * 15));
        
        System.out.println("O valor total por todas as camisas é: R$ %.2f.\n".formatted(calculo));
        
    }
}
