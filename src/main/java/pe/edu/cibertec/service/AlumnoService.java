/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service;

import java.util.List;
import pe.edu.cibertec.exception.BusinessException1;
import pe.edu.cibertec.exception.BusinessException2;
import pe.edu.cibertec.model.Alumno;

/**
 *
 * @author JUANCARLOS
 */
public interface AlumnoService {
    public Alumno getById(Integer id);
    public List<Alumno> list();
    public void insert(Alumno alumno) throws BusinessException2;
    public void update(Alumno alumno) throws BusinessException1;
    public void delete(Alumno alumno) throws BusinessException1;
}