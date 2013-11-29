<%-- 
    Document   : listAlumno
    Created on : Nov 29, 2013, 3:20:47 PM
    Author     : JUANCARLOS
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <head>
        <title><s:text name="modulo.curso"/></title>
        <s:head/>
        <link href="../css/principal.css" type=text/css rel=stylesheet>
    </head>
    <body>
        <table>
            <tr>
                <td>
                    <table style="width: 100%">
                        <tr>
                            <td>
                                <h1><s:text name="modulo.curso"/></h1>
                            </td>
                            <td style="text-align: right;">
                                <a href="<c:url value='../j_spring_security_logout' />" ><s:text name="titulo.logout"/></a>
                            </td>
                        </tr>
                    </table>
                    <table class="tabla">
                        <thead>
                            <tr>
                                <th><s:text name="form.alumno.appaterno"/></th>
                                <th><s:text name="form.alumno.apmaterno"/></th>
                                <th><s:text name="form.alumno.nombres"/></th>
                                <th><s:text name="form.alumno.fechanacimiento"/></th>
                                <th><s:text name="form.alumno.direccion"/></th>
                                <th><s:text name="form.alumno.referencia"/></th>
                                <th colspan="2"><s:text name="form.alumno.accion"/></th>
                            </tr
                        </thead>
                        <tbody>
                            <s:iterator value="alumnos" var="obj">
                                <tr>
                                    <td><s:property value="appaterno"/></td>
                                    <td><s:property value="apmaterno"/></td>
                                    <td><s:property value="nombres"/></td>
                                    <td><s:property value="nacimiento"/></td>
                                    <td><s:property value="direccion"/></td>
                                    <td><s:property value="referencia"/></td>
                                    <td>
                                        <a href="obtenerAlumno?id=<s:property value="idalumno"/>"><s:text name="enlace.actualizar"/></a>
                                    </td>
                                    <td>
                                        <a href="eliminarAlumno?id=<s:property value="idalumno"/>"><s:text name="enlace.eliminar"/></a>
                                    </td>
                                </tr>
                            </s:iterator>
                        <tbody>
                    </table>
                    <p>
                        <table style="width: 100%">
                            <tr>
                                <td>
                                    <a href="nuevoAlumno"><s:text name="modulo.curso.agregar"/></a>
                                </td>
                                <td style="text-align: right;">
                                    <a href="../mainMenu" ><s:text name="enlace.regresar"/></a>
                                </td>
                            </tr>
                        </table>
                    <p>
                </td>
            </tr>
        </table>
    </body>
</html>