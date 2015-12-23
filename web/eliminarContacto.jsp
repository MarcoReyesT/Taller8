<%-- 
    Document   : eliminarContacto
    Created on : 17-dic-2015, 0:28:13
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

        <div class="container">
            <div class="jumbotron">
                <form class="form-horizontal" method="post" action="EliminarContacto" 
                      id="formRegistroTrabajador">
                    <center>
                        <div class="row" >
                            <div class="col-sm-12">
                                <center>
                                    <h2>
                                        <b>Eliminar Contacto</b>
                                    </h2>
                                </center>
                            </div>
                        </div>
                        <div class="col-sm-8" >
                            <div class="form-group">
                                <label for="uidContacto" class="col-sm-5 control-label">Uid contacto:</label>
                                <div class="col-sm-7">
                                    <input type="number" placeholder="uid del contacto" class="form-control" id="uidContacto"
                                           name="uidContacto"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="uidEmpresa" class="col-sm-8 control-label">Uid de la empresa:</label>
                                <div class="col-sm-7">
                                    <input type="number" name="uidEmpresa" placeholder="uid de la empresa" class="form-control" 
                                           id="uidEmpresa"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="uidCiudad" class="col-sm-8 control-label">Uid de la ciudad:</label>
                                <div class="col-sm-7">
                                    <input type="number" name="uidCiudad" placeholder="uid de la ciudad" class="form-control" 
                                           id="uidCiudad"/>
                                </div>
                            </div>
                        </div>
                    </center>
                    <div class="row">
                        <div class="col-sm-12">
                            <center><button type="submit" class="btn btn-success">Eliminar</button></center>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>