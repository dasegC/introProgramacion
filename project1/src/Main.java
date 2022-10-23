public class Main {
    public static void main(String[] args) {
        suma(1,2,3);

        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        System.out.println("Número de puertas: "+miCoche.puertas);

    }
    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a+b+c;
        System.out.println("El resultado de la suma es: "+resultado);
    }

    public static class Coche {
        public int puertas = 0;

        public void AumentarPuertas(){
            this.puertas++;
        }
    }
}
