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
public class Usuario {
    private Integer codigo;
    private String nombreUsuario;
    private String password;
    private String tipoDeUsuario;
    private boolean estado;

    public Usuario() {
    }

    public Usuario(Integer codigo, String nombreUsuario, String password, String tipoDeUsuario, boolean estado) {
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.tipoDeUsuario = tipoDeUsuario;
        this.estado = estado;
    }
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
     
    
}
