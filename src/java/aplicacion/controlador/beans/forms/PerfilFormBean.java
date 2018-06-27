/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.PerfilBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author natan
 */
@ManagedBean
@RequestScoped
public class PerfilFormBean {
    @ManagedProperty(value = "#{perfilBean}")
    private PerfilBean perfilBean;
    /**
     * Creates a new instance of PerfilFormBean
     */
    public PerfilFormBean() {
    }

    public PerfilBean getPerfilBean() {
        return perfilBean;
    }

    public void setPerfilBean(PerfilBean perfilBean) {
        this.perfilBean = perfilBean;
    }
    
    
    
}
