import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, num;
        
        System.out.println("Ingresa un numero");
        num = scan.nextInt();
        
        for(i = 1; num>0; i++){
            System.out.println("Ingresa otro numero");
            num = scan.nextInt();
        }
        System.out.println("Se introdujeron "+ i + " numeros.");
    }
}
