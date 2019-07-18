<%--
  Created by IntelliJ IDEA.
  User: nguyenha265
  Date: 18/07/2019
  Time: 09:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="post" action="/index">
    <h2><P>NameProducts</P></h2>
    <input type="text" id="nameProducts" name="nameProducts" /><br/>
    <h2><P>PriceProducts</P></h2>
    <input type="text" id="priceProducts" name="priceProducts" /><br/>
    <h2><P>Discount</P></h2>
    <input type="text" id="discount" name="discount" placeholder="%" /><br/>
    <h2><P>Amount</P></h2>
    <input type="text" id="amount" name="amount" value="1"/><br/>
    <input type="submit" id="submit" value="Calculate Discount"/>
</form>
</body>
</html>
