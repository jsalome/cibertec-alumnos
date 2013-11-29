<%-- 
    Document   : accessdenied
    Created on : Nov 29, 2013, 3:24:31 PM
    Author     : JUANCARLOS
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso no autorizado a nivel de servicios</title>
    </head>
    <body>
        <h1>Ops..!! No tienes permisos para acceder a la seccion escogida</h1><br>
        <p>
            <a href="alumnosList"><s:text name="enlace.regresar"/></a>
        <p>
    </body>
</html>