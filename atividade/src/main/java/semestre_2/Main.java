package semestre_2;

public class Main {
    public static void main(String[] args) {
/**
        Filme BandOfBrothers = new Filme("Band of Brothers", 125, 9.8);
        Filme JamesBond007 = new Filme("007", 107, 9.3);
        Filme RealSteel = new Filme("Real Steel", 96, 9.7);

        BandOfBrothers.exibirFicha();
        JamesBond007.exibirFicha();
        RealSteel.exibirFicha();

        RealSteel.marcarAssistido();
        JamesBond007.avaliar();

        JamesBond007.exibirFicha();


        Produto detergente = new Produto("Detergente", 3.50, 100);
        Produto bolaDeGude = new Produto("Bolinha de gude", 0.25, 1220);
        Produto enxada = new Produto("Enxada", 17.0, 8);

        detergente.exibirInfo();
        bolaDeGude.exibirInfo();
        enxada.exibirInfo();

        enxada.vender();

 **/

        ContaBancaria conta1 = new ContaBancaria("Joãozinho", 3200.0);
        ContaBancaria conta2 = new ContaBancaria("Maria",6530.0);

        conta1.depositar(800);
        conta2.sacar(3530);

        conta1.exibirSaldo();
        conta2.exibirSaldo();





    }
}