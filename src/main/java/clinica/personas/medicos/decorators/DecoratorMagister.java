package clinica.personas.medicos.decorators;

import clinica.personas.medicos.IMedico;

public class DecoratorMagister extends DecoratorMedico {
    public DecoratorMagister(IMedico encapsulado) {
        super(encapsulado);
    }

    @Override
    public double getSueldo() {
        return this.encapsulado.getSueldo() * 1.05;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", magister";
    }

    @Override
    public String toString() {
        return super.toString() + "[posgrado=Magister]";
    }
}
