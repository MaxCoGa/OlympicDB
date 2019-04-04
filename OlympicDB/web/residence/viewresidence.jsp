<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Residence</title>  
</head>  
<body>  
  
<%@page import="com.dao.ResidenceDao,com.entity.*,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>Residence List</h1>
<br/><a href="../index.jsp">index</a>  
  
<%  
List<Residence> list=ResidenceDao.getAllRecords();  
request.setAttribute("list",list);  
%>  
  <form action="search.jsp" method="post">
<tr><td>Search:</td><td>
<input name="s" size="20" value=""  type="text">
<input type="submit" value="Seach"/></td></tr>
</form>

  
<table border="1" width="90%">  
<tr><th>Id</th><th>Capacity</th><th>Adresses</th><th>Nom</th> <th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${list}" var="u">  
<tr><td>${u.getId()}</td><td>${u.getCap()}</td><td>${u.getAdr()}</td><td>${u.getPhone()}</td>  
    
<td><a href="editresidenceform.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="deleteresidence.jsp?id=${u.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<br/><a href="addresidenceform.jsp">Add New Residence</a>  
  
</body>  
</html>  