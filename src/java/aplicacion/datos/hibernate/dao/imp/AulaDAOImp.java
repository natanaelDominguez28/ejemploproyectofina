/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.util.HibernateUtil;
import aplicacion.datos.hibernate.dao.IAulaDAO;
import aplicacion.modelo.dominio.Aula;
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
public class AulaDAOImp implements Serializable,IAulaDAO{

    @Override
    public void agregar(Aula aula) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(aula);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(Aula aula) {
        aula.setEstado(false);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(aula);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificarEstado(Aula aula) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(aula);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Aula obtenerAula(String nombreAula) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Aula.class);
        criteria.add(Restrictions.like("nombreAula", nombreAula));
        Aula aula = null;
        if(!criteria.list().isEmpty()){
            aula = (Aula)criteria.list().get(0);
        }
        session.getTransaction().commit();
        session.close();
        return aula;
    }

    @Override
    public List<Aula> obtenerAulas() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Aula.class);
        criteria.addOrder(Order.asc("nombreAula"));
        List aulas = criteria.list();
        return aulas;
    }
    
}
