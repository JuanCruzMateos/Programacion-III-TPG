package clinica.personas.medicos.factory;

import clinica.excepciones.*;
import clinica.personas.medicos.IMedico;
import clinica.personas.medicos.decorators.DecoratorDoctor;
import clinica.personas.medicos.decorators.DecoratorMagister;
import clinica.personas.medicos.decorators.DecoratorPermanente;
import clinica.personas.medicos.decorators.DecoratorTemporario;
import clinica.personas.medicos.especialidades.Cirujano;
import clinica.personas.medicos.especialidades.Clinico;
import clinica.personas.medicos.especialidades.Pediatra;

// Puede haber un medico sin posgrado ni contratacion?


/**
 * Clase MedicoFactory.<br>
 * Implementa patron Factory para la creacion de un medico.<br>
 */
public class MedicoFactory {
    public static IMedico getMedico(String especialidad, String posgrado, String contratacion, String nombre, String apellido, Integer dni) throws InformacionPersonalNoValidaException, EspecialidadNoValidaException, PosgradoNoValidoException, ContratacionNoValidaException {
        IMedico medicoBasico = null;
        IMedico medicoConPosgrado = null;
        IMedico medicoConContratacion = null;
        boolean infoPersonalValida = nombre != null && apellido != null && dni != null &&
                !nombre.equals("") && !apellido.equals("") && dni > 0;

        if (!infoPersonalValida)
            throw new InformacionPersonalNoValidaException("Los campos con los datos personales no son correctos.");
        else {
            if (especialidad.equalsIgnoreCase("clinica"))
                medicoBasico = new Clinico(nombre, apellido, dni);
            else if (especialidad.equalsIgnoreCase("cirugia"))
                medicoBasico = new Cirujano(nombre, apellido, dni);
            else if (especialidad.equalsIgnoreCase("pediatria"))
                medicoBasico = new Pediatra(nombre, apellido, dni);
            else
                throw new EspecialidadNoValidaException("La especialidad no es valida.");

            // si se ejecuta este if es porque no se lanzo una excepcion
            if (posgrado.equalsIgnoreCase("doctor"))
                medicoConPosgrado = new DecoratorDoctor(medicoBasico);
            else if (posgrado.equalsIgnoreCase("magister"))
                medicoConPosgrado = new DecoratorMagister(medicoBasico);
            else
                throw new PosgradoNoValidoException("El posgrado no es valido.");

            // si se ejecuta este if es porque no se lanzo una excepcion
            if (contratacion.equalsIgnoreCase("permanente"))
                medicoConContratacion = new DecoratorPermanente(medicoConPosgrado);
            else if (contratacion.equalsIgnoreCase("temporario"))
                medicoConContratacion = new DecoratorTemporario(medicoConPosgrado);
            else
                throw new ContratacionNoValidaException("El tipo de contratacion no es valido.");
            // si no ocure ninguna exception devuelvo el medico creado con todos los campos
            return medicoConContratacion;
        }
    }
}
