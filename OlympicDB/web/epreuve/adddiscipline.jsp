<%@page import="com.dao.EpreuveDao"%>  
<jsp:useBean id="u" class="com.entity.Epreuve"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=EpreuveDao.save(u);  
if(i>0){  
response.sendRedirect("adddiscipline-success.jsp");  
}else{  
response.sendRedirect("adddiscipline-error.jsp");  
}  
%>  