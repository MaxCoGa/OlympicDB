<%@page import="com.dao.DisciplineDao"%>  
<jsp:useBean id="u" class="com.entity.Discipline"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
DisciplineDao.delete(u);  
response.sendRedirect("viewdiscipline.jsp");  
%>  