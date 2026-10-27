public class Entrada extends ElementoSorteable {

    private String evento;
    private int numero;

    public Entrada(String evento, int numero) {
        this.evento = evento;
        this.numero = numero;
    }

    @Override
    public String obtenerRepresentacion() {
        return "Entrada al evento: " + evento + ", número: " + numero;
    }

}