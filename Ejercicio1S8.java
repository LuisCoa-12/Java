import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, i, j;
        
        System.out.println("Ingrese el primer numero");
        num1 = scan.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        num2 = scan.nextInt();
        
        for(i = num1; i<=num2; i++){
            for(j = 1; j<=12; j++){
                System.out.println(i+" x "+j+" = "+i*j);
            }
            System.out.println();
        }
    }
}
