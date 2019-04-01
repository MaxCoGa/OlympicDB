<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Users</title>  
</head>  
<body>  
  
<%@page import="com.dao.PersonDao,com.entity.*,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>Person List</h1>
<br/><a href="../index.jsp">index</a>  
  
<%  
List<Person> list=PersonDao.getAllRecords();  
request.setAttribute("list",list);  
%>  
  
<table border="1" width="90%">  
<tr><th>Id</th><th>Nom</th><th>Adresse</th> <th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${list}" var="u">  
<tr><td>${u.getId()}</td><td>${u.getNom()}</td><td>${u.getAdresse()}</td>  
    
<td><a href="editpersonform.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="deleteperson.jsp?id=${u.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<br/><a href="addpersonform.jsp">Add New Person</a>  
  
</body>  
</html>  