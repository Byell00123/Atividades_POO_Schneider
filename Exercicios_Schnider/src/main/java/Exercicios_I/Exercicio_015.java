package Exercicios_I;
import java.util.Scanner;
/* 15.O restaurante a quilo Bem-Bão cobra R$ 12,00 por quilo de refeição.Faça um programa em Linguagem Java, que leia o peso do prato
montado pelo cliente (em quilos) e imprima o valor a pagar. Assume que a balança já desconte o peso do prato.*/
public class Exercicio_015 {
    
        
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_015(){
        
        double preco_kg = 12.0;
        double peso_refeicao, calculo;
        
        System.out.print("\nInforme o peso do refeição: ");
        peso_refeicao = banana.nextDouble();
        
        calculo = (12 * peso_refeicao);
        
        System.out.println("Com a refeição custando R$ %.2f/kg e seu prato pesando R$ %.2fkg, o preço a pagar é R$ %.2f.\n"
                .formatted(preco_kg,peso_refeicao,calculo));
        
    }
    
}
