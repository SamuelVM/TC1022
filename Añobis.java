import java.util.Scanner;

public class A�obis {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);


		System.out.print("Introduzca el a�o a validar \n");
		double a�o = lector.nextDouble();

		double bis1 = (a�o % 400);
		double bis2 = (a�o % 4);
		double bis3 = (a�o % 100);

		double cer = 0;


		if (bis1 == cer) {
			System.out.print("El a�o introducido es bisiesto \n");
		} else if (bis3 == cer) {
			System.out.print("El a�o introducido no es bisiesto \n ");
		} else if (bis2 == cer) {
			System.out.print("El a�o introducido es bisiseto \n ");
		}
	}
}



