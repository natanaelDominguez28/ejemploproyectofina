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
public class Materia {
    private Integer codigo;
    private String nombreMateria;
    private boolean estado;
    private Carrera carrera;

    public Materia(Integer codigo, String nombreMateria, boolean estado) {
        this.codigo = codigo;
        this.nombreMateria = nombreMateria;
        this.estado = estado;
    }

    public Materia(Integer codigo, String nombreMateria, boolean estado, Carrera carrera) {
        this.codigo = codigo;
        this.nombreMateria = nombreMateria;
        this.estado = estado;
        this.carrera = carrera;
    }

    public Materia() {
    }
    
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    
}
