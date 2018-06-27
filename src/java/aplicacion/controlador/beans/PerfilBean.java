/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.Perfil;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author natan
 */
@ManagedBean
@RequestScoped
public class PerfilBean {
    private Perfil perfil;
    /**
     * Creates a new instance of PerfilBean
     */
    public PerfilBean() {
        perfil = new Perfil();
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    
    
}
