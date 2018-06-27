/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author natan
 */
public class Carrera {
    private Integer codigo;
    private String nombreCarrera;
    private String plan;
    private boolean estado;

    public Carrera(Integer codigo, String nombreCarrera, String plan, boolean estado) {
        this.codigo = codigo;
        this.nombreCarrera = nombreCarrera;
        this.plan = plan;
        this.estado = estado;
    }

    public Carrera(String nombreCarrera, String plan, boolean estado) {
        this.nombreCarrera = nombreCarrera;
        this.plan = plan;
        this.estado = estado;
    }

    
    public Carrera() {
    }
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
