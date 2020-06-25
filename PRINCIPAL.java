public class Principal{
public static void main(String[] args) {
        Humano realizar = new Humano();
        realizar.altura = 1.85;
        realizar.genero = "masculino";
        realizar.edad = 18;
        realizar.caracter = "Flematico";
        System.out.println(realizar.altura);
        System.out.println(realizar.genero);
        System.out.println(realizar.edad);
        System.out.println(realizar.caracter);
        System.out.println(realizar.mensaje);
        realizar.hablar();
        realizar.correr();
        realizar.comer();
        
        Arbol pino = new Arbol();
        System.out.println(pino.tipo);
        pino.crecer();
        System.out.println(pino.cantidadHojas);
        System.out.println(pino.antiguedad);
        System.out.println(pino.altura);
        pino.crearHojas();
        pino.fotosintesis();
    }
}