import java.util.Scanner;
public class Tarea
{
    public static void main(String[] args) {
        int num, i = 0, suma_impar = 0;
	double prom=0,  suma_par = 0, cont_par = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa el numero");
        num = scan.nextInt();
        
        while(i<270){
        	i++;
            if(num%2 == 0){
                suma_par = suma_par + num;
                cont_par++;
            }else{
                suma_impar = suma_impar + num;
            }
            System.out.println("Ingresa el numero");
            num = scan.nextInt();
        }
        prom = suma_par/cont_par;
        System.out.println("La suma de los numeros impares es: " + suma_impar);
        System.out.println("El promedio de los numeros pares es: " + prom);
    }
}
