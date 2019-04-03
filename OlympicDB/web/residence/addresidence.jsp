<%@page import="com.dao.ResidenceDao"%>  
<jsp:useBean id="u" class="com.entity.Residence"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=ResidenceDao.save(u);  
if(i>0){  
response.sendRedirect("addresidence-success.jsp");  
}else{  
response.sendRedirect("addresidence-error.jsp");  
}  
%>  