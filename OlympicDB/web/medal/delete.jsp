<%@page import="com.dao.MedalDao"%>  
<jsp:useBean id="u" class="com.entity.Medal"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
MedalDao.delete(u);  
response.sendRedirect("view.jsp");  
%>  