/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.AlumnoBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author natan
 */
@ManagedBean
@RequestScoped
public class AlumnoFormBean {
    @ManagedProperty(value="#{alumnoBean}")
    private AlumnoBean alumnoBean;

    /**
     * Creates a new instance of AlumnoFormBean
     */
    public AlumnoFormBean() {
    }

    public AlumnoBean getAlumnoBean() {
        return alumnoBean;
    }

    public void setAlumnoBean(AlumnoBean alumnoBean) {
        this.alumnoBean = alumnoBean;
    }
    
    
}
