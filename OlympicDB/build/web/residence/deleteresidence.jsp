<%@page import="com.dao.ResidenceDao"%>  
<jsp:useBean id="u" class="com.entity.Residence"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
ResidenceDao.delete(u);  
response.sendRedirect("viewresidence.jsp");  
%>  