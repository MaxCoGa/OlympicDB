<%@page import="com.dao.itineraireDao"%>  
<jsp:useBean id="u" class="com.entity.itineraire"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=itineraireDao.save(u);  
if(i>0){  
response.sendRedirect("add-success.jsp");  
}else{  
response.sendRedirect("add-error.jsp");  
}  
%>  