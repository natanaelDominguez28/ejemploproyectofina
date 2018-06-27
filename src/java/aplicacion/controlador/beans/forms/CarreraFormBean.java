/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.CarreraBean;
import aplicacion.datos.hibernate.dao.ICarreraDAO;
import aplicacion.datos.hibernate.dao.imp.CarreraDAOImp;
import aplicacion.modelo.dominio.Carrera;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author natan
 */
@ManagedBean
@RequestScoped
public class CarreraFormBean {
    @ManagedProperty(value="#{carreraBean}")
    private CarreraBean carreraBean;
    private List<Carrera> carreras;

    /**
     * Creates a new instance of CarreraFormBean
     */
    public CarreraFormBean() {
        carreraBean = new CarreraBean();
        carreras = new ArrayList<>();
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }
    

    public CarreraBean getCarreraBean() {
        if(carreraBean == null){
            carreraBean = new CarreraBean();
        }
        return carreraBean;
    }

    public void setCarreraBean(CarreraBean carreraBean) {
        this.carreraBean = carreraBean;
    }
    
    public List<Carrera> obtenerCarreras(){
        ICarreraDAO carreraDAO = new CarreraDAOImp();
        if(carreraDAO.obtenerCarreras().isEmpty()){
            carreraDAO.agregar(new Carrera("Analista Programador Universitario", "2008", true));
            carreraBean.setCarrera(carreraDAO.obtenerCarreras().get(0));
        }
        return carreraDAO.obtenerCarreras();
    }
    
    
}
