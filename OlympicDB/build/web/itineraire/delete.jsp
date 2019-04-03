<%@page import="com.dao.itineraireDao"%>  
<jsp:useBean id="u" class="com.entity.itineraire"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
itineraireDao.delete(u);  
response.sendRedirect("view.jsp");  
%>  