/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.Materia;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author natan
 */
@ManagedBean
@RequestScoped
public class MateriaBean {
    private Materia materia;
    /**
     * Creates a new instance of MateriaBean
     */
    public MateriaBean() {
        materia = new Materia();
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    
    
}
