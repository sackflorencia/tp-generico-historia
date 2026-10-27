
public class Participante extends ElementoSorteable {

    private String nombre;
    private int edad;

    public Participante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String obtenerRepresentacion() {
        return "Participante: " + nombre + ", edad: " + edad;
    }

}
