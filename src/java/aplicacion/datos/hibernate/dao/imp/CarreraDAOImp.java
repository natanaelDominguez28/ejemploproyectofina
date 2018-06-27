/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.util.HibernateUtil;
import aplicacion.datos.hibernate.dao.ICarreraDAO;
import aplicacion.modelo.dominio.Carrera;
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
public class CarreraDAOImp implements Serializable, ICarreraDAO{

    @Override
    public void agregar(Carrera carrera) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(carrera);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(Carrera carrera) {
        carrera.setEstado(false);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(carrera);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificarEstado(Carrera carrera) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(carrera);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Carrera obtenerCarrera(String nombreCarrera) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Carrera.class);
        criteria.add(Restrictions.like("nombreCarrera", nombreCarrera));
        Carrera carrera = null;
        if(!criteria.list().isEmpty()){
            carrera = (Carrera)criteria.list().get(0);
        }
        session.getTransaction().commit();
        session.close();
        return carrera;
    }

    @Override
    public List<Carrera> obtenerCarreras() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Carrera.class);
        criteria.addOrder(Order.asc("nombreCarrera"));
        List carreras = criteria.list();
        return carreras;
    }
    
}
