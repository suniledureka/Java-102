<%
 String user = request.getParameter("txt_uid");
 String pass = request.getParameter("txt_pwd");
 
 if(user.equals("admin") && pass.equals("1234")){
	 response.sendRedirect("https://edureka.co");
 }else{
	 response.sendError(response.SC_UNAUTHORIZED, "Authentication Failed!! Invalid username/ password");
 }
%>