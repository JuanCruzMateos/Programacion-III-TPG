package clinica;

import clinica.excepciones.ContratacionNoValidaException;
import clinica.excepciones.EspecialidadNoValidaException;
import clinica.excepciones.InformacionPersonalNoValidaException;
import clinica.excepciones.PosgradoNoValidoException;
import clinica.personas.medicos.IMedico;
import clinica.personas.medicos.factory.MedicoFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            IMedico doctor = MedicoFactory.getMedico("pediatria", "magister", "temporario", "Juan", "Peres", 38443617);
            System.out.println(doctor);
            System.out.println(doctor.getDescripcion());
            System.out.println(doctor.getSueldo());
        } catch (InformacionPersonalNoValidaException e) {
            System.out.println(e.getMessage());
        } catch (EspecialidadNoValidaException e) {
            System.out.println(e.getMessage());
        } catch (ContratacionNoValidaException e) {
            System.out.println(e.getMessage());
        } catch (PosgradoNoValidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
