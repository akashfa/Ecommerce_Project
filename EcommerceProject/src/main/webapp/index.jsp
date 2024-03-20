<%@page import="com.Ecommerce.Factory.FactoryProvider" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
<%@include file="components/common_css_js.jsp" %>
</head>
<body>
<%@include file="components/navbar.jsp" %>
<h1>This is a Home page</h1>
<% out.println(FactoryProvider.getFactory()+"<br>");
   
   out.println(FactoryProvider.getFactory());
   %>
</body>
</html>
