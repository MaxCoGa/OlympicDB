<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.dao.EpreuveDao,com.entity.Epreuve"%>  
  
<%  
String id=request.getParameter("id");  
Epreuve u=EpreuveDao.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Edit Form</h1>  
<form action="editdiscipline.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getId() %>"/>  
<table>  
<tr><td>Discipline id:</td><td>  
<input readonly="readonly" type="text" name="did" value="<%= u.getDid()%>"/></td></tr>
<tr><td>Description:</td><td>  
<input type="text" name="descr" value="<%= u.getDescr()%>"/></td></tr> 



<tr><td colspan="2"><input type="submit" value="Edit"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  
