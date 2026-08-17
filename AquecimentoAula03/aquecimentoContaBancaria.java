package semestre_2;

import java.util.Scanner;

public class ContaBancaria {

    private String titular;
    private Double saldo;
    private Integer operacoes;

    public ContaBancaria(String titular, Double saldo){
        this.titular = titular;
        this.saldo = saldo;
        this.operacoes = 0;
    }


    public void depositar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor a ser depositado: ");
        double valor = sc.nextDouble();

        while (valor <= 0){
            System.out.println("O valor a ser depositado deve ser maior do que zero");
            System.out.print("Informe o valor a ser depositado: ");
        }
        this.operacoes+=1;
        System.out.println("Depositando "+valor+" reais");
        this.saldo +=valor;
    }

    public void sacar(double valor){
        if (valor+0.5 > this.saldo){
            System.out.println("Não há saldo suficiente para sacar!");
        }
        else {
            this.operacoes+=1;
            System.out.println("Sacando "+valor+ " reais");
            System.out.println("Subtraindo do saldo a taxa de R$0,5");
            this.saldo-=valor+0.5;
        }
    }

    public void aplicarRendimento(Double percentual){
        if (percentual > 1 || percentual < 0){
            System.out.println("Cancelando a operação! Percentual Inválido");
        }
        else {
            this.operacoes+=1;
            this.saldo+= percentual*this.saldo;
        }

    }

    public void exibirSaldo(){

        System.out.println("Saldo da conta do(a) titular "+this.titular+": "+this.saldo);
        System.out.println("Total de operações feitas na conta: "+ this.operacoes);
    }

}
