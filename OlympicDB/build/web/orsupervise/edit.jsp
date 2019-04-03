<%@page import="com.dao.SuperviseDao"%>  
<jsp:useBean id="u" class="com.entity.Supervise"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=SuperviseDao.update(u);  
response.sendRedirect("view.jsp");  
%>  