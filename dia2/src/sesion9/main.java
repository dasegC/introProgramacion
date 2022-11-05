package sesion9;

public class main {

    public static void main(String[] args) {
        //HERENCIA
        /*CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.velocidadMaxima = 14;
        cocheElectrico.matricula = "ABC 1234ES";

        System.out.println(cocheElectrico.compruebaMatricula("XGXX"));
        */

        // Creo una instancia - ABSTRACCION
        /*Coche coche = new Coche();
        coche.setSonido("BRRR");
        System.out.println(coche.getSonido());*/

        //HERENCIA MULTIPLE
        //NO s epuede hacer herencia multiple, actualizar jdk o buscar solucion en google
        // POLIMORFISMO
        /*Coche coche = new Coche();
        coche.sumaNumeros(3,5);
        coche.sumaNumeros((float) 3,(float) 5);
        coche.sumaNumeros(3.5,5.2);
        */

        //INTERFACES
    }
}


    /*static class Vehiculo{
        int velocidadMaxima;
        String matricula;
        public boolean compruebaMatricula(String matricula){
         if (matricula == "XXX"){
             return true;
         }
         return false;
        }
    }*/

    /*static class Coche extends Vehiculo{}
    static final class CocheElectrico extends Coche{} //Agrego final para que no se herede de esta clase
    */
//static class Monopatin extends CocheElectrico{}; Marca error porque no puede heredar de class CocheELectrico

// ABSTRACCION
/*
abstract class Vehiculo {
    int velocidadMaxima;
    String matricula;
    String sonido;


    //Declaro constructor
    public Vehiculo(){
        System.out.println("Estoy en el constructor de Vehiculo");
    }

    abstract public String getSonido();

    abstract public void setSonido(String sonido);


}
class Coche extends Vehiculo {
    public String getSonido(){
        return "Soy un supersonido: " + this.sonido;

    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}
class Moto extends Vehiculo {
    public String getSonido(){
        return "Soy un sonidillo de moto: " + this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}

*/

//HERENCIA MULTOPLE - HIBRIDA

/*
class Vehiculo { //Creacion Clase
    int velocidadMaxima;

    public Vehiculo(){  //Constructor
        System.out.println("Estoy en el constructor Vehiculo");
    }
}

class Motor {
    String tipoMotor;
    public Motor(){
        System.out.println("Estoy en el constructor de Motor");
    }
}

class Coche extends Vehiculo,Motor {

}

// HERENCIA HIBRIDA FORMA UN ROMBO CLASE PADRE A, CLASE HIJA B Y C HEREDAN DE A Y CLASE DE HEREDA DE B Y C

 */

//POLIMORFISMO : Modifica una función heredada
/*class Vehiculo { //Creacion Clase

    public void diHola(){
        System.out.println("Hola!!!!");}
}

class Coche extends Vehiculo {
    public void diHola(){
        System.out.println("Soy un coche");
    }
    public int sumaNumeros(int a, int b){
        System.out.println("Soy el suma numeros de INT");
        return a + b;
    }
    public float sumaNumeros(float a, float b){
        System.out.println("Soy el suma numeros de FLOAT");
        return a + b * (float)9.0;
    }
    public void sumaNumeros(double a, double b){
        System.out.println("Soy el suma numeros de DOUBLE");
        System.out.println("El resultado es: " + (a + b));
    }
}*/


//INTERFACES --> TENGO QUE IMPLEMENTAR LOS METODOS QUE ESA INTERFACE ME PIDE

interface Vehiculo {
    void Acelerar(int cuantaVelocidad);
    void Frenar (int cuantaVelocidad);
}

class Coche implements Vehiculo{
    public void Acelerar(int cuantaVelocidad){

    }
    public void Frenar(int cuantaVelocidad) {

    }
}