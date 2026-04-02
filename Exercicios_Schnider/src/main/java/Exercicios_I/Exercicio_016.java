package Exercicios_I;
import java.util.Scanner;
/* 16.Faça um programa em Linguagem Java, para ler três notas de um aluno em uma disciplina e imprimir a sua 
média ponderada (as notas têm pesos 1, 2 e 3 respectivamente).*/
public class Exercicio_016 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_016(){
        
        double n1,n2,n3, calculo;
        
        System.out.print("\nInforme a 1° nota do aluno(peso 1): ");
        n1 = banana.nextDouble();
        System.out.print("Informe a 2° nota do aluno(peso 2): ");
        n2 = banana.nextDouble();
        System.out.print("Informe a 3° nota do aluno(peso 3): ");
        n3 = banana.nextDouble();
        
        calculo = (((n1 * 1) + (n2 * 2) + (n3 * 3)) / (1 + 2 + 3));
        
        System.out.println("A nota final do aluno é %.2f.\n".formatted(calculo));
        
    }
}
