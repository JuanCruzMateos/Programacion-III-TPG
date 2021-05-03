package clinica.excepciones;

public class InformacionPersonalNoValidaException extends ImposibleCrearMedicoException {
    public InformacionPersonalNoValidaException(String message) {
        super(message);
    }
}
