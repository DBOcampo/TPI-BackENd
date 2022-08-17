<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos de la persona</h1>
        <form action="SvPersona" method="POST">
            <p><label>Dni:</label></p><input type="text" name="dni"></p>
            <p><label>Nombre:</label></p><input type="text" name="nombre"></p>
            <p><label>Apellido:</label></p><input type="text" name="apellido"></p>
            <p><label>Telefono:</label></p><input type="text" name="telefono"></p>
            <button type="submit">Enviar</button>
        </form>
        
        <h1>Ver lista de Personas</h1>
        <form action="SvPersona" method="GET">
            <button type="submit">Ver</button>
        </form>
        
        <h1>Eliminar Personas</h1>
        <form  action="SvEliminar" method="POST">
            <p><label>Id:</label></p><input type="text" name="id_elim"></p>
            <button type="submit">Eliminar</button>
        </form>
        
        <h1>Editar Persona</h1>
        <form action="SvEditar" method="POST">
            <p><label>Id:</label></p><input type="text" name="id"></p>
            <p><label>Nuevo Dni:</label></p><input type="text" name="dni"></p>
            <p><label>Nuevo Nombre:</label></p><input type="text" name="nombre"></p>
            <p><label>Nuevo Apellido:</label></p><input type="text" name="apellido"></p>
            <p><label>Nuevo Telefono:</label></p><input type="text" name="telefono"></p>
            <button type="submit">Editar</button>
        </form>
    </body>
</html>
