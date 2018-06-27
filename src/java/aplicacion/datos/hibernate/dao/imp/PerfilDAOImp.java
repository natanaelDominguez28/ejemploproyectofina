/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.util.HibernateUtil;
import aplicacion.datos.hibernate.dao.IPerfilDAO;
import aplicacion.modelo.dominio.Perfil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

/**
 *
 * @author natan
 */
public class PerfilDAOImp implements Serializable,IPerfilDAO{

    @Override
    public void agregar(Perfil perfil) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(perfil);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(Perfil perfil) {
        perfil.getTipoUsuario().setEstado(false);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(perfil);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificarEstado(Perfil perfil) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(perfil);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Perfil> obtenerPerfiles() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Perfil.class);
        criteria.addOrder(Order.asc("apellidos"));
        List carreras = criteria.list();
        return carreras;
    }
    
}
