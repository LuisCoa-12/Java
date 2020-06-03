import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sueldo, i, sueldomax;
        sueldomax = 0;
        
        System.out.println("Ingrese un numero");
        n = scan.nextInt();
        
        for(i = 1; i<=n; i++){
            System.out.println("Ingresa el sueldo");
            sueldo = scan.nextInt();
            if(sueldo>=sueldomax){
                sueldomax = sueldo;
            }
        }
        System.out.println("El sueldo maximo es: " + sueldomax);
    }
}
