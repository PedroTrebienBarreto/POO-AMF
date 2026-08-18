import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Paciente marcoMaluco = new Paciente("Marcos", 55123456);
        Paciente josias = new Paciente("Josias", 67458192);


        Consulta consulta1 = new Consulta(marcoMaluco, LocalDate.of(2026, 8, 10), 90.0);
        Consulta consulta2 = new Consulta(josias, LocalDate.now(), 75.0);

        consulta1.exibirComprovante();
        consulta2.exibirComprovante();

        consulta1.remarcar(LocalDate.of(2026, 8, 20));

        consulta1.exibirComprovante();

    }
}
