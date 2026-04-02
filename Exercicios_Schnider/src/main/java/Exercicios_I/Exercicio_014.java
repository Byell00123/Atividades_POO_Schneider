package Exercicios_I;
import java.util.Scanner;
/* 14.Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um programa em Linguagem Java, para ler o preço do litro da
gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque. */
public class Exercicio_014 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_014(){
        
        double preco_gasolina,valor_pago,calculo;
        
        System.out.print("\nInforme o preço por litro: ");
        preco_gasolina = banana.nextDouble();
        System.out.print("Informe o quanto foi pago: ");
        valor_pago = banana.nextDouble();
        
        calculo = (valor_pago / preco_gasolina);
        
        System.out.println("Com R$ %.2f e a gasolina custando R$ %.2f/L, foi possivel colocar %.3fL de gasolina.\n"
                .formatted(valor_pago,preco_gasolina,calculo));
        
        
    }
    
}
