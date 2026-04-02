package Exercicios_I;
import java.util.Scanner;
// 4. Faça um programa em Linguagem Java, para ler um nome e mostrar ele na tela.
public class Exercicio_004 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_004(){
        
        String palavra;
        
        System.out.print("\nDigite um nome: ");
        palavra = banana.nextLine();
        banana.close();
        
        System.out.println("\nA nome escrito foi: %s.\n".formatted(palavra));
        
        
    }
    
}
