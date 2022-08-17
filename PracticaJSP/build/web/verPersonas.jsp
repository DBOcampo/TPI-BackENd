<%@page import="java.util.List"%>
<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Personas</title>
    </head>
    <body>
        <h1>Lista de personas:</h1>
        <%
            List<Persona> listaPersonas = (List) request.getSession().getAttribute("listaPersonas");
            
            for(Persona per : listaPersonas){
        %>
        <h4><label>Persona ID: </label><%= per.getId()%></h4>
        <p><label>Dni: </label><%= per.getDni()%></p>
        <p><label>Nombre: </label><%= per.getNombre()%></p>
        <p><label>Apellido: </label><%= per.getApellido()%></p>
        <p><label>Telefono: </label><%= per.getTelefono()%></p>
        <p>___________________________________________________</p>
        <%
            }
        %>
    </body>
</html>
