<%-- 
    Document   : mainMenu
    Created on : Nov 29, 2013, 3:25:03 PM
    Author     : JUANCARLOS
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title><s:text name="titulo.menu"/></title>
    </head>
    <body>
        <table>
            <tr>
                <td style="padding-bottom: 30px">
                    <a href="<c:url value="/admin/alumnosList" />" ><s:text name="menu.alumnos"/></a>
                </td>
            </tr>
            <tr>
                <td style="text-align: right">
                    <a href="<c:url value="/j_spring_security_logout" />" ><s:text name="titulo.logout"/></a>
                </td>
            </tr>
        </table>
    </body>
</html>