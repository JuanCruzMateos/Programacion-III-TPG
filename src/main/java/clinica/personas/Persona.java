package clinica.personas;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected Integer telefono; // wrapper para poder usar null
    protected Integer dni; // wrapper para poder usar null

    public Persona(String nombre, String apellido, String direccion, Integer telefono, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
    }

    // una persona, como minimo tiene un nombre, un apellido y un dni
    public Persona(String nombre, String apellido, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = null;
        this.telefono = null;

    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getDni() {
        return this.dni;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", dni=" + dni +
                '}';
    }
}
