<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 	JSP -->
	<%!int i = 0;%>
	<form method="get" action="./abc123">
		<table>
			<tr>
				<td><label>Usuario</label></td>
				<td><input type="text" name="usuario"></td>
				<td><label>Clave</label></td>
				<td><input type="password" name="password"></td>
				<td><label>Empresa</label></td>
			</tr>
			<tr>
				<td><input type="submit" value="Enviar"></td>
			</tr>
		</table>
		<%
			for (i = 0; i < 10; i++) {
		%>
		<label>hola <%=i%>>
		</label>
		<%
			}
		%>
	</form>
</body>
</html>