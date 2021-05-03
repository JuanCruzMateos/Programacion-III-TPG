package clinica.personas.medicos.decorators;

import clinica.personas.medicos.IMedico;

public class DecoratorTemporario extends DecoratorMedico {

    public DecoratorTemporario(IMedico encapsulado) {
        super(encapsulado);
    }

    @Override
    public double getSueldo() {
        return this.encapsulado.getSueldo() * 1.05;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", temporario";
    }

    @Override
    public String toString() {
        return super.toString() + "[contratacion=Temporario]";
    }
}
