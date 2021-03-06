package sistema.gui;

import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.util.Iterator;

import javax.swing.JTextPane;

import sistema.habitaciones.Habitacion;
import sistema.personas.medicos.IMedico;
import sistema.personas.pacientes.Asociado;
import sistema.personas.pacientes.Paciente;

public interface IVista {
    //Facturacion
    Paciente getPacienteFacturacion();

    IMedico getMedicoFacturacion();

    int getCantidadConsultasFacturacion();

    Habitacion getHabitacionFacturacion();

    int getCantidadDiasInternacionFacturacion();

    void actualizarListaPacientesFacturacion(Iterator<Paciente> iterator);

    void actualizarComboMedicosFacturacion(Iterator<IMedico> iterator);

    void actualizarComboHabitacionesFacturacion(Iterator<Habitacion> iterator);

    void MostrarFactura(String detalle);

    //ALTA/BAJA
    void actualizarListaAsociados(Iterator<Asociado> iterator);

    String getNombreAsociado();

    String getApellidoAsociado();

    int getDNIAsociado();

    String getDireccionAsociado();

    Long getTelefonoAsociado();

    int getDNIAsociadoAEliminar();

    //SIMULACION
    Asociado getAsociadoSimulacion();

    int getCantidadSolicitudesAsociado();

    int getCantidadSolicitudesOperario();

    JTextPane getTextPane();

    void addActionListener(ActionListener actionListener);

    void addWindowListener(WindowListener windowListener);

    void habilitarBotonesFactura(boolean habilitar);
}
