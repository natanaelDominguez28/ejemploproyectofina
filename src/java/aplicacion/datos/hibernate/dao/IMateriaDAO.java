/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao;

import aplicacion.modelo.dominio.Materia;
import java.util.List;

/**
 *
 * @author natan
 */
public interface IMateriaDAO {
    void agregar(Materia materia);
    void eliminar(Materia materia);
    void modificarEstado(Materia materia);
    Materia obtenerMateria(String nombreMateria);
    List<Materia> obtenerMaterias();
}
