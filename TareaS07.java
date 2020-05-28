import java.util.Scanner;
public class Program{
    public static void main(String[] args) {
        int contador, ahorro, cantidad;
        contador = 1;
        ahorro = 0;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("Ingresar el monto mensual");
            cantidad = scan.nextInt();
            
            ahorro = ahorro + cantidad;
            System.out.println("El ahorro del mes " + contador + " es " + cantidad);
            contador++;
        }while(contador<=12);
        System.out.println("El ahorro total es: " + ahorro);
    }
}
