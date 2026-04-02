package Exercicios_I;
import java.util.Scanner;
/* 20.A lanchonete Gostosura vende um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. 
Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que uma rodela de hambúrguer pesa 100 gramas, faça um programa em Linguagem Java, em 
que o dono forneça a quantidade de sanduíches a fazer, e o computador forneça as quantidades(kg) de queijo, presunto e carne necessários para compra.
 */
public class Exercicio_020 {
        Scanner banana = new Scanner(System.in);
    
        public void getExercicio_020(){
        
        int queijo_fat=2,presunto_fat=1,burguer_fat=1,sanduiches_qtd;
        double queijo_peso=.05,presunto_peso=.05,burguer_peso=.1;// 1kg=1000g --> 5kg=5000g --> 0,5kg=500g --> 0,05kg=50g --> 0,005kg=5g
        double queijo_peso_total,presunto_peso_total,burguer_peso_total;
        
        System.out.print("\nInforme quantos saduiches que serão feitos: ");
        sanduiches_qtd = banana.nextInt();
//        sanduiches_qtd = 2; // 2 sanduiches: Queijo: 4 fatias = 0,200kg, Presunto: 2 fatias = 0,100kg, Hamburger: 2 fatia = 0,200kg.
        
        queijo_peso_total = (queijo_fat * queijo_peso * sanduiches_qtd);
        presunto_peso_total = (presunto_fat * presunto_peso * sanduiches_qtd);
        burguer_peso_total = (burguer_fat * burguer_peso * sanduiches_qtd);
        
        
        System.out.println("""
                           Para fazer: %d sanduiches é preciso: 
                                Queijo: %d fatia(s) totalizando %.3fkg,
                                Presunto: %d fatia(s) totalizando %.3fkg,
                                Hamburger: %d fatia(s) totalizando %.3fkg.
                           """
                .formatted(sanduiches_qtd,(queijo_fat*sanduiches_qtd),queijo_peso_total,(presunto_fat*sanduiches_qtd),presunto_peso_total,(burguer_fat*sanduiches_qtd),burguer_peso_total));
    }
    
}
