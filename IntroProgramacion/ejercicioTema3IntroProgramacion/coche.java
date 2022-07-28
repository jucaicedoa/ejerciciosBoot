package ejercicioTema3IntroProgramacion;

public class coche {

    String marca;
    int numeroPuertas;

    public coche(String marca, int numeroPuertas) {
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
    }

    public int sumarPuerta(int agregar) {
        this.numeroPuertas += agregar;
        return (this.numeroPuertas);
    }

}
