
package Controlador;

import Modelo.Coneccion;
import Modelo.EmpleadosModel;
import Vistas.frmEmpleados;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpleadosControler implements ActionListener{
    
    frmPrincipal VistaPrincipal;
    frmEmpleados VistaEmpleados;
    EmpleadosModel ModeloEmpleados;
    Coneccion ConeccionModel;

    public EmpleadosControler( frmPrincipal VistaPrincipal, frmEmpleados VistaEmpleados, EmpleadosModel ModeloEmpleados, Coneccion ConeccionModel) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaEmpleados = VistaEmpleados;
        this.ModeloEmpleados = ModeloEmpleados;
        this.ConeccionModel = ConeccionModel;
        
        this.VistaPrincipal.btnConectar.addActionListener(this);
        this.VistaEmpleados.btnAgregar.addActionListener(this);
        this.VistaEmpleados.btnEditar.addActionListener(this);
        this.VistaEmpleados.btnEliminar.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        this.ModeloEmpleados.ListarDatos();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.VistaPrincipal.btnConectar){
            
            this.ConeccionModel.Conectar();
            this.VistaPrincipal.setVisible(false);
            this.VistaEmpleados.setVisible(true);
        }
    }
}
