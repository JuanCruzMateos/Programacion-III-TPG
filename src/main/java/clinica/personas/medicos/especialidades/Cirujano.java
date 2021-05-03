package clinica.personas.medicos.especialidades;

import clinica.personas.medicos.Medico;

public class Cirujano extends Medico {

    public Cirujano(String nombre, String apellido, String direccion, Integer telefono, Integer dni, Integer matricula) {
        super(nombre, apellido, direccion, telefono, dni, matricula);
    }

    public Cirujano(String nombre, String apellido, Integer dni) {
        super(nombre, apellido, dni);
    }

    @Override
    public double getSueldo() {
        return Medico.sueldoBasico * 1.1;
    }

    @Override
    public String getDescripcion() {
        return "Medico Cirujano";
    }

    @Override
    public String toString() {
        return super.toString() + "[especialidad=" + this.getDescripcion() + "]";
    }
}
