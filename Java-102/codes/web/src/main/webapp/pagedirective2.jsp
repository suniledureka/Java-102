<%@page errorPage="handler.jsp" %>
<%!
 int x = 10;
 int y = 10;
 int[] marks = new int[10];
%>
<h2>
<%
 int z = x / y;
 out.println(x + " / " + y + " = " + z + "<br>");
 out.println(marks[0]);
%>
</h2>