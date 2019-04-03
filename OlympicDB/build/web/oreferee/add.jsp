<%@page import="com.dao.RefereeDao"%>  
<jsp:useBean id="u" class="com.entity.Referee"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=RefereeDao.save(u);  
if(i>0){  
response.sendRedirect("add-success.jsp");  
}else{  
response.sendRedirect("add-error.jsp");  
}  
%>  