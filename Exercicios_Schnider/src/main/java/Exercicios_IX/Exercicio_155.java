package Exercicios_IX;
import java.util.Scanner;
/*
Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
     Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
     Realizar uma entrada no estoque e mostrar novamente os dados do produto
     Realizar uma saída no estoque e mostrar novamente os dados do produto.
     Desenvolva, usando a UML (diagrama de classe), eposteriormente na linguagem Java.
*/
public class Exercicio_155 {
    
    Scanner sc = new Scanner(System.in);
    
    public class Produto{
        private String nome;
        private Double preco;
        private int qtd;

        public Produto(String nome, Double preco, int qtd) {
            this.nome = nome;
            this.preco = preco;
            this.qtd = qtd;
        }
        
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Double getPreco() {
            return preco;
        }

        public void setPreco(Double preco) {
            this.preco = preco;
        }

        public int getQtd() {
            return qtd;
        }

        public void setQtd(int qtd) {
            this.qtd = qtd;
        }       
        
    }
    
    Produto[] estoque = new Produto[3];
    
    
    
    
    public void inserirProduto(){
        String n;
        Double p;
        int q   ;
        for (int contador = 0; contador <= estoque.length;contador++){
            if (estoque[contador] == null){
                System.out.print("\nInsira o nome do %d° produto: ".formatted(contador+1));
                n = sc.nextLine();
                System.out.printf("Insira o preço do %d° produto: ".formatted(contador+1));
                p = sc.nextDouble();
                System.out.printf("Insira o quantidade do %d° produto: ".formatted(contador+1));
                q = sc.nextInt();
                sc.nextLine();

                estoque[contador] = new Produto(n,p,q);
                System.out.println("Produto cadastrado com sucesso!");
                listarProduto();
                return;
            }
            else if(contador < (estoque.length - 1)){
                // Não faz nada, alem de deixar o contador aumentar.
                // Se o indece 0 está ocupado, deve vir para essa condição.
                // Se o indice 1 está ocupado, deve vir para essa condição.
                // Se o indice 2 está ocupado, pular essa condição.
                
            }
            else { // Se o contador chegar em 2 
                System.out.println("\nEstoque Cheio, retire um produto antes de inserir outro produto.");
                listarProduto();
                return;
            }   
        }
        listarProduto();
    }
    
    public void listarProduto(){
        boolean vazio = true;
        System.out.println("\nProdutos: \n{");
        for (int contador = 0; contador < estoque.length; contador++){
            if (estoque[contador] != null){
                Produto p =  estoque[contador];
                System.out.print("\t{\n\t\tid: %d,\n\t\tNome: %s,\n\t\tPreço: %.2f,\n\t\tQuantidade: %d\n\t},\n".formatted(contador,p.nome,p.preco,p.qtd));
                vazio = false;
            }
        }
        System.out.println("}\n");
        return;
    }
    
    public void retirarProduto(){
        listarProduto();
        System.out.print("\nDigite o ID do produto que sera removido: ");
        int id = sc.nextInt();
        System.out.print("Digite quantas unidades devem ser removidas: ");
        int subtrair = sc.nextInt();
        sc.nextLine();
        for (int contador = 0; contador <= estoque.length;contador++){
            Produto p = estoque[id];
            if (p.getQtd() >= subtrair){
                p.setQtd(p.getQtd()-subtrair);
                System.out.println("Produto excluido com sucesso!");
                listarProduto();
                return;
            }
            else {
                System.out.println("\nQuantidade insuficiente para retirada, retire menos unidades.");
                return;
            }   
        }
    }
      
    
    
    
    public void getExercicio_155(){
        int opcao;
        do{
            System.out.print("""
                Escolha uma opção:
                1 - Ver estoque.
                2 - Inserir produto.
                3 - Retirar produto.
                0 - Sair.
                : """);
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao){
                case 1:
                    listarProduto();
                    break;

                case 2:
                    inserirProduto();
                    break;
                case 3:
                    retirarProduto();
                    break;
                case 0:
                    System.exit(0);
                    
            }
        }while(opcao != 0);
        sc.close();
    }
 
}