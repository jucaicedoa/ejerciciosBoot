package ejercicioTema3IntroProgramacion;

public class main {

    int sum = 0;

    public static void main(String[] args) {
        int sum;
        int a = 10;
        int b = 20;
        int c = 40;
        sum = suma.suma(a, b, c);
        System.out.println("La suma de las variables " + a + "+" + b + "+" + c + " es : " + sum);

        coche coche_prueba = new coche("BMW", 4);
        System.out.println("El numero de puertas que originalmente tiene el coche : " + coche_prueba.numeroPuertas);
        int result = coche_prueba.sumarPuerta(1);
        System.out.println("El numero de puertas que ahora tiene el coche son : " + result);
    }

}
