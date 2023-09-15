<%@ page import="java.util.List" %><%
    List<Encuesta> encuestas = (List) request.getAttribute("encuestas");

%>




<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>AprendeJSP02</title>
</head>
<body>
<h1>Nueva Encuesta</h1>
<form method="post" action="encuestas/nueva">
    NIF: <input name="nif" type="text" size="15" maxlength="15" ><br>
    Nombre: <input name="nombre" type="text" size="15" maxlength="15" ><br>
    Apellido 1º: <input name="apellido1" type="text" size="15" maxlength="15"><br>
    <input name="btGuardar" type="submit" value="Guardar"/>
</form>

<table>
    <thead>
        <tr>
            <td>Nombre</td>
        </tr>
    </thead>
    <tbody>
    <% for(Encuesta encuesta: encuestas){%>
        <tr>
            <td><%=encuesta.getNombre()%></td>
        </tr>
    <%}%>
    </tbody>
</table>


</body>
</html>