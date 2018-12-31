<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Update employee</h1>
<form:form method="GET" action="update">
<table>
<tr>
<td>id:<td>

<td> <form:input path="eid"/></td>
</tr>
<tr>
<td>Name:<td>

<td><form:input path="name"/></td>
</tr>

<tr>
<td>email:<td>

<td><form:input path="email"/></td>
</tr>


<tr>
<td><input type="submit" value="Submit"/></td>
</tr>

</table>
</form:form>
