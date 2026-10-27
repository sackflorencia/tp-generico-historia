
public class Main {

    public static void main(String[] args) {

        Urna<ElementoSorteable> urna = new Urna<>();

        Participante participante = new Participante("Juan", 18);
        Premio premio = new Premio("Auriculares", 50000);
        Entrada entrada = new Entrada("Concierto", 25);

        urna.agregar(participante);
        urna.agregar(premio);
        urna.agregar(entrada);

        System.out.println("Cantidad de elementos: " + urna.cantidad());

        while (!urna.estaVacia()) {
            ElementoSorteable elemento = urna.extraer();

            System.out.println("Salió sorteado: " + elemento.obtenerRepresentacion());
            System.out.println("Quedan: " + urna.cantidad());
            System.out.println();
        }

        System.out.println("¿La urna está vacía? " + urna.estaVacia());

        try {
            urna.extraer();
        } catch (IllegalStateException e) {
            System.out.println("Error al sortear: " + e.getMessage());
        }

    }

}
