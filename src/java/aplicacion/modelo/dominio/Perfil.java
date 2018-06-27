/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.util.Date;

/**
 *
 * @author natan
 */
public class Perfil {
    private Integer codigo;
    private String nombres;
    private String apellidos;
    private String dni;
    private Date fechaDeNacimiento;
    private String email;
    private String numCelular;
    private Usuario tipoUsuario;

    public Perfil() {
    }

    public Perfil(Integer codigo, String nombres, String apellidos, String dni, Date fechaDeNacimiento, String email, String numCelular, Usuario tipoUsuario) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.email = email;
        this.numCelular = numCelular;
        this.tipoUsuario = tipoUsuario;
    }
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public Usuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Usuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    
}
