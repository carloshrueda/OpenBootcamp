/*
 * Primera parte:
 * Crear una función con tres parámetros que sean números que se suman entre sí.
 * Llamar a la función en el main y darle valores.
 */

 package IntroduccionProgramacion.Funciones.EjerciciosTema3;

 public class EjercicioTema3 {
   public static void main(String[] args) {
     int num1 = 5;
     int num2 = 10;
     int num3 = 15;
     
     System.out.println("La suma de los tres numeros es: " + suma(num1, num2, num3));
   }

   public static int suma(int num1, int num2, int num3) {
     int res_suma = num1 + num2 + num3;
     return res_suma;
   }
 }

