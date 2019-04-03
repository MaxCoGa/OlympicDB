<%@page import="com.dao.EpreuveDao"%>  
<jsp:useBean id="u" class="com.entity.Epreuve"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
EpreuveDao.delete(u);  
response.sendRedirect("viewdiscipline.jsp");  
%>  