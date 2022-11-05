package ejercicios_sesion9;

public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 36;
        cliente.nombre = "Daro GMNZ";
        cliente.telefono = 1169695436;
        cliente.credito = 47731.66;

        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono + " y mi credito disponible es " + cliente.credito + "€");

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Jose";
        trabajador.edad = 42;
        trabajador.telefono = 582910244;
        trabajador.salario = 2000.32;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "€");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}
