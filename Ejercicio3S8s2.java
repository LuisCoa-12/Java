public class Fibonacii{
    public static void main(String[] args) {
        int n1, n2, n3, i;
        n1 = 0;
        n2 = 1;
        n3 = 1;
    
        for(i = 1; i<180; i++){ 
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3; 
        }
        System.out.println("El termino 180 es: " + n1);
    }
}
