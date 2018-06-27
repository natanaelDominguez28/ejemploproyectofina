/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao;

import aplicacion.modelo.dominio.Docente;
import java.util.List;

/**
 *
 * @author natan
 */
public interface IDocenteDAO {
    void agregar(Docente docente);
    void eliminar(Docente docente);
    void modificarEstado(Docente docente);
    Docente obtenerDocente(String cargo);
    List<Docente> obtenerDocentes();
}
