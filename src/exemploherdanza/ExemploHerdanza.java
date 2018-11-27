package exemploherdanza;

public class ExemploHerdanza {

    public static void main(String[] args) {
    Empregado obx1 = new Empregado();
    Secretaria obx2 = new Secretaria();
    System.out.println(obx1.toString());
        System.out.println("empregado : "+ obx1.calcularSoldo("pepe"));
        System.out.println("secretaria: " + obx2.calcularSoldo("marta"));
        
    
    }
    
}
