<%-- 
    Document   : response
    Created on : 16/03/2020, 08:23:00 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laboratorio JSP</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:setProperty name="mybean" property="nombre"/>
        <jsp:setProperty name="mybean" property="fechaNacimiento"/>
        <jsp:setProperty name="mybean" property="fechaIngreso"/>
        <jsp:setProperty name="mybean" property="semestreIngreso"/>
        <h1>Hola, <jsp:getProperty name="mybean" property="nombre" /> !
            <br>
            Usted tiene <jsp:getProperty name="mybean" property="fechaNacimiento" /> años
            <br>
            Usted ingreso a la u en el en el periodo <jsp:getProperty name="mybean" property="fechaIngreso" />-<jsp:getProperty name="mybean" property="semestreIngreso" />
            <br>
            Usted a cursado aproximadamente <jsp:getProperty name="mybean" property="semestresCursados" /> semestres
        </h1>
        
        
    </body>
</html>
