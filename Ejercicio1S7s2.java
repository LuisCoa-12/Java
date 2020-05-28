import java.util.Scanner;
public class Fibonacii{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int elementos, n1, n2, n3, i;
        n1 = 0;
        n2 = 1;
        n3 = 1;
        i = 1;

        System.out.println("Ingresa el numero de elementos para la sucesion: ");
        elementos = scan.nextInt();
        do{
            System.out.println(n1);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            i++;
        }while(i<=elementos);
    }
}
