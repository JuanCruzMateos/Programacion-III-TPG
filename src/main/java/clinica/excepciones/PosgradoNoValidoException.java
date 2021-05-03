package clinica.excepciones;

public class PosgradoNoValidoException extends ImposibleCrearMedicoException {
    public PosgradoNoValidoException(String message) {
        super(message);
    }
}
