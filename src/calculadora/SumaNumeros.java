package calculadora;
import java.util.Scanner;
// @author SergiPons
// @version 0.0
public class SumaNumeros {
	public static void main(String[] args) {
			// <h2>Programa Calculadora Basica<h2>
			// <h3> Clase de Suma de Numeros<h2>
		
			Scanner scanner = new Scanner(System.in);
			// <p>Pedimos al usuario que ingrese un numero<p>
			System.out.print("Ingresa el primer número: ");
			int numero1 = scanner.nextInt();
			// <p>Pedimos al usuario que ingrese otro numero<p>
			System.out.print("Ingresa el segundo número: ");
			int numero2 = scanner.nextInt();
			int suma = numero1 + numero2;
			//<p> Imprimimos la suma de los dos numeros introducidos por el usuario<p>
			System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
			
			// Cambio realizado desde rama feature-suma
			// Comentario después de realizar fusión entre ramas
	}
}