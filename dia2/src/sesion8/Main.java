package sesion8;

import java.util.concurrent.TransferQueue;

public class Main {

    public static void main(String[] args) {
        /*
        Vehiculo coche = new Vehiculo();
        coche.setTipo("Cochecito mio"); //Cambiar el valor de la propiedad privada tipo

        coche.setVelocidadMaxima(120);
        coche.setRapido(true);*/
        //String tipo = vehiculo.getTipo();
        //System.out.println(tipo);
        /*
        vehiculo.tipo = "Coche";
        System.out.println(vehiculo.tipo);
        */

        /*Vehiculo moto = new Vehiculo();
        moto.setTipo("Motomami");
        moto.setVelocidadMaxima(50);
        moto.setRapido(false);

        System.out.println(coche.getTipo());
        System.out.println(coche.getVelocidadMaxima());
        System.out.println(coche.isRapido());
        System.out.println(moto.getTipo()+ " " + moto.getVelocidadMaxima());
        System.out.println(moto.isRapido());
        //System.out.println(moto.getVelocidadMaxima());
*/

    }
}

abstract class Vehiculo{
    private String tipo;
    private int velocidadMaxima;
    private String sonido;

    //SETTER
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    /*public void setRapido(boolean rapido){
        this.rapido = rapido;
    }*/
    abstract public void setSonido(String sonido); //NO tienen body

    //GETTER
    public String getTipo(){
        return this.tipo;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }

    //Getters para booleanos se establece asi por convencion
    /*public boolean isRapido(){
        return this.rapido;
    }*/

    abstract public String getSonido(); //NO tienen body
}