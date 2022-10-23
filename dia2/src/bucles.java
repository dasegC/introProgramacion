import javax.swing.plaf.synth.SynthOptionPaneUI;

public class bucles {
    public static void main(String[] args) {
        int contador = 10, contador2=10;
        int valores[] = {10,20,30,40,50};
        var estacion = "VERANO";
        var hoy_es = "MARTES";


        while (contador > 0){
            System.out.println("Contador vale: " + contador);
            contador-=1;
        }

        // Do while

        do {
            System.out.println("Usando DO WHILE ---> "+contador2);
            contador2-=1;
        } while (contador2 > 10);
        
        // For

        for (int contador3 = 1; contador3 <= 10 ; contador3++) {
            System.out.println("Contador 3: "+contador3);
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        switch (estacion){
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            default:
                System.out.println(estacion);
        }

        switch (hoy_es){
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("hoy es laborable");
                break;
            case "SABADO":
            case "DOMINGO":
                System.out.println("hoy NO es laborable");
        }
    }
}