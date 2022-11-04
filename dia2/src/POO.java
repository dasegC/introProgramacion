public class POO {
    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println(coche.numeroPuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);

        Coche coche2 = new Coche(2, 90); //Sobrecarga del constructor
        System.out.println(coche2.numeroPuertas);
        System.out.println(coche2.velocidadMaxima);
        System.out.println(coche2.velocidadActual);
    }
}

class Coche{
    int numeroPuertas;
    int velocidadMaxima;
    float velocidadActual;

    // Constructor en java - NO devuelve ningún tipo de dato
    public Coche(int numeropuertas, int velocidadMaxima){
        this.numeroPuertas = numeropuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Estoy en el constructor con parametros");
    }

    public Coche(){
        numeroPuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor ***Sin nada***");
    }

    //Sobrecarga tipica de funciones
    //public int suma(int a, int b){return a+b}
    //public float suma(float a, float b){return a+b}

    public void acelerar(){
        velocidadActual +=15;
    }
    public void decelerar(){}
}