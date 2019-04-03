<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.dao.MedicalDao,com.entity.Medical"%>  
  
<%  
String id=request.getParameter("id");  
Medical u=MedicalDao.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Edit Form</h1>  
<form action="edit.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getId() %>"/>  
<table>  
<tr><td>Nom:</td><td>  
<input type="text" name="nom" value="<%= u.getNom()%>"/></td></tr>
<tr><td>Description:</td><td>  
<input type="text" name="descr" value="<%= u.getDescr()%>"/></td></tr> 
<tr><td>Phone:</td><td>  
<input type="text" name="phone" value="<%= u.getPhone()%>"/></td></tr> 
<tr><td>Adresse:</td><td>  
<input type="text" name="adr" value="<%= u.getAdr()%>"/></td></tr>  


<tr><td colspan="2"><input type="submit" value="Edit"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  
