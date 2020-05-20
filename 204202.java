import java.util.Scanner;
public class Negativo
{
    public static void main(String[] args) {
        int num, i = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa el numero");
        num = scan.nextInt();
        
        while(num > 0){
            i++;
            System.out.println("Ingresa otro numero");
            num = scan.nextInt();
        }
        System.out.println("Se ingresaron " + i + " numeros");
    }
}
