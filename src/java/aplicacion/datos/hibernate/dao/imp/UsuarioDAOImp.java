/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.util.HibernateUtil;
import aplicacion.datos.hibernate.dao.IUsuarioDAO;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author natan
 */
public class UsuarioDAOImp implements Serializable,IUsuarioDAO{

    @Override
    public void agregar(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(usuario);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(Usuario usuario) {
        usuario.setEstado(false);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(usuario);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificarEstado(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(usuario);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Usuario obtenerUsuario(String nombreUsuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.like("nombreUsuario", nombreUsuario));
        Usuario usuario = null;
        if(!criteria.list().isEmpty()){
            usuario = (Usuario)criteria.list().get(0);
        }
        session.getTransaction().commit();
        session.close();
        return usuario;
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.addOrder(Order.asc("apellido"));
        List usuarios = criteria.list();
        return usuarios;
    }

    @Override
    public Usuario validarUsuario(String nombreUsuario, String password) {
        Usuario usuario = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.like("nombreUsuario", nombreUsuario));
        criteria.add(Restrictions.like("password", password));
        criteria.add(Restrictions.eq("estado", true));
        if(!criteria.list().isEmpty()){
            usuario = (Usuario)criteria.list().get(0);
        }
        return usuario;
    }

    @Override
    public void modificar(Usuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(usuario);
        session.getTransaction().commit();
        session.close();
    }
    
}
