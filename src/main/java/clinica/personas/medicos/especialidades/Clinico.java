package clinica.personas.medicos.especialidades;

//import clinica.personas.medicos.IMedico; -> ya implementado por herencia
import clinica.personas.medicos.Medico;

public class Clinico extends Medico {

    public Clinico(String nombre, String apellido, String direccion, Integer telefono, Integer dni, Integer matricula) {
        super(nombre, apellido, direccion, telefono, dni, matricula);
    }

    public Clinico(String nombre, String apellido, Integer dni) {
        super(nombre, apellido, dni);
    }

    @Override
    public double getSueldo() {
        return Medico.sueldoBasico * 1.05;
    }

    @Override
    public String getDescripcion() {
        return "Medico Clinico";
    }

    @Override
    public String toString() {
        return super.toString() + "[especialidad=" + this.getDescripcion() + "]";
    }
}
