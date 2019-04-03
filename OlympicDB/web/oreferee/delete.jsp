<%@page import="com.dao.RefereeDao"%>  
<jsp:useBean id="u" class="com.entity.Referee"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
RefereeDao.delete(u);  
response.sendRedirect("view.jsp");  
%>  