package clinica.personas.medicos;

import clinica.personas.Persona;

public abstract class Medico extends Persona implements IMedico {
    protected static double sueldoBasico = 100.0;
    protected Integer matricula;

    public Medico(String nombre, String apellido, String direccion, Integer telefono, Integer dni, Integer matricula) {
        super(nombre, apellido, direccion, telefono, dni);
        this.matricula = matricula;
    }

    public Medico(String nombre, String apellido, Integer dni) {
        super(nombre, apellido, dni);
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    // atributo final para que no pueda ser reescrito en clases extendidas
    public static final void setSueldoBasico(double sueldoBasico) {
        Medico.sueldoBasico = sueldoBasico;
    }

    public static final double getSueldoBasico() {
        return sueldoBasico;
    }

    @Override
    public String toString() {
        return "Medico: [nombre=" + nombre + ", apellido=" + apellido +
                ", direccion=" + direccion + ", telefono=" + telefono +
                ", dni=" + dni + ", matricula=" + matricula + ']';
    }
}
