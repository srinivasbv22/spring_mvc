<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<body>
<table>
<p>
hello
</p>
<tr>
<td>${emp.eid}</td>
<td>${emp.name}</td>
<td>${emp.email}</td>
<td>${emp.gender}</td>
<td>${emp.age}</td>
</tr>
</table>
</body>
</html>