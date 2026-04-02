package Exercicios_I;
import java.util.Scanner;
// 11.Faça um programa em Linguagem Java, para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.

public class Exercicio_011 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_011() {
        
        int cavalos, calculo;
        int patas = 4;
        
        System.out.print("\nDigite a quantidade de cavalos: ");
        cavalos = banana.nextInt();
        banana.close();
        
        calculo = (cavalos * patas);
        
        System.out.println("\nA quantidade de ferraduras, considerando que cada cavalo tem %d patas e são %d cavalos, é: %d ferraduras.\n".formatted(patas,cavalos,calculo));
        
    }
    
}
