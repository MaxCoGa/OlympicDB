<%@page import="com.dao.TransportDao"%>  
<jsp:useBean id="u" class="com.entity.Transport"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=TransportDao.update(u);  
response.sendRedirect("view.jsp");  
%>  