/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dao.AlumnoDao;
import pe.edu.cibertec.exception.BusinessException1;
import pe.edu.cibertec.exception.BusinessException2;
import pe.edu.cibertec.model.Alumno;
import pe.edu.cibertec.service.AlumnoService;

/**
 *
 * @author JUANCARLOS
 */
@Service("alumnoService")
public class AlumnoServiceImpl implements AlumnoService {
    @Autowired
    private AlumnoDao alumnoDao;

    public Alumno getById(Integer id) {
        return alumnoDao.getById(id);
    }
    
    public List<Alumno> list() {
        return alumnoDao.list();
    }

    @Transactional
    public void insert(Alumno alumno) throws BusinessException2 {
        alumnoDao.insert(alumno);
    }

    @PreAuthorize("hasRole('ROLE_SUPER_USER')")
    @Transactional
    public void update(Alumno alumno) throws BusinessException1 {
        alumnoDao.update(alumno);
    }

    @PreAuthorize("hasRole('ROLE_SUPER_USER')")
    @Transactional
    public void delete(Alumno alumno) throws BusinessException1 {
        Alumno alumnoForRemoving = alumnoDao.getById(alumno.getIdalumno());
        alumnoDao.delete(alumnoForRemoving);
    }
}