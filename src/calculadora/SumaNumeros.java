package calculadora;
import java.util.Scanner;

public class SumaNumeros {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			// Pedimos al usuario que ingrese un numero
			System.out.print("Ingresa el primer número: ");
			int numero1 = scanner.nextInt();
			// Pedimos al usuario que ingrese otro numero
			System.out.print("Ingresa el segundo número: ");
			int numero2 = scanner.nextInt();
			int suma = numero1 + numero2;
			// Imprimimos la suma de los dos numeros introducidos por el usuario
			System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
	}
}