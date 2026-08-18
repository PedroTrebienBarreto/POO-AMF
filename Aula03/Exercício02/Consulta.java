import java.time.LocalDate;
public class Consulta {

    private Paciente paciente;
    private LocalDate date;
    private Double price;

    public Consulta(Paciente paciente, LocalDate date, Double price){
        this.paciente = paciente;
        this.date = date;
        this.price = price;
    }

    public void exibirComprovante(){
        System.out.println("===================");
        System.out.println("Paciente: "+paciente.getName());
        System.out.println("Data da consulta: "+this.date);
        System.out.println("Preço da consulta: "+this.price);
    }

    public void remarcar(LocalDate newDate){
        this.date = newDate;
    }
}
