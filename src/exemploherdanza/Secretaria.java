package exemploherdanza;

import java.time.LocalDate;

public class Secretaria extends Empregado {
    
    private String telefonoMovil;

    public Secretaria() {
        super();
        this.telefonoMovil = telefonoMovil;
    }

    public Secretaria(String telefonoMovil, String nome, LocalDate inicioTraballo, LocalDate dataNacemento, String titulacion) {
        super(nome, inicioTraballo, dataNacemento, titulacion);
        this.telefonoMovil = telefonoMovil;
    }

    @Override
    public String toString() {
        return "Secretaria{" + "telefonoMovil=" + telefonoMovil + '}';
    }
    
    @Override
    public float calcularSoldo(String aaa){
        return 40f;
    }
    
    public float calcularSoldo(){
        return  70f + super.calcularSoldo("pepe");
    }
    
    
}
