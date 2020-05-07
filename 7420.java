import java.util.Scanner;
public class Ejercicio
{
    public static void main(String[] args) {
        
        int n;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce el numero entre 0 y 9999");
        n = scan.nextInt();
        
        if(n<10){
            System.out.println("El numero tiene 1 cifra");
        }else{
            if(n<100){
                System.out.println("El numero tiene 2 cifra");
            }else{
                if(n<1000){
                    System.out.println("El numero  tiene 3 cifra");
                }else{
                    if(n<10000){
                        System.out.println("El numero tiene 4 cifra");
                    }else{
                        if(n<100000){
                            System.out.println("El numero tiene 5 cifras");
                        }
                    }
                }
            }
        }
    }
}
