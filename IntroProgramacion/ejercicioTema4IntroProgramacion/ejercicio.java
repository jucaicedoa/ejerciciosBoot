package ejercicioTema4IntroProgramacion;

/**
 * Usando un if, crear una condición que compare si la variable numeroIf es
 * positivo, negativo, o 0. Pista: Los números inferiores a 0 son negativos y
 * los superiores, positivos.
 *
 * Crea un bucle While, este bucle tendrá que tener como condición que la
 * variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
 * bucle deberá:
 *
 * Incrementar el valor de la variable en uno cada vez que se ejecute.
 *
 * Mostrarlo por pantalla cada vez que se ejecute.
 *
 * Para el bucle Do While, deberás crear la misma estructura que en el While,
 * pero solo se debe ejecutar una vez.
 *
 * Para el bucle For, crea una variable numeroFor, esta variable tendrá como
 * valor 0 y su condición será que la variable sea igual o menor que 3, se irá
 * incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
 * pantalla.
 *
 * Por último, para el Switch, deberás crear la variable estacion, y distintos
 * case para las cuatro estaciones del año. Dependiendo del valor de la variable
 * estacion se deberá mandar un mensaje por consola informando de la estación en
 * la que está. También habrá que poner un default para cuando el valor de la
 * variable no sea una estación.
 *
 */
public class ejercicio {

    public static void condicion(int numero) {
        System.out.println("CONDICIONAL");
        if (numero < 0) {
            System.out.println("Numero Negativo");
        } else if (numero < 0) {
            System.out.println("Numero Positivo");
        } else {
            System.out.println("Numero es O");
        }
    }

    public static void cicloWhile() {
        int numeroWhile = 0;
        System.out.println("BUCLE WHILE");
        while (numeroWhile < 3) {

            System.out.println("El valor de número actual: " + numeroWhile);
            numeroWhile++;

        }
    }

    public static void cicloDoWhile() {
        int numeroDoWhile = 0;
        System.out.println("BUCLE DOWHILE");
        do {
            numeroDoWhile++;
            System.out.println("El valor de número actual: " + numeroDoWhile);

        } while (numeroDoWhile < 1);

    }

    public static void cicloFor() {

        int numeroFor = 0;
        System.out.println("BUCLE FOR");
        for (int i = 0; i <= 3; i++) {
            System.out.println("El valor de número actual: " + numeroFor);
            numeroFor++;
        }
    }

    public static void ejemploSwitch() {

        String estacion = "VERANO";
        System.out.println("SWITCH");
        switch (estacion) {
            case "VERANO" ->
                System.out.println("Actualmente es VERANO");
            case "INVIERNO" ->
                System.out.println("Actualmente es INVIERNO");
            case "OTOÑO" ->
                System.out.println("Actualmente es OTOÑO");
            case "PRIMAVERA" ->
                System.out.println("Actualmente es PRIMAVERA");
            default->
             System.out.println("No es una estación");

        }

    }

    public static void main(String[] args) {
        ejercicio.condicion(0);
        ejercicio.cicloWhile();
        ejercicio.cicloDoWhile();
        ejercicio.cicloFor();
        ejercicio.ejemploSwitch();
    }

}
