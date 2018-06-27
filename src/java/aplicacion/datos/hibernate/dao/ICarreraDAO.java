/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao;

import aplicacion.modelo.dominio.Carrera;
import java.util.List;

/**
 *
 * @author natan
 */
public interface ICarreraDAO {
    void agregar(Carrera carrera);
    void eliminar(Carrera carrera);
    void modificarEstado(Carrera carrera);
    Carrera obtenerCarrera(String nombreCarrera);
    List<Carrera> obtenerCarreras();
}
