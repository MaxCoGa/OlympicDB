<%@page import="com.dao.AthleteDao"%>  
<jsp:useBean id="u" class="com.entity.Athlete"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=AthleteDao.update(u);  
response.sendRedirect("view.jsp");  
%>  