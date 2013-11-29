/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.model.Alumno;

/**
 *
 * @author JUANCARLOS
 */
@Aspect
@Component("alumnoInterceptor")
public class AlumnoInterceptor {
    @Before("execution(* pe.edu.cibertec.service.impl.AlumnoServiceImpl.insert(pe.edu.cibertec.model.Alumno)) && args(alumno)")
    public void beforeInsertAlumnoInterceptor(Alumno alumno) {
        System.out.println("Before inserting alumno: " + alumno);
    }
    
    @After("execution(* pe.edu.cibertec.service.impl.AlumnoServiceImpl.insert(pe.edu.cibertec.model.Alumno)) && args(alumno)")
    public void afterInsertAlumnoInterceptor(Alumno alumno) {
        System.out.println("After inserting alumno: " + alumno);
    }
    
    @Before("execution(* pe.edu.cibertec.service.impl.AlumnoServiceImpl.update(pe.edu.cibertec.model.Alumno)) && args(alumno)")
    public void beforeUpdateAlumnoInterceptor(Alumno alumno) {
        System.out.println("Before updating alumno: " + alumno);
    }
    
    @After("execution(* pe.edu.cibertec.service.impl.AlumnoServiceImpl.update(pe.edu.cibertec.model.Alumno)) && args(alumno)")
    public void afterUpdateAlumnoInterceptor(Alumno alumno) {
        System.out.println("After updating alumno: " + alumno);
    }
    
    @Before("execution(* pe.edu.cibertec.service.impl.AlumnoServiceImpl.delete(pe.edu.cibertec.model.Alumno)) && args(alumno)")
    public void beforeDeleteAlumnoInterceptor(Alumno alumno) {
        System.out.println("Before deleting alumno: " + alumno);
    }
    
    @After("execution(* pe.edu.cibertec.service.impl.AlumnoServiceImpl.delete(..))")
    public void afterDeleteAlumnoInterceptor(JoinPoint joinPoint) {
        System.out.println("After inserting alumno: " + joinPoint.getSignature().getName() + " method");
    }
}