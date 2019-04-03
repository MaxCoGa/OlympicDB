<%@page import="com.dao.OfficielDao"%>  
<jsp:useBean id="u" class="com.entity.Officiel"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=OfficielDao.save(u);  
if(i>0){  
response.sendRedirect("add-success.jsp");  
}else{  
response.sendRedirect("add-error.jsp");  
}  
%>  