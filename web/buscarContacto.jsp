<%-- 
    Document   : buscarContacto
    Created on : 17-dic-2015, 2:31:28
    Author     : Eduardo
--%>

<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="capaNegocio.Contacto" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"prefix="i"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="menu.jsp" />

        <div class="row" >
            <center>
                <h2>
                    <b>Búsqueda simple</b>
                </h2>
            </center>
        </div>
    <center>
        <form class="form-inline" method="post" action="Busqueda"
              id="formRegistroTrabajador">
            <div class="row">
                <div class="col-sm-12" >

                    <div class="form-group">
                        <div class="col-sm-7">
                            <input type="text" placeholder="Búsqueda simple" class="form-control" id="textoBusqueda" 
                                   name="textoBusqueda" >
                        </div>
                        <div class="col-sm-3">
                            <button type="submit" value="simple" name="btn_accion" class="btn btn-success">
                                <span class="glyphicon-search" aria-hidden="true"></span> Buscar</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </center>
    <center>
        <form class="form-horizontal" method="post" action="Busqueda"
              id="formRegistroTrabajador">
            <div class="row" >
                <div class="col-sm-12">
                    <center>
                        <h2>
                            <b>Búsqueda avanzada</b>
                        </h2>
                    </center>
                </div>
            </div>
            <div class="col-sm-8" >
                <div class="form-group">
                    <label for="nombre" class="col-sm-5 control-label">Nombre contacto:</label>
                    <div class="col-sm-7">
                        <input type="text" placeholder="nombre contacto" class="form-control" id="nombreContacto"
                               name="nombre">
                    </div>
                </div>
                <div class="form-group">
                    <label for="apellido" class="col-sm-5 control-label"> Apellido contacto:</label>
                    <div class="col-sm-7">
                        <input type="text" class="form-control" id="apellidoContacto"
                               placeholder="apellido contacto" name="apellido">
                    </div>
                </div>
                <div class="form-group">
                    <label for="telefono" class="col-sm-5 control-label">Telefono contacto:</label>
                    <div class="col-sm-7">
                        <input type="text" placeholder="telefono contacto" class="form-control" id="telefonoContacto"
                               name="telefono">
                    </div>
                </div>
                <div class="form-group">
                    <label for="mail" class="col-sm-5 control-label">Email contacto:</label>
                    <div class="col-sm-7">
                        <input type="text" placeholder="mail contacto" class="form-control" id="mailContacto"
                               name="mail">
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <center><button type="submit" value="avanzado" name="btn_accion" class="btn btn-success">
                            <span class="glyphicon glyphicon-search" aria-hidden="true"></span> Buscar </button></center>
                </div>
            </div>
        </form>
    </center>
    <br>
    <br>

    <center>
        <table class="table table-striped">
            <thead>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Telefono</th>
            <th>Email</th>
            </thead>
            <tbody>
            <i:forEach items="${busqueda}" var="contacto">
                <tr>
                <td>${contacto.nombre} </td>
                <td>${contacto.apellido} </td>
                <td>${contacto.telefono} </td>
                <td>${contacto.mail} </td>
                </tr>
            </i:forEach>
            </tbody>
        </table>
    </center>
</body>
</html>
