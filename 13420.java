import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double SUE, AUM;
        
        System.out.println("Ingrese su sueldo");
        SUE = scan.nextInt();
        
        if(sueldo<1000){
            AUM = SUE*0.15; 
            SUE = SUE + AUM;
        }
        System.out.println("Su nuevo sueldo es: " + sueldo);
    }
}
