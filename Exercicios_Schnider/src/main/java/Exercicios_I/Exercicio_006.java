package Exercicios_I;
import java.util.Scanner;
// 6. Faça um programa em Linguagem Java, para ler um número inteiro e escreva o seu cubo.
public class Exercicio_006 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_006(){
        
        double numero, calculo;
        
        System.out.print("\nDigite o numero para calcular o seu cubo: ");
        numero = banana.nextDouble();
        banana.close();
        
        calculo = (numero * numero * numero);
        
        System.out.println("\nO cubo de %f é: %f.\n".formatted(numero, calculo));
        
    }
    
}
