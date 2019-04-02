<%@page import="com.dao.FacilityDao"%>  
<jsp:useBean id="u" class="com.entity.Facility"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
FacilityDao.delete(u);  
response.sendRedirect("viewfacility.jsp");  
%>  