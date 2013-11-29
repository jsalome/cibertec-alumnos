<%-- 
    Document   : exceptionerror
    Created on : Nov 29, 2013, 4:28:01 PM
    Author     : JUANCARLOS
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <h1>Ops..!! Hubo un error. Por favor inténtelo nuevamente en unos minutos.</h1><br>
        <p>
            <a href="alumnosList"><s:text name="enlace.regresar"/></a>
        <p>
    </body>
</html>