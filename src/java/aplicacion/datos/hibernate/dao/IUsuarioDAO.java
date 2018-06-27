/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao;

import aplicacion.modelo.dominio.Usuario;
import java.util.List;

/**
 *
 * @author natan
 */
public interface IUsuarioDAO {
    void agregar(Usuario usuario);
    void eliminar(Usuario usuario);
    void modificar(Usuario usuario);
    void modificarEstado(Usuario usuario);
    Usuario obtenerUsuario(String nombreUsuario);
    List<Usuario> obtenerUsuarios();
    Usuario validarUsuario(String nombreUsuario, String password);
}
