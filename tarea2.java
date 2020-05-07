import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        int n, inv, nf;
        Scanner scan = new Scanner(System.in);
        
        nf = 0;
        
        System.out.println("Ingresa un numero entre 0 y 9999");
        n = scan.nextInt();
        
        if(n>0 && n<9999){
            do{
            
            inv = n%10;
            nf = nf*10 + inv;
            n = n/10;
            
            }while(n>0);
            
            System.out.println("El numero es: " + nf);
        }else{
            System.out.println("El numero no se encuentra entre los valores permitidos");
        }
    }
}
