<%!
 String companyName = "edureka limited";

 public int add(int a, int b){
	 return a+b;
 }
%>
<h2>
My Company Name = <%=companyName %>
<br><br>
<%="Sum = " + add(12,45) %>
</h2>