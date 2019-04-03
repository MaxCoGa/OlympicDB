<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.dao.ResidenceDao,com.entity.Residence"%>  
  
<%  
String id=request.getParameter("id");  
Residence u=ResidenceDao.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Edit Form</h1>  
<form action="editresidence.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getId() %>"/>  
<table>  
<tr><td>Capacity</td><td>  
<input type="text" name="cap" value="<%= u.getCap()%>"/></td></tr>  
<tr><td>Adresses:</td><td>  
<input type="text" name="adr" value="<%= u.getAdr()%>"/></td></tr>  
<tr><td>Phone:</td><td>  
<input type="text" name="phone" value="<%= u.getPhone()%>"/></td></tr> 

<tr><td colspan="2"><input type="submit" value="Edit"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  
