<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.dao.OfficielDao,com.entity.Officiel"%>  
  
<%  
String id=request.getParameter("id");  
Officiel u=OfficielDao.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Edit Form</h1>  
<form action="edit.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getId() %>"/>  
<table>
<tr><td>Nom:</td><td>  
<input type="text" name="nom" value="<%= u.getNom()%>"/></td></tr>

  


<tr><td colspan="2"><input type="submit" value="Edit"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  
