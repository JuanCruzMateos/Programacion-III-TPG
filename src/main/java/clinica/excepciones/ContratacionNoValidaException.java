package clinica.excepciones;

public class ContratacionNoValidaException extends ImposibleCrearMedicoException {
    public ContratacionNoValidaException(String message) {
        super(message);
    }
}
