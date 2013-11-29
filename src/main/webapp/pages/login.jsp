<%-- 
    Document   : login
    Created on : Nov 29, 2013, 3:22:53 PM
    Author     : JUANCARLOS
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title><s:text name="titulo.login"/></title>
    </head>
    <body onload='document.f.j_username.focus();'>
        <h3><s:text name="titulo.principal"/></h3>
        <form name='f' action="<c:url value='j_spring_security_check' />"  method='POST'>
            <table>
                <tr>
                    <td><s:text name="formulario.username"/>:</td>
                    <td><input type='text' name='j_username' value=''>
                    </td>
                </tr>
                <tr>
                    <td><s:text name="formulario.password"/>:</td>
                    <td>
                        <input type='password' name='j_password' />
                    </td>
                </tr>
                <tr>
                    <td colspan='2' style="text-align: right">
                        <input name="submit" type="submit" value="<s:text name="formulario.boton"/>" />
                    </td>
                </tr>
            </table>
        </form>
        <s:url var="ingles" includeParams="all" value="">
            <s:param name="request_locale">en</s:param>
        </s:url>	
        <s:url var="espanol" includeParams="all" value="">
            <s:param name="request_locale">es</s:param>
        </s:url>
        <s:a href="%{ingles}"><s:text name="titulo.lenguaje_en"/></s:a>
        <s:a href="%{espanol}"><s:text name="titulo.lenguaje_es"/></s:a>
    </body>
</html>