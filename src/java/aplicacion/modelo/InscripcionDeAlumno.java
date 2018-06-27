/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo;

import aplicacion.modelo.dominio.Alumno;

/**
 *
 * @author natan
 */
public class InscripcionDeAlumno {
    private Integer codigo;
    private boolean estado;
    private DocentePorMateria docenteMateria;
    private Alumno alumno;

    public InscripcionDeAlumno(Integer codigo, boolean estado, DocentePorMateria docenteMateria, Alumno alumno) {
        this.codigo = codigo;
        this.estado = estado;
        this.docenteMateria = docenteMateria;
        this.alumno = alumno;
    }

    public InscripcionDeAlumno() {
    }


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public DocentePorMateria getDocenteMateria() {
        return docenteMateria;
    }

    public void setDocenteMateria(DocentePorMateria docenteMateria) {
        this.docenteMateria = docenteMateria;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    
    
}
