import java.util.Scanner;

public class Añobis {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);


		System.out.print("Introduzca el año a validar \n");
		double año = lector.nextDouble();

		double bis1 = (año % 400);
		double bis2 = (año % 4);
		double bis3 = (año % 100);

		double cer = 0;


		if (bis1 == cer) {
			System.out.print("El año introducido es bisiesto \n");
		} else if (bis3 == cer) {
			System.out.print("El año introducido no es bisiesto \n ");
		} else if (bis2 == cer) {
			System.out.print("El año introducido es bisiseto \n ");
		}
	}
}



