package clinica.excepciones;

public class EspecialidadNoValidaException extends ImposibleCrearMedicoException {
    public EspecialidadNoValidaException(String message) {
        super(message);
    }
}
