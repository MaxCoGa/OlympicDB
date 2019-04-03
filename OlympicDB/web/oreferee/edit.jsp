<%@page import="com.dao.OfficielDao"%>  
<jsp:useBean id="u" class="com.entity.Officiel"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=OfficielDao.update(u);  
response.sendRedirect("view.jsp");  
%>  