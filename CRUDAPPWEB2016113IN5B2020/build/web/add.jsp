<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Pagina Agregar</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-5">
                <h1>Agregar Registro</h1>
                <form action = "Controlador">
                    DPI:<br>
                    <input class="form-control" type = "text" name = "txtDPI"> <br>
                    Nombres:<br>
                    <input class="form-control" type = "text" name = "txtNombre"> <br>
                    Telefono:<br>
                    <input class="form-control" type = "text" name = "txtTelefono"> <br>
                    Estado:<br>
                    <input class="form-control" type = "text" name = "txtEstado"> <br>
                    Users:<br>
                    <input class="form-control" type = "text" name = "txtUsers"> <br><br>
                    <input class="btn btn-primary" type ="submit" name="accion" value="Agregar"><br>
                </form>
            </div>
        </div>
    </body>
</html>