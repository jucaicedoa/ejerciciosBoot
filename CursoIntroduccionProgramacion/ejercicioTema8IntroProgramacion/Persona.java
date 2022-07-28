/*
Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
 */
package ejercicioTema8IntroProgramacion;

public class Persona {

    private int edad;
    private String nombre, telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void main(String[] args) {

        Persona mujer = new Persona();
        mujer.setEdad(21);
        mujer.setNombre("MARÍA CAMLA");
        mujer.setTelefono("3228000001");
        System.out.println("NOMBRE DE PERSONA: " + mujer.getNombre());
        System.out.println("EDAD: " + mujer.getEdad());
        System.out.println("NÚMERO DE TELÉFONO: " + mujer.getTelefono());
    }

}
