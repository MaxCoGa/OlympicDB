<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.dao.PaysDao,com.entity.Pays"%>  
  
<%  
String id=request.getParameter("id");  
Pays u=PaysDao.getRecordById(id);  
%>  
  
<h1>Edit Form</h1>  
<form action="editpays.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getId() %>"/>  
<table> 
<tr><td>Id</td><td>  
<input type="text" name="id" value="<%= u.getId()%>"/></td></tr>  



<tr><td colspan="2"><input type="submit" value="Edit"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  
