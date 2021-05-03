package clinica.personas.medicos.decorators;

import clinica.personas.medicos.IMedico;

public abstract class DecoratorMedico implements IMedico {
    protected IMedico encapsulado;

    public DecoratorMedico(IMedico encapsulado) {
        this.encapsulado = encapsulado;
    }

    @Override
    public String getDescripcion() {
        return this.encapsulado.getDescripcion();
    }

    @Override
    public String toString() {
        return this.encapsulado.toString();
    }
}
