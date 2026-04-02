package Exercicios_I;
import java.util.Scanner;
// 8. Faça um programa em Linguagem Java, para ler o salário de um funcionário e imprimi-lo com aumento de 15%.
public class Exercicio_008 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_008(){
        
        double salario, acrescimo, calculo;
        acrescimo = 1.15;
        
        System.out.print("\nDigite o valor do salario para calcular o aumento: ");
        salario = banana.nextDouble();
        banana.close();
        
        calculo = (salario * acrescimo);
        
        System.out.println("\nO salario de %f com um aumento de 15%% resulta em: %f reais.\n".formatted(salario,calculo));
        
    }

    
}
