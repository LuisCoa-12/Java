import java.util.Scanner;
public class Fibonacii{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int elementos, a, b, c, i;
        a = 0;
        b = 1;
        c = 1;
        i = 1;

        System.out.println("Ingresa el numero de elementos para la sucesion: ");
        elementos = scan.nextInt();
        do{
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            i++;
        }while(i<=elementos);
    }
}
