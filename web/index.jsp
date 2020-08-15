<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/15
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<a href="springmvc/testRequestAPI">TestRequestAPI</a><br/>
<form method="post" action="">
    username:<input name="username" type="text"><br/>
    password:<input name="password" type="password"><br/>
    age:<input name="age" type="text"><br/>
    email:<input name="email" type="email"><br/>
    city:<input name="address.city" type="text"><br/>
    province:<input name="address.province" type="text"><br/>
    <input type="submit" value="submit"><br/>
</form>
<a href="springmvc/testCookieValue">Test Cookie Value</a>
<a href="springmvc/testRequestParam?username=shen&age=22">TestRequestParam</a><br/>
<a href="springmvc/testRequestHeader">TestRequestHeader</a><br/>

<form method="post" action="springmvc/testRest/1">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="Test Rest PUT">
</form>
<form method="post" action="springmvc/testRest/1">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="Test Rest DELETE">
</form>
<form method="post" action="springmvc/testRest/1">
    <input type="hidden" name="_method" value="POST">
    <input type="submit" value="Test Rest POST">
</form>
<a href="springmvc/testRest/1">Test Rest Get</a><br/>
<a href="springmvc/testPathVariable/1">testPathVariable</a><br/>
<a href="springmvc/testAntPath/gjewljdsgjkl/abc">TestAntPath</a><br/>
<a href="springmvc/testParamsAndHeaders?username=shen&age=11">TestParamsAndHeaders</a><br/>
<form method="post" action="springmvc/testMethod">
    <input type="submit" value="submit">
</form>
<br/>
<a href="helloworld">Hello World</a>
<a href="springmvc/test">testRequestMapping</a>
<a href="springmvc/testMethod">testRequestMethod</a>
</body>
</html>
