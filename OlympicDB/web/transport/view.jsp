<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Transport</title>  
</head>  
<body>  
  
<%@page import="com.dao.TransportDao,com.entity.*,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>Transport List</h1>
<br/><a href="../index.jsp">index</a>  
  
<%  
List<Transport> list=TransportDao.getAllRecords();  
request.setAttribute("list",list);  
%>  
      <form action="search.jsp" method="post">
<tr><td>Search:</td><td>
<input name="s" size="20" value=""  type="text">
<input type="submit" value="Seach"/></td></tr>
</form>
<table border="1" width="90%">  
<tr><th>Id</th><th>Capacity</th><th>Frequency</th> <th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${list}" var="u">  
<tr><td>${u.getId()}</td><td>${u.getCap()}</td><td>${u.getFreq()}</td> 
    
<td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="delete.jsp?id=${u.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<br/><a href="addform.jsp">Add New Transport</a>  
  
</body>  
</html>  