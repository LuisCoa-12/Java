import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        int n, d1, d2, d3, d4;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa un numero entre 0 y 9999");
        n = scan.nextInt();
        
        if(n<10){
            System.out.println("el numero es: " + n);
        }else{
            if(n<100){
                d1 = n%10;
                d2 = n%100/10;
                System.out.println("El numero es: " + d1 + d2);
            }else{
                if(n<1000){
                    d1 = n%10;
                    d2 = n%100/10;
                    d3 = n%1000/100;
                    System.out.println("El numero es: " + d1 + d2 + d3);
                }else{
                    if(n<10000){
                        d1 = n%10;
                        d2 = n%100/10;
                        d3 = n%1000/100;
                        d4 = n%10000/1000;
                        System.out.println("El numero es: " + d1 + d2 + d3 + d4);
                    }
                }
            }
        }
    }
}
