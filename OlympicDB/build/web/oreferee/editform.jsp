<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.dao.RefereeDao,com.entity.Referee,com.dao.OfficielDao,com.entity.Officiel"%>  
  
<%  
String id=request.getParameter("id");  
Referee u=RefereeDao.getRecordById(Integer.parseInt(id));
Officiel o=OfficielDao.getRecordById(Integer.parseInt(id)); 
%>  
  
<h1>Edit Form</h1>  
<form action="edit.jsp" method="post"> 

<input type="hidden" name="id" value="<%=o.getId() %>"/> 
<table>
<tr><td>Nom:</td><td>  
<input type="text" name="nom" value="<%= o.getNom()%>"/></td></tr>

  


<tr><td colspan="2"><input type="submit" value="Edit"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  
