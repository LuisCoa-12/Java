import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double suma=0 , promedio=0;
        int[] numeros = new int[4];
        
        for(int i = 0; i<4; i++){
            System.out.println("Ingresa un valor");
            numeros[i] = scan.nextInt();
            suma+=numeros[i];
        }
        promedio = suma/4;
        System.out.println("El promedio es: " + promedio);
    }
}
