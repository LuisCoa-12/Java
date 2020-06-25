public class Arbol{
    
    int cantidadHojas;
    String tipo;
    int antiguedad;
    int altura;
    
    void crecer(){
        System.out.println("crece el arbol");
    }
    void crearHojas(){
        System.out.println("crecen hojas");
    }
    void fotosintesis(){
        System.out.println("fotosintesis");
    }
    Arbol(){
        this.cantidadHojas = 10;
        this.tipo = "pino";
        this.antiguedad = 5;
        this.altura = 15;
    }
}