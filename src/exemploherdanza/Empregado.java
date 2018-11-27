package exemploherdanza;


import java.time.LocalDate;
import javax.swing.JOptionPane;


public class Empregado {
    
    private String nome = "pepe";
    private LocalDate inicioTraballo = LocalDate.of(2015, 11, 30);
    private LocalDate dataNacemento = LocalDate.of(1993, 4, 4);
    private String titulacion = "oficinista";
    
    public Empregado() {
    }

    public Empregado(String nome, LocalDate inicioTraballo, LocalDate dataNacemento, String titulacion) {
        this.nome = nome;
        this.inicioTraballo = inicioTraballo;
        this.dataNacemento = dataNacemento;
        this.titulacion = titulacion;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getInicioTraballo() {
        return inicioTraballo;
    }

    public void setInicioTraballo(LocalDate inicioTraballo) {
        this.inicioTraballo = inicioTraballo;
    }

    public LocalDate getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(LocalDate dataNacemento) {
        this.dataNacemento = dataNacemento;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", inicioTraballo=" + inicioTraballo + ", dataNacemento=" + dataNacemento + ", titulacion=" + titulacion + '}';
    }
      
    public float calcularSoldo(String nome){
        return 20f;
    }
    
}
