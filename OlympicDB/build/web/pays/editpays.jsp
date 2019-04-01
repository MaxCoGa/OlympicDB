<%@page import="com.dao.PaysDao"%>  
<jsp:useBean id="u" class="com.entity.Pays"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=PaysDao.update(u);  
response.sendRedirect("viewpays.jsp");  
%>  