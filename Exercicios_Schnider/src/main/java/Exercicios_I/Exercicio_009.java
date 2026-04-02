package Exercicios_I;
import java.util.Scanner;
// 9. Faça um programa em Linguagem Java, para ler dois valores reais e exibir o primeiro com acréscimo de 30%, e o segundo com desconto de 25%.
public class Exercicio_009 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_009(){
        
        double num1, num2, calculo_n1, calculo_n2;
        
        System.out.print("\nDigite o Primeiro Valor: ");
        num1 = banana.nextDouble();
        
        System.out.print("\nDigite o Segundo Valor: ");
        num2 = banana.nextDouble();
        banana.close();
        
        calculo_n1 = (num1 * 1.3);
        
        calculo_n2 = (num2 * 0.75);
        
        System.out.println("\nO Primeiro Valor(%f) acrescimo de 30%% e o Segundo Valor(%f) com desconto de 20%% são: %f e %f.\n".formatted(num1,num2,calculo_n1,calculo_n2));
        
    }
    
}
