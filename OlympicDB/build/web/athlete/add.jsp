<%@page import="com.dao.AthleteDao"%>  
<jsp:useBean id="u" class="com.entity.Athlete"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=AthleteDao.save(u);  
if(i>0){  
response.sendRedirect("add-success.jsp");  
}else{  
response.sendRedirect("add-error.jsp");  
}  
%>  