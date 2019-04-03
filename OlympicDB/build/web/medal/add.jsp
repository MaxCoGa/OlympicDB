<%@page import="com.dao.MedalDao"%>  
<jsp:useBean id="u" class="com.entity.Medal"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=MedalDao.save(u);  
if(i>0){  
response.sendRedirect("add-success.jsp");  
}else{  
response.sendRedirect("add-error.jsp");  
}  
%>  