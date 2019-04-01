<%@page import="com.dao.PaysDao"%>  
<jsp:useBean id="u" class="com.entity.Pays"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=PaysDao.save(u);  
if(i>0){  
response.sendRedirect("addpays-success.jsp");  
}else{  
response.sendRedirect("addpays-error.jsp");  
}  
%>  