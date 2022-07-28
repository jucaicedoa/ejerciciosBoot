package ejercicioTema9IntroProgramacion;

/*
Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
 */
public abstract class Persona {

    public int edad;
    public String nombre;
    public String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void getinfo() {
        System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad
                + "\nTelefono: " + this.telefono);
    }

    public static void main(String[] args) {
        System.out.println("Datos Cliente");
        Cliente cliente1 = new Cliente(30, "Manuel", "2359000000", 1000456);
        cliente1.getInfo();
        System.out.println("");
        System.out.println("Datos trabajador");
        Trabajador trabajador1 = new Trabajador(22, "Oscar", "1234450000", 600456);
        trabajador1.getInfo();
    }

}
    
        
    
   
    
    
    

