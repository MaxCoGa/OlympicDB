<%@page import="com.dao.DisciplineDao"%>  
<jsp:useBean id="u" class="com.entity.Discipline"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=DisciplineDao.update(u);  
response.sendRedirect("viewdiscipline.jsp");  
%>  