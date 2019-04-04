<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Officiel</title>  
</head>  
<body>  
  
<%@page import="com.dao.OfficielDao,com.entity.*,java.util.*,com.dao.RefereeDao"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>Referee List</h1>
<br/><a href="../index.jsp">index</a>  
  
<%
    String s = request.getParameter("s");
List<Referee> listr=RefereeDao.getAllRecords();  
request.setAttribute("listr",listr);
List<Officiel> list=OfficielDao.getQuerry(s);  
request.setAttribute("list",list);  

%>  
   <form action="search.jsp" method="post">
<tr><td>Search:</td><td>
<input name="s" size="20" value=""  type="text">
<input type="submit" value="Seach"/></td></tr>
</form>
<table border="1" width="90%">  
<tr><th>Id</th><th>Nom</th> <th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${listr}" var="r">
   <c:forEach items="${list}" var="u">
        <c:if test="${(u.getId() == r.getId())}" >
                        <tr><td>${r.getId()}</td><td>${u.getNom()}</td>
                         <td><a href="editform.jsp?id=${r.getId()}">Edit</a></td>  
                        <td><a href="delete.jsp?id=${r.getId()}">Delete</a></td></tr>   
                        </c:if>
     </c:forEach>

                        
</c:forEach>  
</table>  
<br/><a href="addform.jsp">Add New Referee</a>  
  
</body>  
</html>  