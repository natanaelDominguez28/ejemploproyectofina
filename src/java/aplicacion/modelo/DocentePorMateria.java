/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo;

import aplicacion.modelo.dominio.Docente;
import aplicacion.modelo.dominio.Materia;

/**
 *
 * @author natan
 */
public class DocentePorMateria {
    private Integer codigo;
    private Integer anio;
    private boolean estaHabilitado;
    private boolean estado;
    private Materia materia;
    private Docente docente;

    public DocentePorMateria() {
    }

    public DocentePorMateria(Integer codigo, Integer anio, boolean estaHabilitado, boolean estado, Materia materia, Docente docente) {
        this.codigo = codigo;
        this.anio = anio;
        this.estaHabilitado = estaHabilitado;
        this.estado = estado;
        this.materia = materia;
        this.docente = docente;
    }

    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public boolean isEstaHabilitado() {
        return estaHabilitado;
    }

    public void setEstaHabilitado(boolean estaHabilitado) {
        this.estaHabilitado = estaHabilitado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    
    
    
    
}
