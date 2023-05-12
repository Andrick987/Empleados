
import Controlador.EmpleadosControler;
import Modelo.Coneccion;
import Modelo.EmpleadosModel;
import Vistas.frmEmpleados;
import Vistas.frmPrincipal;


public class main {

    public static void main(String[] args) {
        
    frmPrincipal VistaPrincipal = new frmPrincipal();
    frmEmpleados VistaEmpleados = new frmEmpleados(null, true);
    EmpleadosModel ModeloEmpleados = new EmpleadosModel();
    Coneccion ConeccionModel = new Coneccion();
        
    EmpleadosControler controladorEmpleados = new EmpleadosControler(VistaPrincipal, VistaEmpleados, ModeloEmpleados, ConeccionModel);
    }
    
}
