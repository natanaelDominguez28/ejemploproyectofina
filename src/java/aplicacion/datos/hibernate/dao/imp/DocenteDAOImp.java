/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.util.HibernateUtil;
import aplicacion.datos.hibernate.dao.IDocenteDAO;
import aplicacion.modelo.dominio.Docente;
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
public class DocenteDAOImp implements Serializable,IDocenteDAO{

    @Override
    public void agregar(Docente docente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(docente);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(Docente docente) {
        docente.setEstado(false);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(docente);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificarEstado(Docente docente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(docente);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Docente obtenerDocente(String cargo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Docente.class);
        criteria.add(Restrictions.like("cargo", cargo));
        Docente docente = null;
        if(!criteria.list().isEmpty()){
            docente = (Docente)criteria.list().get(0);
        }
        session.getTransaction().commit();
        session.close();
        return docente;
    }

    @Override
    public List<Docente> obtenerDocentes() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Docente.class);
        criteria.addOrder(Order.asc("cargo"));
        List materias = criteria.list();
        return materias;
    }
    
}
