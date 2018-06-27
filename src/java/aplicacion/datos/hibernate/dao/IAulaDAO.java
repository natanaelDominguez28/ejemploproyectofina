/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao;

import aplicacion.modelo.dominio.Aula;
import java.util.List;

/**
 *
 * @author natan
 */
public interface IAulaDAO {
    void agregar(Aula aula);
    void eliminar(Aula aula);
    void modificarEstado(Aula aula);
    Aula obtenerAula(String nombreAula);
    List<Aula> obtenerAulas();
}
