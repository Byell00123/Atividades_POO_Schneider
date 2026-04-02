package Exercicios_I;
import java.util.Scanner;
/* 13.Faça um programa em Linguagem Java, receber a idade de uma pessoa, e exibir quantos dias de vida ela possui. Considere sempre anos
completos, e que um ano possui 365 dias.*/
public class Exercicio_013 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_013(){
        
        int idade, calculo;
        int dias_p_ano = 365;
        
        System.out.print("\nInfome uma idade: ");
        idade = banana.nextInt();
        banana.close();
        
        calculo = (idade * dias_p_ano);
        
        System.out.println("A conversão de %d anos, considerando que todo ano tem 365 dias, para dias resulta em: %d.\n".formatted(idade,calculo));
        
    }
    
}
