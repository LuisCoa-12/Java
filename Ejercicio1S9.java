import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double suma, promedio;
        suma = 0;
        promedio = 0;
        int[] numeros = new int[4];
        
        System.out.println("Ingresa un valor");
        numeros[0] = scan.nextInt();
        
        System.out.println("Ingresa un valor");
        numeros[1] = scan.nextInt();
        
        System.out.println("Ingresa un valor");
        numeros[2] = scan.nextInt();
        
        System.out.println("Ingresa un valor");
        numeros[3] = scan.nextInt();
        for(int i:numeros){
            suma+=i;
        }
        promedio = suma/4;
        System.out.println("El promedio es: " + promedio);
    }
}
