import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Cliente roberto = new Cliente("Roberto", "roberto@gmail.com");
        Cliente daniel = new Cliente("Daniel", "daniel@outlook.com");

        Produto polvora = new Produto("Pólvora 1 kg", 150.0);
        Produto acidoClorodrico = new Produto("Ácido Clorídrico 500ml", 99.90);

        Pedido pedido1 = new Pedido(roberto, polvora, 50);
        Pedido pedido2 = new Pedido(daniel, acidoClorodrico, 12);

        Double total1 = pedido1.aplicarDesconto(0.15);
        Double total2 = pedido2.aplicarDesconto(0.1);
        pedido1.resumo(total1);
        pedido2.resumo(total2);

    }

}
