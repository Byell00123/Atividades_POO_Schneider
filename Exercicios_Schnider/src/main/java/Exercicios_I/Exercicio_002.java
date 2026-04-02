package Exercicios_I;
import java.util.Scanner;
// 2. Faça um programa em Linguagem Java, para ler um número inteiro e mostrar ele na tela.
public class Exercicio_002 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_002(){
        
        int numero;
        
        System.out.print("\nDigite um numero inteiro: ");
        numero = banana.nextInt();
        banana.close();
        
        System.out.println("O numero escolhido é: %d.\n".formatted(numero));
        
    }
}
