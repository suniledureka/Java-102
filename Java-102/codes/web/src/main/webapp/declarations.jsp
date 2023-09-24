<%!
 String companyName = "edureka limited";

 public int add(int a, int b){
	 return a+b;
 }
%>
<h2>
<%
 out.println("My Company Name = " + companyName + "<br>");
 out.println("sum = " + add(12,34));
%>
</h2>