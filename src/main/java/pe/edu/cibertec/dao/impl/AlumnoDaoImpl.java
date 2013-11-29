/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dao.AlumnoDao;
import pe.edu.cibertec.model.Alumno;

/**
 *
 * @author JUANCARLOS
 */
@Repository("alumnoDao")
public class AlumnoDaoImpl implements AlumnoDao {
    @PersistenceContext
    EntityManager em;
    
    public Alumno getById(Integer id) {
        Query q = em.createQuery("select a from Alumno a where a.idalumno = :idalumno");
        q.setParameter("idalumno", id);
        return (Alumno)q.getSingleResult();
    }

    public List<Alumno> list() {
        Query q = em.createQuery("select a from Alumno a");
        return q.getResultList();
    }

    public void insert(Alumno alumno) {
        em.persist(alumno);
    }

    public void update(Alumno alumno) {
        em.merge(alumno);
    }

    public void delete(Alumno alumno) {
        em.remove(alumno);
    }
}