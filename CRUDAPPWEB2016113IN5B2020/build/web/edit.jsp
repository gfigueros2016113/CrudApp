<%@page import="model.Persona"%>
<%@page import="modelDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Vista  Editar</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-5">
                <%
                    PersonaDAO nuevaPersonaDao = new PersonaDAO();
                    int IdEmpleado = Integer.parseInt((String)request.getAttribute("IdEmpleado"));
                    Persona nuevaPersona = (Persona)nuevaPersonaDao.list(IdEmpleado);
                    %>
                <h1>Modificar Empleado</h1>
                <form action="Controlador">
                    <strong>DPI:</strong> <br>
                    <input class="form-control" type="text" name="txtDPI" value="<%=nuevaPersona.getDPI() %>"><br><br>
                    <strong>Nombres:</strong> <br>
                    <input class="form-control" type="text" name="txtNombre" value="<%=nuevaPersona.getNombre() %>"><br>
                    <strong>Telefono:</strong> <br>
                    <input class="form-control" type="text" name="txtTelefono" value="<%=nuevaPersona.getTelefono() %>"><br>
                    <strong>Estado:</strong> <br>
                    <input class="form-control" type="text" name="txtEstado" value="<%=nuevaPersona.getEstado() %>"><br>
                    <strong>Users:</strong> <br>
                    <input class="form-control" type="text" name="txtUsers" value="<%=nuevaPersona.getUsers() %>"><br><br>
                    <input type="hidden" name="txtIdEmpleado" value="<%=nuevaPersona.getIdEmpleado() %>">
                    
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"><br>
                </form>
            </div>
        </div>   
    </body>
</html>
