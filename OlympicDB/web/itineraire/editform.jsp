<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.dao.itineraireDao,com.entity.itineraire"%>  
  
<%  
String id=request.getParameter("id");  
itineraire u=itineraireDao.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Edit Form</h1>  
<form action="edit.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getId() %>"/>  
<table>
<tr><td>Transport id:</td><td>  
<input type="text" name="tid" value="<%= u.getTid()%>"/></td></tr>
<tr><td>To:</td><td>  
<input type="text" name="tof" value="<%= u.getTof()%>"/></td></tr>
<tr><td>From:</td><td>  
<input type="text" name="fromf" value="<%= u.getFromf()%>"/></td></tr> 
  


<tr><td colspan="2"><input type="submit" value="Edit"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  
