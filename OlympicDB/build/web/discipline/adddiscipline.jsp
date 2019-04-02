<%@page import="com.dao.DisciplineDao"%>  
<jsp:useBean id="u" class="com.entity.Discipline"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=DisciplineDao.save(u);  
if(i>0){  
response.sendRedirect("adddiscipline-success.jsp");  
}else{  
response.sendRedirect("adddiscipline-error.jsp");  
}  
%>  