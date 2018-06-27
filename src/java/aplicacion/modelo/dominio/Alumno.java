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
public class Alumno {
    private Integer codigo;
    private String libretaUniversitaria;
    private Carrera carrera;
    private Perfil perfil;

    public Alumno(Integer codigo, String libretaUniversitaria, Carrera carrera, Perfil perfil) {
        this.codigo = codigo;
        this.libretaUniversitaria = libretaUniversitaria;
        this.carrera = carrera;
        this.perfil = perfil;
    }

    public Alumno() {
    }
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getLibretaUniversitaria() {
        return libretaUniversitaria;
    }

    public void setLibretaUniversitaria(String libretaUniversitaria) {
        this.libretaUniversitaria = libretaUniversitaria;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    
    
}
