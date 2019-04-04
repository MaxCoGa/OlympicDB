<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Medal</title>  
</head>  
<body>  
  
<%@page import="com.dao.MedalDao,com.entity.*,java.util.*,com.dao.AthleteDao,com.dao.EpreuveDao,com.dao.DisciplineDao"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>Medal List</h1>
<br/><a href="../index.jsp">index</a>  
  
<%  
    String s = request.getParameter("s");
List<Medal> list=MedalDao.getQuerry(s);  
request.setAttribute("list",list);

List<Athlete> lista=AthleteDao.getAllRecords();  
request.setAttribute("lista",lista);
List<Epreuve> liste=EpreuveDao.getAllRecords();  
request.setAttribute("liste",liste);
List<Discipline> listd=DisciplineDao.getAllRecords();  
request.setAttribute("listd",listd);
%>  
    <form action="search.jsp" method="post">
<tr><td>Search:</td><td>
<input name="s" size="20" value=""  type="text">
<input type="submit" value="Seach"/></td></tr>
</form>
<table border="1" width="90%">  
<tr><th>Id</th><th>Type</th><th>Athlete</th><th>Discipline</th><th>Epreuve</th>  <th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${list}" var="u">
    <c:forEach items="${lista}" var="d">
        <c:if test="${(u.getAid() == d.getId())}" >
            <c:forEach items="${liste}" var="z">
                <c:if test="${(u.getEid() == z.getId())}" > 
                    <c:forEach items="${listd}" var="s">
                        <c:if test="${(z.getDid() == s.getId())}" > 
                        <tr><td>${u.getId()}</td><td>${u.getType()}</td><td>${d.getPnom()} ${d.getNom()} aid:${u.getAid()}</td><td>${s.getNom()}</td><td>${z.getDescr()} Eid:${u.getEid()}</td>
                            <td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="delete.jsp?id=${u.getId()}">Delete</a></td></tr> 
                        </c:if>
                        </c:forEach>
                             </c:if>
                        </c:forEach>
                             </c:if>
                        </c:forEach>
                           
                        

</c:forEach>  
</table>  
<br/><a href="addform.jsp">Add New Medal</a>  
  
</body>  
</html>  