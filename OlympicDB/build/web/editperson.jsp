<%@page import="com.dao.PersonDao"%>  
<jsp:useBean id="u" class="com.entity.Person"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=PersonDao.update(u);  
response.sendRedirect("viewperson.jsp");  
%>  