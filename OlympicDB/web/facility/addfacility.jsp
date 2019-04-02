<%@page import="com.dao.FacilityDao"%>  
<jsp:useBean id="u" class="com.entity.Facility"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=FacilityDao.save(u);  
if(i>0){  
response.sendRedirect("addfacility-success.jsp");  
}else{  
response.sendRedirect("addfacility-error.jsp");  
}  
%>  