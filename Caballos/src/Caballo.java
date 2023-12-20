public class Caballo {

    public String nombre;
    public boolean vacunado;
    public double longitud;
    public double peso;
    public int edad;

    public Caballo(String nombre, double longitud, double peso, int edad) { // Constructor
        this.nombre = nombre;
        this.vacunado = false;
        this.longitud = longitud;
        this.peso = peso;
        this.edad = edad;
    }

public void comer (){
    System.out.println("Le has dado una manzana para comer a " + nombre);
}

}
