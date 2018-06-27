/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao;

import aplicacion.modelo.dominio.Perfil;
import java.util.List;

/**
 *
 * @author natan
 */
public interface IPerfilDAO {
    void agregar(Perfil perfil);
    void eliminar(Perfil perfil);
    void modificarEstado(Perfil perfil);
    List<Perfil> obtenerPerfiles();
}
