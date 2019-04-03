<%@page import="connection.LoginValidate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Please Login....</title>

<script type="text/javascript">
    function validate_required(field, alerttxt) {
        with (field) {
            if (value == null || value == "") {
                alert(alerttxt);
                return false;
            }
            else {
                return true;
            }
        }
    }

    function validate_Loginform(thisform) {
        with (thisform) {
            if (validate_required(username, "Please enter the username") == false)
            {
                username.focus();
                return false;
            }

            if (validate_required(password, "Please enter the password") == false)
            {
                password.focus();
                return false;
            }
            return true;
        }
    }
</script>
</head>
<body>


<%
 String msg = "";
 String id=request.getParameter("id");  
 String password = request.getParameter("psw");
 if(id != null && password != null && id.length() > 0 && password.length() > 0){
  LoginValidate obj = new LoginValidate();
  boolean flag = obj.validateUserLogin(Integer.parseInt(id), password);
  if(flag){
   request.getRequestDispatcher("index.jsp").forward(request, response);
  }else{
   msg = "Invalid username or password";
  }
 }
%>

 <form action="login.jsp" method="post" onsubmit="return validate_Loginform(this)">
  <table width="40%" border="1" align="center">
   <tr>
    <th colspan="2" align="center" valign="top">Please enter login details</th>
   </tr>
   <tr height="50">
    <td valign="middle" align="right">id</td>
    <td align="left"><input name="id" size="20" value=""  type="text">
    </td>
   </tr>
   <tr>
    <td valign="middle" align="right">Password</td>
    <td align="left"><input name="psw" size="20" value=""  type="password">
    </td>
   </tr>
   <tr height="40">
    <td colspan="2" align="center"><input value="Login" name="B1" type="submit"></td>
   </tr>
  </table>
  
  <br>
  <br>
  <br>
  <br>
  
  <p align="center"> <b><font color="darkred"><%=msg %></font></b></p>

 </form>
</body>
</html>