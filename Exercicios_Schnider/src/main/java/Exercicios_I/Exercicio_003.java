package Exercicios_I;
import java.util.Scanner;
// 3. Faça um programa em Linguagem Java, para ler um número real e mostrar ele na tela.
public class Exercicio_003 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_003(){
        
        double numero;
        
        System.out.print("\nDigite um numero Real: ");
        numero = banana.nextDouble();
        banana.close();
        
        System.out.println("O numero escolhido é: %f.\n".formatted(numero));
        
    }
            
}
