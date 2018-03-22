<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add user</title>
</head>
<body>

<h2>User</h2>
<form:form method="post" action="addUser.html">
 
    <table>
    <tr>
        <td>First Name</td>
        <td><form:input path="firstname" /></td>
    </tr>
    <tr>
        <td><form:label path="lastname">Last Name</form:label></td>
        <td><form:input path="lastname" /></td>
    </tr>
    <tr>
        <td><form:label path="lastname">Email</form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td><form:label path="lastname">Telephone</form:label></td>
        <td><form:input path="telephone" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Add User"/>
        </td>
    </tr>
</table>      
</form:form>
 <form:form method="get" action="/wk">
 <td colspan="2">
			<input type="submit" value="Back"/>
			</td>
			</form:form>
			
			 <form:form method="get" action="pokazwyniki">
 <td colspan="2">
			<input type="submit" value="Pokaz"/>
			</td>
			</form:form>
 


</body>
</html>