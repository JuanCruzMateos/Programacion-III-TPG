package sistema.personas.pacientes;

/**
 * Clase que modela a un paciente mator de la clinica.<br>
 */
public class PacienteMayor extends Paciente {

    public PacienteMayor() {

    }

    /**
     * Constructor. <br>
     * <b>Pre: </b> nombre, apellido, direccion, ciudad distintos de null; telenofo y dni enteros positivos.<br>
     *
     * @param nombre             Nombre del paciente. Debe ser distinto de null.<br>
     * @param apellido           Apellido del paciente. Debe ser distinto de null.<br>
     * @param direccion          Direccion del paciente. Debe ser distinto de null.<br>
     * @param ciudad             Ciudad de residencia del paciente. Debe ser distinto de null.<br>
     * @param telefono           Telefono de contacto del paciente. Numero entero positivo.<br>
     * @param dni                DNI del paciente. Numero entero positivo.<br>
     * @param nroHistoriaClinica Numero de historia clinica del paciente.<br>
     */
    public PacienteMayor(String nombre, String apellido, String direccion, String ciudad, long telefono, int dni, int nroHistoriaClinica) {
        super(nombre, apellido, direccion, ciudad, telefono, dni, nroHistoriaClinica);
    }

    /**
     * Double dispatch para resolucion de conflictos en sala VIP.<br>
     */
    public boolean quedaEnSalaVipFrenteA(Paciente p) {
        return p.quedaMayor();
    }

    /**
     * Double dispatch para resolucion de conflictos en sala VIP.<br>
     */
    public boolean quedaNino() {
        return false;
    }

    /**
     * Double dispatch para resolucion de conflictos en sala VIP.<br>
     */
    public boolean quedaJoven() {
        return true;
    }

    /**
     * Double dispatch para resolucion de conflictos en sala VIP.<br>
     */
    public boolean quedaMayor() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "[rangoEtario=Mayor]";
    }
}
