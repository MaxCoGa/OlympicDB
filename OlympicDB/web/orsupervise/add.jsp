<%@page import="com.dao.SuperviseDao"%>  
<jsp:useBean id="u" class="com.entity.Supervise"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=SuperviseDao.save(u);  
if(i>0){  
response.sendRedirect("add-success.jsp");  
}else{  
response.sendRedirect("add-error.jsp");  
}  
%>  