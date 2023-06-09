<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Employee List</h2>

<table border="2" width="75%" cellpadding="2">
<tr>

<th>Id</th>
<th>Employee Name</th>
<th>Employee Salary</th>
<th>Employee Designation</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach var="emp" items="${list}">
<tr>
 <td>${emp.id}</td>
  <td>${emp.empname}</td>
   <td>${emp.salary}</td>
   <td>${emp.designation}</td>
<td><a href="editEmployee/${emp.id}">Edit</a></td>
<td><a href="deleteEmployee/${emp.id}">Delete</a></td>
 
</tr>


</c:forEach>
</table>
<br/>
<br/>
<a href="empform">Add New Employee</a>

</body>
</html>