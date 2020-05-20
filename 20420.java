import java.util.Scanner;
public class Whileb
{
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa el numero");
        num = scan.nextInt();
        
        while(num != 0){
            if (num>0)
            System.out.println("El numero es positivo");
            else
            System.out.println("El numero es negativo");
            System.out.println("Ingresa otro numero");
            num = scan.nextInt();
        }
    }
}
