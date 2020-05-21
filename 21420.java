public class Program
{
    public static void main(String[] args) {
        int num;
        
        num = 1;
        
        while(num<10){
            System.out.println(num);
            num+=2;
            if(num==7)
                num+=2;
        }
    }
}
