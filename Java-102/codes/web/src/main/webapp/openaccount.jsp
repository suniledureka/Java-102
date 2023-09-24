<jsp:useBean id="acc" class="co.edureka.web.models.Account"></jsp:useBean>
<h2>
<jsp:setProperty property="*" name="acc"/>

A/C No: <jsp:getProperty property="accountNo" name="acc"/>
<br>
Name: <jsp:getProperty property="accountName" name="acc"/>
<br>
Balance: <jsp:getProperty property="accountBal" name="acc"/>
</h2>