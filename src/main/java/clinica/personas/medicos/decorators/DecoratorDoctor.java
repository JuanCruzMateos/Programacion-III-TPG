package clinica.personas.medicos.decorators;

import clinica.personas.medicos.IMedico;

public class DecoratorDoctor extends DecoratorMedico {
    public DecoratorDoctor(IMedico encapsulado) {
        super(encapsulado);
    }

    @Override
    public double getSueldo() {
        return this.encapsulado.getSueldo() * 1.10;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", doctor";
    }

    @Override
    public String toString() {
        return super.toString() + "[posgrado=Doctor]";
    }
}
