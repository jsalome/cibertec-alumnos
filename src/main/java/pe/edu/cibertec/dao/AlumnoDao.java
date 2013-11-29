/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dao;
import pe.edu.cibertec.model.Alumno;

import java.util.List;

/**
 *
 * @author JUANCARLOS
 */
public interface AlumnoDao {
    Alumno getById(Integer id);
    List<Alumno> list();
    void insert(Alumno alumno);
    void update(Alumno alumno);
    void delete(Alumno alumno);
}