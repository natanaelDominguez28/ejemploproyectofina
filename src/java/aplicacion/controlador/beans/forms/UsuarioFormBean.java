/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.UsuarioBean;
import aplicacion.datos.hibernate.dao.IUsuarioDAO;
import aplicacion.datos.hibernate.dao.imp.UsuarioDAOImp;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author natan
 */
@ManagedBean
@RequestScoped
public class UsuarioFormBean {
    @ManagedProperty(value = "#{usuarioBean}")
    private UsuarioBean usuarioBean;
    /**
     * Creates a new instance of UsuarioFormBean
     */
    public UsuarioFormBean() {
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }
    
    public void actualizarDatos(){
       usuarioBean.getUsuario().setEstado(true);
        IUsuarioDAO usuarioDAO = new UsuarioDAOImp();
        usuarioDAO.modificar(usuarioBean.getUsuario()); 
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos actualizados","Datos actualizados");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }
    
}
