package ejercicio2;
import java.util.Scanner;
public class Copra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("¿Cuantos productos va a comprar?");
		double cantidad = in.nextInt();
		
		System.out.println("¿Cual es el precio del producto?");
		double precio = in.nextInt();
		
		double total = 0;
		total = cantidad * precio;
		
		double pf = 0;
		if(total >= 50) {	
			pf = total - (0.1 * total);
			System.out.println("Su total a pagar es " + pf);
		}else {	
			pf = total - (0.08 * total);
			System.out.println("Su total a pagar es " + pf);
		}
	}

}
