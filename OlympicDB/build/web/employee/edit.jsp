<%@page import="com.dao.EmployeeDao"%>  
<jsp:useBean id="u" class="com.entity.Employee"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=EmployeeDao.update(u);  
response.sendRedirect("view.jsp");  
%>  