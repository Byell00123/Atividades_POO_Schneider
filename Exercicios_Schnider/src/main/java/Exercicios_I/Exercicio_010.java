package Exercicios_I;
import java.util.Scanner;
// 10.A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um programa em Linguagem Java, para ler as dimensões e depois exibir a área do terreno.
public class Exercicio_010 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_010(){
        
        double lado_1, lado_2, calculo;
        
        System.out.print("\nDigite as dimensões da largura do terreno: ");
        lado_1 = banana.nextDouble();   
        
        System.out.print("\nDigite as dimensões do Comprimento do terreno: ");
        lado_2 = banana.nextDouble();
        banana.close();
        
        calculo = (lado_1 * lado_2);
        
        System.out.println("\nA area do terreno com dimensões %.2fX%.2f é: %fm².\n".formatted(lado_1,lado_2,calculo));
        
    }
    
}
