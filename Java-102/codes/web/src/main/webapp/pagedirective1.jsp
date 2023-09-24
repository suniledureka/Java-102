<%@page import="java.util.Date" info="JSP Page Directive Example!!" language="java"  %>
<p style="text-align:center; font-size:40px;color:blue">
<%
 Date today = new Date();
 out.println(today);
 out.println("<br><br>");
 out.println(getServletInfo());
%>
</p>