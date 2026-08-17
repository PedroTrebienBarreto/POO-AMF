package semestre_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria("Joãozinho", 3200.0);
        ContaBancaria conta2 = new ContaBancaria("Maria",6530.0);

        conta1.depositar();
        conta2.sacar(3530);
        conta2.depositar();
        conta1.aplicarRendimento(0.1);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
