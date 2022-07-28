package ejercicioTema9IntroProgramacion;

public class Cliente extends Persona {

    private float credito;

    public Cliente(int edad, String nombre, String telefono, float credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public void getInfo() {
        super.getinfo();
        System.out.println("Credito: " + credito);
    }
}
