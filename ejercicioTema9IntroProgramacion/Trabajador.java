package ejercicioTema9IntroProgramacion;

public class Trabajador extends Persona {

    private float salario;

    public Trabajador(int edad, String nombre, String telefono, float salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public void getInfo() {
        super.getinfo();
        System.out.println("Salario: " + salario);
    }
}
