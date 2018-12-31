<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Add employee</h1>
<form:form method="POST" action="add">
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
<td>gender:<td>

<td><form:input path="gender"/></td>
</tr>

<tr>
<td>age:<td>

<td><form:input path="age"/></td>
</tr>
<tr>
<td><input type="submit" value="Add"/></td>
</tr>

</table>
</form:form>
