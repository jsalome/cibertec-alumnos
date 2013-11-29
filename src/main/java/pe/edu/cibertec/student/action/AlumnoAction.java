/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.student.action;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.persistence.exceptions.DatabaseException;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.cibertec.exception.BusinessException1;
import pe.edu.cibertec.exception.BusinessException2;
import pe.edu.cibertec.model.Alumno;
import pe.edu.cibertec.service.AlumnoService;

/**
 *
 * @author JUANCARLOS
 */
public class AlumnoAction extends ActionSupport {
    @Autowired
    private AlumnoService service;
    
    private List<Alumno> alumnos;
    
    private Alumno alumno;
    
    private Integer id;
    
    public String listarAlumnos() throws Exception {
        alumnos = service.list();
        return SUCCESS;
    }
    
    public String nuevoAlumno() {
        alumno = new Alumno();
        return SUCCESS;
    }
    
    public String obtenerAlumno() {
        alumno = service.getById(id);
        return SUCCESS;
    }

    public String insertarAlumno() {
        try {
            service.insert(alumno);
        } catch (BusinessException2 ex) {
            Logger.getLogger(AlumnoAction.class.getName()).log(Level.SEVERE, null, ex);
            return "exceptionError";
        } catch (DatabaseException ex) {
            Logger.getLogger(AlumnoAction.class.getName()).log(Level.SEVERE, null, ex);
            return "exceptionError";
        } catch (Exception ex) {
            Logger.getLogger(AlumnoAction.class.getName()).log(Level.SEVERE, null, ex);
            return "exceptionError";
        }
        return SUCCESS;
    }
    
    public String actualizarAlumno() {
        try {
            service.update(alumno);
        } catch (BusinessException1 ex) {
            Logger.getLogger(AlumnoAction.class.getName()).log(Level.SEVERE, null, ex);
            return "exceptionError";
        } catch (Exception ex) {
            Logger.getLogger(AlumnoAction.class.getName()).log(Level.SEVERE, null, ex);
            return "accessDenied";
        }
        return SUCCESS;
    }

    public String eliminarAlumno() {
        alumno = new Alumno();
        alumno.setIdalumno(id);
        try {
            service.delete(alumno);
        } catch (BusinessException1 ex) {
            Logger.getLogger(AlumnoAction.class.getName()).log(Level.SEVERE, null, ex);
            return "exceptionError";
        } catch (Exception ex) {
            Logger.getLogger(AlumnoAction.class.getName()).log(Level.SEVERE, null, ex);
            return "accessDenied";
        }
        return SUCCESS;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}