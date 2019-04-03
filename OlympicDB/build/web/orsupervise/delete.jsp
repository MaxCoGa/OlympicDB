<%@page import="com.dao.SuperviseDao"%>  
<jsp:useBean id="u" class="com.entity.Supervise"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
SuperviseDao.delete(u);  
response.sendRedirect("view.jsp");  
%>  