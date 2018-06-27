/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo;

import java.util.Date;

/**
 *
 * @author natan
 */
public class Asistencia {
    private Integer codigo;
    private Date fecha;
    private String valor;
    private boolean estado;
    private AulaDeMateria aulaDeMateria;
    private InscripcionDeAlumno alumnoInscripto;

    public Asistencia(Integer codigo, Date fecha, String valor, boolean estado, AulaDeMateria aulaDeMateria, InscripcionDeAlumno alumnoInscripto) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.valor = valor;
        this.estado = estado;
        this.aulaDeMateria = aulaDeMateria;
        this.alumnoInscripto = alumnoInscripto;
    }

    public Asistencia() {
    }
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public AulaDeMateria getAulaDeMateria() {
        return aulaDeMateria;
    }

    public void setAulaDeMateria(AulaDeMateria aulaDeMateria) {
        this.aulaDeMateria = aulaDeMateria;
    }

    public InscripcionDeAlumno getAlumnoInscripto() {
        return alumnoInscripto;
    }

    public void setAlumnoInscripto(InscripcionDeAlumno alumnoInscripto) {
        this.alumnoInscripto = alumnoInscripto;
    }
    
    
}
