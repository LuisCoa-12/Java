import java.util.Scanner;

public class Program{

    public static void main(String[] args) {
    
        int num, sum;
        a = 0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Ingrese un numero");
            num = scan.nextInt();
            sum+=num;
        }
        while(num!=0);
        System.out.println("La suma es: " + sum);
    }
}
