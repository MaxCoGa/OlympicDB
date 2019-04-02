<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.dao.FacilityDao,com.entity.Facility"%>  
  
<%  
String id=request.getParameter("id");  
Facility u=FacilityDao.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Edit Form</h1>  
<form action="editfacility.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getId() %>"/>  
<table>  
<tr><td>Capacity</td><td>  
<input type="text" name="capacity" value="<%= u.getCapacity()%>"/></td></tr>  
<tr><td>Adresses:</td><td>  
<input type="text" name="adresses" value="<%= u.getAdresses()%>"/></td></tr>  
<tr><td>Nom:</td><td>  
<input type="text" name="nom" value="<%= u.getNom()%>"/></td></tr> 

<tr><td colspan="2"><input type="submit" value="Edit"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  
