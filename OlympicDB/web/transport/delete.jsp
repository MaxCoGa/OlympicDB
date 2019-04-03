<%@page import="com.dao.TransportDao"%>  
<jsp:useBean id="u" class="com.entity.Transport"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
TransportDao.delete(u);  
response.sendRedirect("view.jsp");  
%>  