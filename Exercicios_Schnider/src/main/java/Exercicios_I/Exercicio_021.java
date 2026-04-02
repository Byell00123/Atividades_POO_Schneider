package Exercicios_I;
import java.util.Scanner;
/* 21.Alguns países medem a temperatura em graus Celsius e outros em fahrenheit. Faça um programa em Linguagem Java, 
para ler uma temperatura em Celsius e imprimir em fahrenheit. (Pesquise como fazer esse tipo de conversão).*/
public class Exercicio_021 {
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_021(){
        
        double temp_celsius,calculo;
        
        System.out.print("\nInforme a emperatura em °Celsius: ");
        temp_celsius = banana.nextDouble();
        calculo = ((temp_celsius * (9/5)) + 32); // ((0 °C × (9/5)) + 32) = 32 °F
        System.out.println("%.1f°C convertidos em fahrenheit é: %.1f°f.\n".formatted(temp_celsius,calculo));
        
        
    }
    
}
