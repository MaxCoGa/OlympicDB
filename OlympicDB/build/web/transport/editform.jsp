<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.dao.TransportDao,com.entity.Transport"%>  
  
<%  
String id=request.getParameter("id");  
Transport u=TransportDao.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Edit Form</h1>  
<form action="edit.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getId() %>"/>  
<table>  
<tr><td>Capacity:</td><td>  
<input type="text" name="cap" value="<%= u.getCap()%>"/></td></tr>
<tr><td>Frequency:</td><td>  
<input type="text" name="freq" value="<%= u.getFreq()%>"/></td></tr> 
  


<tr><td colspan="2"><input type="submit" value="Edit"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  
