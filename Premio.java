
public class Premio extends ElementoSorteable {

    private String nombre;
    private double valor;

    public Premio(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    @Override
    public String obtenerRepresentacion() {
        return "Premio: " + nombre + ", valor: $" + valor;
    }

}
