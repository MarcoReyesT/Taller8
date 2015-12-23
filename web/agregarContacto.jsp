<%-- 
    Document   : agregarContacto
    Created on : 17-dic-2015, 0:06:57
    Author     : Eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <form class="form-horizontal" method="post" action="AgregarContacto" 
              id="formRegistroTrabajador">
            <center>
                <div class="row" >
                    <div class="col-sm-12">
                        <center>
                            <h2>
                                <b>Agregar Contacto</b>
                            </h2>
                        </center>
                    </div>
                </div>
                <div class="col-sm-8" >
                    <div class="form-group">
                        <label for="nombreContacto" class="col-sm-5 control-label">Nombre contacto:</label>
                        <div class="col-sm-7">
                            <input type="text" placeholder="nombre contacto" class="form-control" id="nombreContacto"
                                   name="nombreContacto" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="apellidoContacto" class="col-sm-5 control-label"> Apellido contacto:</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" id="apellidoContacto"
                                   placeholder="apellido contacto" name="apellidoContacto" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="telefonoContacto" class="col-sm-5 control-label">Telefono contacto:</label>
                        <div class="col-sm-7">
                            <input type="text" placeholder="telefono contacto" class="form-control" id="telefonoContacto"
                                   name="telefonoContacto" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="mailContacto" class="col-sm-5 control-label">Email contacto:</label>
                        <div class="col-sm-7">
                            <input type="text" placeholder="mail contacto" class="form-control" id="mailContacto"
                                   name="mailContacto" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="nombreEmpresa" class="col-sm-5 control-label">Nombre de la empresa:</label>
                        <div class="col-sm-7">
                            <input type="text" placeholder="nombre de la empresa" class="form-control" id="nombreEmpresa"
                                   name="nombreEmpresa" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="nombreCiudad" class="col-sm-5 control-label">Nombre de la ciudad:</label>
                        <div class="col-sm-7">
                            <input type="text" placeholder="nombre de la ciudad" class="form-control" id="nombreCiudad"
                                   name="nombreCiudad" required>
                        </div>
                    </div>
                </div>
            </center>
            <div class="row">
                <div class="col-sm-12">
                    <center><button type="submit" class="btn btn-success">Guardar</button></center>
                </div>
            </div>
        </form>
    </body>
</html>
