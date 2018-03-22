<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration page</title>
</head>
<body>
<form:form method="post" action="addUsr.html" commandName="user">
<table>

  <tr>
    <td><form:label path="frstname">Imię: </form:label></td>
    <td><form:input path="frstname" /></td>
  </tr>
 <tr>
 <td><form:label path="lstname">Nazwisko:</form:label></td>
 <td><form:input path="lstname"/></td>
 </tr>
  <tr>
    <td><form:label path="email">E-mail:</form:label></td>
    <td><form:input path="email"/></td>
  </tr>
  <tr>
    <td><form:label path="telno">Telefon:</form:label></td>
    <td><form:input path="telno"/></td>
  </tr>
  <tr>
  	<td colspan="2">
  		<input type="submit" value="Zarejestruj!"/>
  	</td>
  </tr>
  
</table>
</form:form>

<br>


</body>
</html>