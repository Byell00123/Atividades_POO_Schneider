package Exercicios_I;
import java.util.Scanner;
// 7. Faça um programa em Linguagem Java, para ler um valor em reais e exibir o equivalente em dólares. Considere que um dólar vale R$ 3,50.
public class Exercicio_007 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_007(){
        
        double reais, dollar, calculo;
        dollar = 3.5;
        
        System.out.print("\nDigite o valor em reais para o conversão: ");
        reais = banana.nextDouble();
        banana.close();
        
        calculo = (reais * dollar);
        
        System.out.println("\nO resultado da conversão de %f reais para dollar(a %.2f) é: %f.\n".formatted(reais,dollar,calculo));
        
    }
    
}
