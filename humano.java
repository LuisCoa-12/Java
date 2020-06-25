public class Humano{
	
    double altura;
    String genero;
    int edad;
    String caracter;
    String mensaje
    void hablar(){
        System.out.println("humano hablando");
    }
    void correr(){
        System.out.println("humano corriendo");
    }
    void comer(){
        System.out.println("humano comiendo");
    }
    Humano(){
        this.mensaje = "Soy humano";
    }
}