import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println("Ingrese el numero del mes");
        num = scan.nextInt();
        System.out.println("El mes es " + meses[num-1]);
    }
}
