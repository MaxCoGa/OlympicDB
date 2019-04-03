<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Officiel</title>  
</head>  
<body>  
  
<%@page import="com.dao.OfficielDao,com.entity.*,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>Officiel List</h1>
<br/><a href="../index.jsp">index</a>  
  
<%  
List<Officiel> list=OfficielDao.getAllRecords();  
request.setAttribute("list",list);  

%>  
  
<table border="1" width="90%">  
<tr><th>Id</th><th>Nom</th> <th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${list}" var="u">
   
                        <tr><td>${u.getId()}</td><td>${u.getNom()}</td>
     
  
    
<td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="delete.jsp?id=${u.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<br/><a href="addform.jsp">Add New Officiel</a>  
  
</body>  
</html>  