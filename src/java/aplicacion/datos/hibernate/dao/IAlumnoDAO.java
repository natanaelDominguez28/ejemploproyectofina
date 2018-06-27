/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao;

import aplicacion.modelo.dominio.Alumno;
import java.util.List;

/**
 *
 * @author natan
 */
public interface IAlumnoDAO {
    void agregar(Alumno alumno);
    void eliminar(Alumno alumno);
    void modificarEstado(Alumno alumno);
    Alumno obtenerAlumno(String libretaUniversitaria);
    List<Alumno> obtenerUsuarios();
}
