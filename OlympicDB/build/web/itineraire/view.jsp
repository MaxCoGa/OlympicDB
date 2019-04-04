<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View itineraire</title>  
</head>  
<body>  
  
<%@page import="com.dao.itineraireDao,com.entity.*,java.util.*,com.dao.FacilityDao"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>itineraire List</h1>
<br/><a href="../index.jsp">index</a>  
  
<%  
List<itineraire> list=itineraireDao.getAllRecords();  
request.setAttribute("list",list);  
List<Facility> listf=FacilityDao.getAllRecords();  
request.setAttribute("listf",listf); 
%>  
  <form action="search.jsp" method="post">
<tr><td>Search:</td><td>
<input name="s" size="20" value=""  type="text">
<input type="submit" value="Seach"/></td></tr>
</form>
  
<table border="1" width="90%">  
<tr><th>Id</th><th>Transport id</th><th>To</th><th>From</th> <th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${list}" var="u">
    <c:forEach items="${listf}" var="d">
        <c:if test="${(u.getTof() == d.getId())}" >
            <c:forEach items="${listf}" var="z">
                <c:if test="${(u.getFromf() == z.getId())}" >
                        <tr><td>${u.getId()}</td><td>${u.getTid()}</td><td>${d.getNom()}</td><td>${z.getNom()}</td>
                </c:if>
            </c:forEach>
            
        </c:if>
    </c:forEach>
    
<td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="delete.jsp?id=${u.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<br/><a href="addform.jsp">Add New Transport</a>  
  
</body>  
</html>  