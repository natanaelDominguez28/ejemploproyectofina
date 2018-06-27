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
public class Docente {
    private Integer codigo;
    private String legajo;
    private String cargo;
    private boolean estado;
    private Perfil perfil;

    public Docente(Integer codigo, String legajo, String cargo, boolean estado) {
        this.codigo = codigo;
        this.legajo = legajo;
        this.cargo = cargo;
        this.estado = estado;
    }

    public Docente() {
    }

    public Docente(Integer codigo, String legajo, String cargo, boolean estado, Perfil perfil) {
        this.codigo = codigo;
        this.legajo = legajo;
        this.cargo = cargo;
        this.estado = estado;
        this.perfil = perfil;
    }
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    
    
}
