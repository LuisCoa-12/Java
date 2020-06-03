import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, c1, c2, c3, i, u, total;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        
        System.out.println("Ingrese el numero de ventas");
        n = scan.nextInt();
        
        for(i = 1; i<=n; i++){
            System.out.println("Ingresa el costo de lo vendido");
            u = scan.nextInt();
            if(u>1000)
                c1 = c1 + u;
            else if(u>500 && u<=1000)
                c2 = c2 + u;
            else
                c3 = c3 + u;
        }
        total = c1 + c2 + c3;
        System.out.println("En la categoria 1 se obtuvo " + c1);
        System.out.println("En la categoria 2 se obtuvo " + c2);
        System.out.println("En la categoria 3 se obtuvo " + c3);
        System.out.println("El monto total es " + total);
    }
}
