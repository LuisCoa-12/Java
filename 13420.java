import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sueldo;
        
        System.out.println("Ingrese su sueldo");
        sueldo = scan.nextInt();
        
        if(sueldo<1000){
            sueldo = sueldo + sueldo*0.15;
        }
        System.out.println("Su nuevo sueldo es: " + sueldo);
    }
}
