package semestre_2;

public class ContaBancaria {

    private String titular;
    private Double saldo;

    public ContaBancaria(String titular, Double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }


    public void depositar(double valor){
        System.out.println("Depositando "+valor+" reais");
        this.saldo +=valor;
    }

    public void sacar(double valor){
        if (valor > this.saldo){
            System.out.println("Não há saldo suficiente para sacar!");
        }
        else {
            System.out.println("Sacando "+valor+ " reais");
            this.saldo-=valor;
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo da conta do(a) titular "+this.titular+": "+this.saldo);
    }

}
