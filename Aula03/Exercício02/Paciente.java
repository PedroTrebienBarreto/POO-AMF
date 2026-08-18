public class Paciente {

    private String name;
    private Integer telephone;


    public Paciente(String name, Integer telephone){
        this.name = name;
        this.telephone = telephone;
    }

    public String getName(){
        return this.name;
    }
}
