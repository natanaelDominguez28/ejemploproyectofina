/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.util.HibernateUtil;
import aplicacion.datos.hibernate.dao.IAlumnoDAO;
import aplicacion.modelo.dominio.Alumno;
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
public class AlumnoDAOImp implements Serializable,IAlumnoDAO{

    @Override
    public void agregar(Alumno alumno) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(alumno);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(Alumno alumno) {
        alumno.getPerfil().getTipoUsuario().setEstado(false);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(alumno);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificarEstado(Alumno alumno) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(alumno);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Alumno obtenerAlumno(String libretaUniversitaria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Alumno.class);
        criteria.add(Restrictions.like("libretaUniversitaria", libretaUniversitaria));
        Alumno alumno = null;
        if(!criteria.list().isEmpty()){
            alumno = (Alumno)criteria.list().get(0);
        }
        session.getTransaction().commit();
        session.close();
        return alumno;
    }

    @Override
    public List<Alumno> obtenerUsuarios() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Alumno.class);
        criteria.addOrder(Order.asc("libretaUniversitaria"));
        List materias = criteria.list();
        return materias;
    }
    
}
