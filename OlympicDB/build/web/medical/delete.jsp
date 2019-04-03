<%@page import="com.dao.MedicalDao"%>  
<jsp:useBean id="u" class="com.entity.Medical"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
MedicalDao.delete(u);  
response.sendRedirect("view.jsp");  
%>  