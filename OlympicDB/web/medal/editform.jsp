<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.dao.MedalDao,com.entity.Medal"%>  
  
<%  
String id=request.getParameter("id");  
Medal u=MedalDao.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Edit Form</h1>  
<form action="edit.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getId() %>"/>  
<table>  
<tr><td>Type:</td><td>  
<input type="text" name="type" value="<%= u.getType()%>"/></td></tr>
<tr><td>Epreuve id:</td><td>  
<input type="text" name="eid" value="<%= u.getEid()%>"/></td></tr> 
<tr><td>Athlete id:</td><td>  
<input type="text" name="aid" value="<%= u.getAid()%>"/></td></tr> 


<tr><td colspan="2"><input type="submit" value="Edit"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  
