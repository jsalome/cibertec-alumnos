<%-- 
    Document   : nuevoAlumno
    Created on : Nov 29, 2013, 3:21:50 PM
    Author     : JUANCARLOS
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title><s:text name="modulo.curso.agregar"/></title>
        <s:head />
    </head>
    <body>
        <h1><s:text name="modulo.curso.agregar"/></h1>
        <s:form action="guardarAlumno">
            <s:textfield key="form.alumno.appaterno" name="alumno.appaterno"/>
            <s:textfield key="form.alumno.apmaterno" name="alumno.apmaterno"/>
            <s:textfield key="form.alumno.nombres" name="alumno.nombres"/>
            <s:textfield key="form.alumno.fechanacimiento" name="alumno.nacimiento"/>
            <s:textfield key="form.alumno.direccion" name="alumno.direccion"/>
            <s:textfield key="form.alumno.referencia" name="alumno.referencia"/>
            <s:radio key="form.alumno.genero"
                     name="alumno.genero"
                     list="#{'M':getText('form.alumno.genero_masculino'), 'F':getText('form.alumno.genero_femenino')}"/>
            <s:select key="form.alumno.estado" 
                      list="#{'A':getText('form.alumno.estado_activo'), 'I':getText('form.alumno.estado_inactivo')}" 
                      name="alumno.estado" 
                      value="A" />
            <s:submit key="form.alumno.guardar"/>
        </s:form>
        <p>
            <a href="alumnosList"><s:text name="enlace.regresar"/></a>
        <p>
    </body>
</html>