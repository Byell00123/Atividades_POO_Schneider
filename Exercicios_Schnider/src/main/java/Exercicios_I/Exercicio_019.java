package Exercicios_I;
import java.util.Scanner;
/* 19.Faça um programa em Linguagem Java, para ler o salário de um funcionário e aumentá-lo em 15 %. 
Após o aumento, desconte 8% de ipostos. Imprima o salário inicial, o salário com o aumento e o salário final.*/
public class Exercicio_019 {
    
    Scanner banana = new Scanner(System.in);
    
        public void getExercicio_019(){
        
        double salario_inicial,salario_aumento,salario_final,aumento=1.15,imposto=0.92; // 1.15 = +15% ----- 0.92 = -8%
        
        System.out.print("\nInforme seu salario: ");
        salario_inicial = banana.nextDouble();
//        salario_inicial = 86.9569; // teste: 86.9569 + 15% = 100 =====> 100 -8% = 92.
                
        salario_aumento = (salario_inicial * aumento);
        salario_final = (salario_aumento * imposto);
        
        System.out.print("\nSalario inicial: %.2f ,".formatted(salario_inicial));
        System.out.print("\nSalario com acrescimo : %.2f ,".formatted(salario_aumento));
        System.out.println("\nSalario final com os descontos dos impostos: %.2f.\n".formatted(salario_final));
    }
}
