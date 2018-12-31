<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>display employee</h1>
<form:form method="GET" action="displayby">
<table>
<tr>
<td></td>
<td>ID:</td>
<td><form:input path="eid"/></td>
</tr>
<tr>
<td>
</td>
<td><input type="submit" value="Submit"/></td>
</tr>
</table>
</form:form>