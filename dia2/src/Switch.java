public class Switch {
    public static void main(String[] args) {
        var estacion = "VERANO";
        switch (estacion){
            case "VERANO":
                System.out.println("La estación es Verano");
                break;
            case "INVIERNO":
                System.out.println("La estación es Invierno");
                break;
            case "OTOÑO":
                System.out.println("La estación es Otoño");
                break;
            case "PRIMAVERA":
                System.out.println("La estación es Primavera");
                break;
            default:
                System.out.println("No es una estación del año");
        }
    }
}
