import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        double CATE, SUE;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la categoria")
        CATE = scan.nextInt();
        
        System.out.println("Ingrese el sueldo");
        SUE = scan.nextInt();
        
        switch(CATE){
            case 1:
            SUE = SUE*1.15;
            System.out.println("Su categoria es 1 y su sueldo es " + SUE)
            break;
            
            case 2:
            SUE = SUE*1.1;
            System.out.println("Su categoria es 2 y su sueldo es " + SUE)
            break;
            
            case 3:
            SUE = SUE*1.08;
            System.out.println("Su categoria es 3 y su sueldo es " + SUE)
            break;
            
            case 4:
            SUE = SUE*1.07;
            System.out.println("Su categoria es 4 y su sueldo es " + SUE)
            break;
        }
    }
}
