import java.util.Scanner;
public class Fibonacii{
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    int terminos, a, b, c, i;
    a = 0;
    b = 1;
    c = 1;
    i = 1;
    
    System.out.println("Ingresa el numero de terminos para la suma: ");
    terminos = in.nextInt();
    do{
        System.out.print(a + ", ");
        c = a + b;
        a = b;
        b = c;
        i++;
    }while(i<=terminos);
    }
}
