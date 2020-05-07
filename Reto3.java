import java.util.Scanner;
public class Program
{
    static int clave;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa la clave");
        clave = scan.nextInt();
        
        switch(clave){
            case 12 : 
            System.out.println("La zona es America del Norte y el precio es 2");
            break;
            
            case 15 : 
            System.out.println("La zona es America Central y el precio es 2.2");
            break;
            
            case 18 : 
            System.out.println("La zona es America del Sur y el precio es 4.5");
            break;
            
            case 19 : 
            System.out.println("La zona es Europa y el precio es 3.5");
            break;
            
            case 23 : 
            System.out.println("La zona es Asia y el precio es 6");
            break;
            
            case 25 : 
            System.out.println("La zona es Africa y el precio es 6");
            break;
            
            case 29 : 
            System.out.println("La zona es Oceania y el precio es 5");
            break;
            
            default:
            System.out.println("La clave no existe");
        }
    }
}
