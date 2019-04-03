<%@page import="com.dao.EmployeeDao"%>
<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Epreuve</title>  
</head>  
<body>  
  
<%@page import="com.dao.EpreuveDao,com.entity.*,java.util.*,com.dao.DisciplineDao"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>Epreuve List</h1>
<br/><a href="../index.jsp">index</a>  
  
<%  
List<Epreuve> list=EpreuveDao.getAllRecords();  
request.setAttribute("list",list);
List<Discipline> listd=DisciplineDao.getAllRecords();  
request.setAttribute("listd",listd);
%>  
  
<table border="1" width="90%">  
<tr><th>Epreuve id</th><th>Discipline id</th><th>Discipline nom</th><th>Description</th> <th>Edit</th><th>Delete</th></tr>
<c:forEach items="${list}" var="u" >


<c:forEach items="${listd}" var="d" >
    <c:if test="${(u.getDid() == d.getId())}" >
            <tr><td>${u.getId()}</td><td>${u.getDid()}</td><td>${d.getNom()}</td><td>${u.getDescr()}</td>
        </c:if>
</c:forEach>

    
<td><a href="editdisciplineform.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="deletediscipline.jsp?id=${u.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<br/><a href="adddisciplineform.jsp">Add New Epreuve</a>  
  
</body>  
</html>  