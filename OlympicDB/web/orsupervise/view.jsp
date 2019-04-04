<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Supervise</title>  
</head>  
<body>  
  
<%@page import="com.dao.SuperviseDao,com.entity.*,java.util.*,com.dao.AthleteDao,com.dao.EpreuveDao,com.dao.DisciplineDao,com.dao.RefereeDao,com.dao.OfficielDao"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>Supervise List</h1>
<br/><a href="../index.jsp">index</a>  
  
<%
List<Supervise> lists=SuperviseDao.getAllRecords();  
request.setAttribute("lists",lists);
List<Athlete> lista=AthleteDao.getAllRecords();  
request.setAttribute("lista",lista);

List<Epreuve> liste=EpreuveDao.getAllRecords();  
request.setAttribute("liste",liste);
List<Discipline> listd=DisciplineDao.getAllRecords();  
request.setAttribute("listd",listd);

List<Referee> listr=RefereeDao.getAllRecords();  
request.setAttribute("listr",listr);
List<Officiel> listo=OfficielDao.getAllRecords();  
request.setAttribute("listo",listo); 
 

%>  
     <form action="search.jsp" method="post">
<tr><td>Search:</td><td>
<input name="r" size="20" value=""  type="text">
<input type="submit" value="Referee"/></td>
<input name="a" size="20" value=""  type="text">
<input type="submit" value="Athlete"/></td>
</form>
<table border="1" width="90%">  
<tr><th>Referee</th><th>Athlete</th> <th>Epreuve</th><th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${lists}" var="s">
    <c:forEach items="${lista}" var="a">
        <c:if test="${(s.getAid() == a.getId())}" >
            <c:forEach items="${liste}" var="e">
                <c:if test="${(s.getEid() == e.getId())}" >
                    <c:forEach items="${listd}" var="d">
                        <c:if test="${(e.getDid() == d.getId())}" >
                            <c:forEach items="${listr}" var="r">
                                <c:if test="${(s.getId() == r.getId())}" >
                                    <c:forEach items="${listo}" var="o">
                                        <c:if test="${(r.getId() == o.getId())}" >
    
                                            <tr><td>${o.getNom()}</td><td>${a.getPnom()} ${a.getNom()}</td><td>${d.getNom()} ${e.getDescr()}</td>
                                             <td><a href="editform.jsp?id=${s.getId()}">Edit</a></td>  
                                            <td><a href="delete.jsp?id=${s.getId()}">Delete</a></td></tr>
                                            </c:if>
                                            </c:forEach>
                                             </c:if>
                                            </c:forEach>
                                             </c:if>
                                            </c:forEach>
                                             </c:if>
                                            </c:forEach>
                                             </c:if>
                                            </c:forEach>
                                            
                        
 
                        
</c:forEach>  
</table>  
<br/><a href="addform.jsp">Add New Supervise</a>  
  
</body>  
</html>  