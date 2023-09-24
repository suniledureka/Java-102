<h2>
<%
 String user = request.getParameter("txt_uid");
 pageContext.setAttribute("username", user, PageContext.APPLICATION_SCOPE);
 out.println("Hello " + user);
%>
</h2>

<a href="pageContext2.jsp">Next Page</a>