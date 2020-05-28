public class Encuentro{
    public static void main(String[] args) {
    
        int k1, k2, encuentro;
        k1 = 70;
        k2 = 150;
        do{
            k1+=1;
            k2-=1;
            encuentro = k2 - k1;
        }while(encuentro>0);
        System.out.println("Se encontraran en el kilometro " + k1);
    }
}
