<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Athlete</title>  
</head>  
<body>  
  
<%@page import="com.dao.AthleteDao,com.entity.*,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>Athlete List</h1>
<br/><a href="../index.jsp">index</a>  
  
<%  
List<Athlete> list=AthleteDao.getAllRecords();  
request.setAttribute("list",list);  
%>  
  
<table border="1" width="90%">  
<tr><th>Id</th><th>Prenom</th><th>Nom</th><th>Pays</th><th>Age</th><th>Adresse</th><th>Residence ID</th> <th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${list}" var="u">  
<tr><td>${u.getId()}</td><td>${u.getPnom()}</td><td>${u.getNom()}</td><td>${u.getPid()}</td><td>${u.getAge()}</td><td>${u.getAdr()}</td><td>${u.getRid()}</td> 
    
<td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="delete.jsp?id=${u.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<br/><a href="addform.jsp">Add New Athlete</a>  
  
</body>  
</html>  