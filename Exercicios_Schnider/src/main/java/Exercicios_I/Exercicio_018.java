package Exercicios_I;
import java.util.Scanner;
/* 18.Faça um programa em Linguagem Java, para calcular a distância entre dois pontos do plano cartesiano. Cada ponto é um par ordenado (x,y).*/
public class Exercicio_018 {
    
    Scanner banana = new Scanner(System.in);
    
        public void getExercicio_018(){
        
        double ax,ay,BX,BY,calculoX,calculoY,hipotenusa;
        
        System.out.print("\nInforme o valor do eixo x do Ponto A: ");
        ax = banana.nextDouble(); // ax = 2
        System.out.print("Informe o valor do eixo y do Ponto A: ");
        ay = banana.nextDouble(); // ay = 3
        System.out.print("\nInforme o valor do eixo x do Ponto B: ");
        BX = banana.nextDouble(); // Bx = 5
        System.out.print("Informe o valor do eixo y do Ponto B: ");
        BY = banana.nextDouble(); // BY = 7
        
        calculoX = (Math.abs(ax - BX));
        calculoY = (Math.abs(ay - BY));
        hipotenusa = (Math.sqrt(Math.pow(calculoX,2) + Math.pow(calculoY,2))); // A² = B² + C² ---> A = √(B² + C²)
        // Estou optando por não usar um calculo direto de hipotenusa para demonstar que conheço as formulas.
        
        
        System.out.println("\nA distância entre A e B é de %.2fcm no eixo X e %.2fcm no eixo Y e a menor distancia(hipotenusa) é de %.2fcm.\n"
                .formatted(calculoX,calculoY,hipotenusa)); // Triângulo pitagórico onde x:3, y:4 e hipotenusa: 5        
    }
}