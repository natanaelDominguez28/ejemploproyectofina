/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.util.HibernateUtil;
import aplicacion.datos.hibernate.dao.IMateriaDAO;
import aplicacion.modelo.dominio.Materia;
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
public class MateriaDAOImp implements Serializable,IMateriaDAO{

    @Override
    public void agregar(Materia materia) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(materia);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(Materia materia) {
        materia.setEstado(false);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(materia);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificarEstado(Materia materia) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(materia);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Materia obtenerMateria(String nombreMateria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Materia.class);
        criteria.add(Restrictions.like("nombreMateria", nombreMateria));
        Materia materia = null;
        if(!criteria.list().isEmpty()){
            materia = (Materia)criteria.list().get(0);
        }
        session.getTransaction().commit();
        session.close();
        return materia;
    }

    @Override
    public List<Materia> obtenerMaterias() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Materia.class);
        criteria.addOrder(Order.asc("nombreMateria"));
        List materias = criteria.list();
        return materias;
    }
    
}
