package Exercicios_I;
import java.util.Scanner;
/* 12. A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa
custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas(juntos), e quanto deve guardar em uma
poupança (10% do arrecadado). Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um programa em
Linguagem Java, para ler as quantidades de pães e de broas, e depois calcular e mostrar os dados solicitados. */
public class Exercicio_012 {
    
    Scanner banana = new Scanner(System.in);
    
    public void getExercicio_012(){
        
        double poupanca, arrecadado;
        int qtd_paes, qtd_broas;
        double preco_pao = 0.12;
        double preco_broa = 1.5;
        
        System.out.print("\nInforme quantos Pães foram vendidos: ");
        qtd_paes = banana.nextInt();
        
        System.out.print("Informe quantAs Broas foram vendidos: ");
        qtd_broas = banana.nextInt();
        banana.close();
        
        arrecadado = ((preco_pao * qtd_paes)+(preco_broa * qtd_broas));
        
        poupanca = (arrecadado * 0.1);
        
        System.out.println("""
                           Foram vendidos um total de: %d Paes a %.2f e %d Broa a %.2f.
                           Tatal arrecadado: %.2f.
                           
                           Considerando a arrecadação na poupaça deve ser guardada: R$ %.3f.
                           
                           """.formatted(qtd_paes, preco_pao, qtd_broas,preco_broa,arrecadado,poupanca));
        
    }
    
    
}
