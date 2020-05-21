import java.util.Scanner;
public class Reto
{
    public static void main(String[] args) {
        int num, i = 1, sumimp = 0;
	      double prom=0,  sumpar = 0, contpar = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa el numero");
        num = scan.nextInt();
        
        while(i<=270){
            System.out.println("Ingresa el numero");
            num = scan.nextInt();
            if(num!=0){
                if(Math.pow(-1, num)>0){
                    sumpar = sumpar + num;
                    contpar++;
                }else{
                    sumpar = sumimp + num;
                }
            }
            i++;
        }
        prom = sumpar/contpar;
        System.out.println("La suma de los numeros impares es: " + sumimp);
        System.out.println("El promedio de los numeros pares es: " + prom);
    }
}
