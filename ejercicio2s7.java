import java.util.Scanner;
public class Suma{
    public static void main(String[] args) {
        
        int num, suma, cantidad, i;
        suma = 0;
        i = 1;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de numeros que se van a sumar");
        cantidad = scan.nextInt();
        
        do{
            System.out.println("Ingresa el numero " + i);
            num = scan.nextInt();
            suma+=num;
            i++;
        }
        while(i<=cantidad);
        System.out.println("La suma de los numeros es: " + suma);
    }
}
