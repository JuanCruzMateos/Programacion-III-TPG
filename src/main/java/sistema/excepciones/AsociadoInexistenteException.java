package sistema.excepciones;

import sistema.personas.pacientes.Asociado;

public class AsociadoInexistenteException extends Exception {
    private Asociado asociadoInexistente;
    
    public AsociadoInexistenteException(String message, Asociado asociadoInexistente) {
        super(message);
        this.asociadoInexistente = asociadoInexistente;
    }

    public Asociado getAsociadoInexistente() {
        return asociadoInexistente;
    }
}
