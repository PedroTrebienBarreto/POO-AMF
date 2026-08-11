import java.util.Scanner;

public class Produto {

    private String nome;
    private Double preco;
    private Integer estoque;

    public Produto(){
    }
    public Produto(String nome, Double preco, Integer estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void exibirInfo(){
        System.out.println("Produto: "+this.nome);
        System.out.println("Preço: "+this.preco);
    }

    public void vender(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade a ser vendida: ");
        int quantidade = sc.nextInt();
        while (quantidade > this.estoque){
            System.out.println("A quantidade a ser vendida não pode exceder o estoque!");
            System.out.print("Informe a quantidade a ser vendida: ");
            quantidade = sc.nextInt();
        }
        while (quantidade <= 0){
            System.out.println("A quantidade a ser vendida não pode ser negativa ou nula");
            System.out.print("Informe a quantidade a ser vendida: ");
            quantidade = sc.nextInt();
        }
        sc.close();
        this.estoque -= quantidade;
    }

}
