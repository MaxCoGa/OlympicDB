<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.dao.EmployeeDao,com.entity.Employee"%>  
  
<%  
String id=request.getParameter("id");  
Employee u=EmployeeDao.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Edit Form</h1>  
<form action="edit.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getId() %>"/>  
<table>  
<tr><td>Password:</td><td>  
<input type="text" name="psw" value="<%= u.getPsw()%>"/></td></tr>
<tr><td>Prenom:</td><td>  
<input type="text" name="pnom" value="<%= u.getPnom()%>"/></td></tr> 
<tr><td>Nom:</td><td>  
<input type="text" name="nom" value="<%= u.getNom()%>"/></td></tr> 
<tr><td>Phone:</td><td>  
<input type="text" name="phone" value="<%= u.getPhone()%>"/></td></tr>
<tr><td>Adresse:</td><td>  
<input type="text" name="adr" value="<%= u.getAdr()%>"/></td></tr>
<tr><td>Residence ID:</td><td>  
<input type="text" name="rid" value="<%= u.getRid()%>"/></td></tr> 


<tr><td colspan="2"><input type="submit" value="Edit"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  
