public class Pedido {

    private Cliente cliente;
    private Produto produto;
    private Integer quantity;

    public Pedido(Cliente cliente, Produto produto, Integer quantity) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantity = quantity;
    }

    public void resumo(Double totalAPagar){
        System.out.println("=======================");
        System.out.println("Nome do cliente: "+cliente.getName());
        System.out.println("Produto comprado: "+produto.getName());
        System.out.println("Quantidade comprada: "+quantity);
        System.out.printf("TOTAL A PAGAR: %.2f \n", totalAPagar);
        System.out.println("=======================");
    }



    public Double aplicarDesconto(Double percentual){
        Double totalAPagar = produto.getPrice()*this.quantity;
        if (percentual > 0 && percentual < 1){
            Double totalFinal = totalAPagar - totalAPagar*percentual;
            return totalFinal;
        }
        else {
            return totalAPagar;
        }
    }
}
