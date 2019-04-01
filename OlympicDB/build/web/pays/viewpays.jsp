<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Pays</title>  
</head>  
<body>  
  
<%@page import="com.dao.PaysDao,com.entity.*,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>Pays List</h1>
<br/><a href="../index.jsp">index</a>  
  
<%  
List<Pays> list=PaysDao.getAllRecords();  
request.setAttribute("list",list);  
%>  
  
<table border="1" width="90%">  
<tr><th>Id</th><th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${list}" var="u">  
<tr><td>${u.getId()}</td> 
    
<td><a href="editpaysform.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="deletepays.jsp?id=${u.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<br/><a href="addpaysform.jsp">Add New Pays</a>  
  
</body>  
</html>  