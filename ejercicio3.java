import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int n = scan.nextInt();
        
        if(n>0){
            System.out.println("El numero es positivo");
        }else{
            if(n<0){
                System.out.println("El numero es negativo");
            }else{
                System.out.println("El numero es neutro");
            }
        }
    }
}
