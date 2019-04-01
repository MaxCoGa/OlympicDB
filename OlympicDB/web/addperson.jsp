<%@page import="com.dao.PersonDao"%>  
<jsp:useBean id="u" class="com.entity.Person"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=PersonDao.save(u);  
if(i>0){  
response.sendRedirect("addperson-success.jsp");  
}else{  
response.sendRedirect("addperson-error.jsp");  
}  
%>  