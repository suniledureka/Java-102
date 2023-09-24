<h2>
<%
 //String user = request.getParameter("txt_uid");
 String user = pageContext.getAttribute("username", PageContext.APPLICATION_SCOPE).toString();
 out.println("Hello " + user);
%>
</h2>