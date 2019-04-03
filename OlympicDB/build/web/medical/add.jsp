<%@page import="com.dao.MedicalDao"%>  
<jsp:useBean id="u" class="com.entity.Medical"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=MedicalDao.save(u);  
if(i>0){  
response.sendRedirect("add-success.jsp");  
}else{  
response.sendRedirect("add-error.jsp");  
}  
%>  