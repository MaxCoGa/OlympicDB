<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.dao.SuperviseDao,com.entity.Supervise"%>  
  
<%  
String id=request.getParameter("id");  
Supervise u=SuperviseDao.getRecordById(Integer.parseInt(id));
 
%>  
  
<h1>Edit Form</h1>  
<form action="edit.jsp" method="post"> 

<input type="hidden" name="id" value="<%=u.getId() %>"/> 
<table>
<tr><td>aid:</td><td>  
<input type="text" name="aid" value="<%= u.getAid()%>"/></td></tr>
<tr><td>eid:</td><td>  
<input type="text" name="eid" value="<%= u.getEid()%>"/></td></tr>

  


<tr><td colspan="2"><input type="submit" value="Edit"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  
