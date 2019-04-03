<%@page import="com.dao.TransportDao"%>  
<jsp:useBean id="u" class="com.entity.Transport"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=TransportDao.save(u);  
if(i>0){  
response.sendRedirect("add-success.jsp");  
}else{  
response.sendRedirect("add-error.jsp");  
}  
%>  