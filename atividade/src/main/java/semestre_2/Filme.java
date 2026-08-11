package semestre_2;

import java.util.Scanner;

public class Filme {

    private String titulo;
    private Integer duracao;
    private Double nota;
    private Boolean assistido;

    public Filme(){

    }
    public Filme(String titulo, Integer duracao, Double nota){
        this.titulo = titulo;
        this.duracao = duracao;
        this.nota = nota;
        this.assistido = false;
    }

    public void exibirFicha(){
        System.out.println("Título: "+this.titulo);
        System.out.println("Duração do filme: "+this.duracao + " minutos");
        System.out.println("Nota: "+ this.nota);
    }

    public void avaliar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a nova nota do filme: ");
        double novaNota = sc.nextDouble();
        while (novaNota > 10 || novaNota < 0){
            System.out.print("Informe a nova nota do filme: ");
            novaNota = sc.nextDouble();
        }
        sc.close();
        this.nota = novaNota;
    }

    public void marcarAssistido(){
        this.assistido = true;
    }

}
