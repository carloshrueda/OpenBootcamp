/*
 * Segunda parte:
 * Crear una clase coche.
 * Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
 * Una función que incremente el número de puertas que tiene el coche.
 * Crear un objeto miCoche en el fin y añadirle una puerta.
 * Mostrar el número de puertas que tiene el objeto.
 */

package IntroduccionProgramacion.Funciones.EjerciciosTema3;

public class Coche {
    private int num_puertas;
    
    public Coche() {
        num_puertas = 0;
    }
    
    public void añadirPuerta() {
        num_puertas++;
    }
    
    public void mostrarPuertas() {
        System.out.println("El coche tiene: " + num_puertas + " puertas");
    }
    
    public static void main(String[] args) {
        Coche miCoche = new Coche();

        miCoche.añadirPuerta();
        miCoche.mostrarPuertas();
    }
}
