package clinica.personas.medicos.decorators;

import clinica.personas.medicos.IMedico;

public class DecoratorPermanente extends DecoratorMedico {

    public DecoratorPermanente(IMedico encapsulado) {
        super(encapsulado);
    }

    @Override
    public double getSueldo() {
        return this.encapsulado.getSueldo() * 1.10;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", Permanente.";
    }

    @Override
    public String toString() {
        return super.toString() + "[contratacion=Permanente]";
    }
}
