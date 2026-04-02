package Exercicios_I;
import java.util.Scanner;
// 5. Faça um programa em Linguagem Java, para ler dois números, calcular e mostrar a soma desses números.
public class Exercicio_005 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_005(){
        
        double num1, num2, calculo;
        
        System.out.print("\nDigite o Primeiro numero para a soma: ");
        num1 = banana.nextDouble();
        
        System.out.print("\nDigite o Segundo numero para a soma: ");
        num2 = banana.nextDouble();
        banana.close();
        
        calculo = (num1 + num2);
        
        System.out.println("\nO resultado de \"(%f + %f) =  %f\".\n".formatted(num1, num2, calculo));
        
    }
    
}
