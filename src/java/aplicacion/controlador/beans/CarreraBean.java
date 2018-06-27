/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.Carrera;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author natan
 */
@ManagedBean
@RequestScoped
public class CarreraBean {
    private Carrera carrera;
    
    /**
     * Creates a new instance of CarreraBean
     */
    public CarreraBean() {
        carrera = new Carrera();
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    
}
