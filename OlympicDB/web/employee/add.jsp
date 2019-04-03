<%@page import="com.dao.EmployeeDao"%>  
<jsp:useBean id="u" class="com.entity.Employee"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=EmployeeDao.save(u);  
if(i>0){  
response.sendRedirect("add-success.jsp");  
}else{  
response.sendRedirect("add-error.jsp");  
}  
%>  