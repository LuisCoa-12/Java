import java.util.Scanner;
public class Program{
    public static void main(String[] args) {
        
        int n[] = new int[4];
        ///acumulador
        n[0] = 0;
        ///contador
        n[1] = 1;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de numeros que se van a sumar");
        ///cantidad
        n[2] = scan.nextInt();
        
        do{
            System.out.println("Ingresa el numero " + n[1]);
            ///numero
            n[3] = scan.nextInt();
            n[0]+=n[3];
            n[1]++;
        }
        while(n[1]<=n[2]);
        System.out.println("La suma de los numeros es: " + n[0]);
    }
}
